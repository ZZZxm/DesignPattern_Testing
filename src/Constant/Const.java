package Constant;


public class Const
{
    // 工人类型
    public enum WorkerType
    {
        KEEPER, PRODUCER, PACKAGER
    }

    // 工人工作地点
    public enum WorkPlace
    {
        WAREHOUSE, WORKSHOP, PACK_ROOM
    }

    public enum IngredientType
    {
        LIQUOR,
        FAT,
        POWDER,
        SUGAR,
        MILK
    }

    // 食堂类型
    public enum CanteenType
    {
        GENERAL,       // 普通
        HALAL,         // 清真
        VEGETARIAN     // 素食
    }

    public static final String[] CHOCOLATE_STATE = {"待处理", "已烘焙", "已精炼", "已冷却", "已切割", "成品"};

    // 每种工人的数量
    public static final int EACH_TYPE_NUM = 4;

    //机器的名字
    public final static String BLACK_BAKING = "BlackBaking";
    public final static String WHITE_BAKING = "WhiteBaking";
    public final static String BLACK_REFINE = "BlackRefine";
    public final static String WHITE_REFINE = "WhiteRefine";
    public final static String BLACK_COOLING = "BlackCooling";
    public final static String WHITE_COOLING = "WhiteCooling";
    public final static String BLACK_CUTTING = "BlackCutting";
    public final static String WHITE_CUTTING = "WhiteCutting";
    public final static String BLACK_INIT = "Blackinit";
    public final static String WHITE_INIT = "Whiteinit";


    //原料包种类
    public final static String BLACK_PACKAGE = "黑巧克力原料包";
    public final static String WHITE_PACKAGE = "白巧克力原料包";


    //巧克力颜色
    public final static String BLACK = "Black";
    public final static String WHITE = "White";

    //巧克力形状
    public final static String BAR = "Bar";
    public final static String PIECE = "Piece";

    //巧克力价格
    public final static double BLACK_MONEY = 20.0;
    public final static double WHITE_MONEY = 10.0;


}
