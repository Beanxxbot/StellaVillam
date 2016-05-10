package info.beanbot.stellavillam.items;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems
{
    public static Item copperIngot;
    public static Item iridiumIngot;
    public static Item refinedQuartz;

    //Foods
    public static Item foodCauliflower;
    public static Item foodGarlic;
    public static Item foodGreenBean;
    public static Item foodKale;
    public static Item foodParsnip;
    public static Item foodRhubarb;
    public static Item foodStrawberry;
    public static Item foodBlueberry;
    public static Item foodCorn;
    public static Item foodHotPepper;
    public static Item foodRadish;
    public static Item foodRedCabbage;
    public static Item foodStarfruit;
    public static Item foodTomato;
    public static Item foodArtichoke;
    public static Item foodBokChoy;
    public static Item foodCranberries;
    public static Item foodEggplant;
    public static Item foodGrape;
    public static Item foodYam;
    public static Item foodSweetGemBerry;
    public static Item foodAncientFruit;

    //Meals
    public static Item mealArtichokeDip;
    public static Item cheese;
    public static Item autumnsBounty;
    public static Item beanHotpot;
    public static Item blackberryCobbler;
    public static Item blueberryTart;
    public static Item bruschetta;
    public static Item cranberryCanyd;
    public static Item eggplanParmesan;
    public static Item friedEgg;
    public static Item iceCream;
    public static Item omelet;
    public static Item pepperPoppers;
    public static Item pinkCake;
    public static Item pizza;
    public static Item pumpkinSoup;
    public static Item redPlate;
    public static Item rhubarbPie;
    public static Item spaghetti;
    public static Item superMeal;
    public static Item torilla;
    public static Item vegetableMedley;

    public static void createItems()
    {
        GameRegistry.registerItem(copperIngot = new ItemBase("copperIngot"), "copperIngot");
        GameRegistry.registerItem(iridiumIngot = new ItemBase("iridiumIngot"), "iridiumIngot");
        GameRegistry.registerItem(refinedQuartz = new ItemBase("refinedQuartz"), "refinedQuartz");

        GameRegistry.registerItem(cheese = new ItemFoodBase("cheese", 4, 0.4f, false), "cheese");
        GameRegistry.registerItem(mealArtichokeDip = new ItemFoodBase("artichokeDip", 6, 0.8f, false), "artichokeDip");
        GameRegistry.registerItem(autumnsBounty = new ItemFoodBase("autumnsBounty", 10, 1.6f, false), "autumnsBounty");
        GameRegistry.registerItem(beanHotpot = new ItemFoodBase("beanHotpot", 6, 0.8f, false), "beanHotpot");
        //GameRegistry.registerItem(blackberryCobbler = new ItemFoodBase("blackberryCobbler", 10, 1.2f, false), "blackberryCobbler");
        GameRegistry.registerItem(blueberryTart = new ItemFoodBase("blueberryTart", 10, 1.2f, false), "blueberryTart");

        GameRegistry.registerItem(foodCauliflower = new ItemFoodBase("cauliflower", 2, 0.2f, false), "cauliflower");
        GameRegistry.registerItem(foodGarlic = new ItemFoodBase("garlic", 2, 0.2f, false), "garlic");
        GameRegistry.registerItem(foodGreenBean = new ItemFoodBase("greenBean", 4, 0.4f, false), "greenBean");
        GameRegistry.registerItem(foodKale = new ItemFoodBase("kale", 5, 0.5f, false), "kale");
        GameRegistry.registerItem(foodParsnip = new ItemFoodBase("parsnip", 4, 0.4f, false), "parsnip");
        GameRegistry.registerItem(foodRhubarb = new ItemFoodBase("rhubarb", 4, 0.4f, false), "rhubarb");
        GameRegistry.registerItem(foodStrawberry = new ItemFoodBase("strawberry", 2, 0.2f, false), "strawberry");
        GameRegistry.registerItem(foodBlueberry = new ItemFoodBase("blueberry", 2, 0.2f, false), "blueberry");
        GameRegistry.registerItem(foodCorn = new ItemFoodBase("corn", 6, 0.6f, false), "corn");
        GameRegistry.registerItem(foodHotPepper = new ItemFoodBase("hotPepper", 3, 0.3f, false), "hotPepper");
        GameRegistry.registerItem(foodRadish = new ItemFoodBase("radish", 2, 0.2f, false), "radish");
        GameRegistry.registerItem(foodRedCabbage = new ItemFoodBase("redCabbage", 4, 0.4f, false), "redCabbage");
        GameRegistry.registerItem(foodStarfruit = new ItemFoodBase("starfruit", 6, 0.6f, false), "starfruit");
        GameRegistry.registerItem(foodTomato = new ItemFoodBase("tomato", 4, 0.4f, false), "tomato");
        GameRegistry.registerItem(foodArtichoke = new ItemFoodBase("artichoke", 4, 0.4f, false), "artichoke");
        GameRegistry.registerItem(foodBokChoy = new ItemFoodBase("bokChoy", 4, 0.4f, false), "bokChoy");
        GameRegistry.registerItem(foodCranberries = new ItemFoodBase("cranberries", 2, 0.2f, false), "cranberries");
        GameRegistry.registerItem(foodEggplant = new ItemFoodBase("eggplant", 4, 0.4f, false), "eggplant");
        GameRegistry.registerItem(foodGrape = new ItemFoodBase("grape", 2, 0.2f, false), "grape");
        GameRegistry.registerItem(foodYam = new ItemFoodBase("yam", 4, 0.4f, false), "yam");
        GameRegistry.registerItem(foodSweetGemBerry = new ItemFoodBase("sweetGemBerry", 6, 1.0f, false), "sweetGemBerry");
        GameRegistry.registerItem(foodAncientFruit = new ItemFoodBase("ancientFruit", 8, 1.2f, false), "ancientFruit");
    }
}
