package net.minecraftforge.client;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import static net.minecraft.util.text.TextFormatting.*;

/**
 * The class that handles client-side chat commands. You should register any
 * commands that you want handled on the client with this command handler.
 *
 * If there is a command with the same name registered both on the server and
 * client, the client takes precedence!
 *
 */
public class ClientCommandHandler extends CommandHandler
{
    public static final ClientCommandHandler instance = new ClientCommandHandler();

    public String[] latestAutoComplete = null;

    /**
     * @return 1 if successfully executed, -1 if no permission or wrong usage,
     *         0 if it doesn't exist or it was canceled (it's sent to the server)
     */
    /**
     * Attempt to execute a command. This method should return the number of times that the command was executed. If the
     * command does not exist or if the player does not have permission, 0 will be returned. A number greater than 1 can
     * be returned if a player selector is used.
     */
    @Override
    public int executeCommand(ICommandSender sender, String message)
    {
        message = message.trim();

        if (message.startsWith("/"))
        {
            message = message.substring(1);
        }

        String[] temp = message.split(" ");
        String[] args = new String[temp.length - 1];
        String commandName = temp[0];
        System.arraycopy(temp, 1, args, 0, args.length);
        ICommand icommand = getCommands().get(commandName);

        try
        {
            if (icommand == null)
            {
                return 0;
            }

            if (icommand.checkPermission(this.getServer(), sender))
            {
                CommandEvent event = new CommandEvent(icommand, sender, args);
                if (MinecraftForge.EVENT_BUS.post(event))
                {
                    if (event.getException() != null)
                    {
                        throw event.getException();
                    }
                    return 0;
                }

                this.tryExecute(sender, args, icommand, message);
                return 1;
            }
            else
            {
                sender.addChatMessage(format(RED, "commands.generic.permission"));
            }
        }
        catch (WrongUsageException wue)
        {
            sender.addChatMessage(format(RED, "commands.generic.usage", format(RED, wue.getMessage(), wue.getErrorObjects())));
        }
        catch (CommandException ce)
        {
            sender.addChatMessage(format(RED, ce.getMessage(), ce.getErrorObjects()));
        }
        catch (Throwable t)
        {
            sender.addChatMessage(format(RED, "commands.generic.exception"));
            t.printStackTrace();
        }

        return -1;
    }

    //Couple of helpers because the mcp names are stupid and long...
    private TextComponentTranslation format(TextFormatting color, String str, Object... args)
    {
        TextComponentTranslation ret = new TextComponentTranslation(str, args);
        ret.getChatStyle().setColor(color);
        return ret;
    }

    public void autoComplete(String leftOfCursor)
    {
        latestAutoComplete = null;

        if (leftOfCursor.charAt(0) == '/')
        {
            leftOfCursor = leftOfCursor.substring(1);

            Minecraft mc = FMLClientHandler.instance().getClient();
            if (mc.currentScreen instanceof GuiChat)
            {
                List<String> commands = getTabCompletionOptions(mc.thePlayer, leftOfCursor, mc.thePlayer.getPosition());
                if (commands != null && !commands.isEmpty())
                {
                    if (leftOfCursor.indexOf(' ') == -1)
                    {
                        for (int i = 0; i < commands.size(); i++)
                        {
                            commands.set(i, GRAY + "/" + commands.get(i) + RESET);
                        }
                    }
                    else
                    {
                        for (int i = 0; i < commands.size(); i++)
                        {
                            commands.set(i, GRAY + commands.get(i) + RESET);
                        }
                    }

                    latestAutoComplete = commands.toArray(new String[commands.size()]);
                }
            }
        }
    }

    @Override
    protected MinecraftServer getServer() {
        return Minecraft.getMinecraft().getIntegratedServer();
    }
}