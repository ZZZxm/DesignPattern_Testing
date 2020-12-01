package Multiton;

import Constant.Const.CanteenType;

import java.util.Map;
import java.util.HashMap;

/**
 * 食堂
 *
 * @author du mei
 * @function 去食堂用餐
 * @pattern Multiton, Lazy initialization
 */
public class Canteen
{

    private static final Map<CanteenType, Canteen> instances = new HashMap<>();

    private final CanteenType type; //食堂类型

    /**
     * 创建食堂
     *
     * @param type 食堂类型
     */
    private Canteen(CanteenType type)
    {
        this.type = type;
    }

    /**
     * 访问食堂实例
     *
     * @param type 食堂类型
     * @return 食堂实例
     */
    public static Canteen getInstance(CanteenType type)
    {
        System.out.println(
                "========== 使用多例 Multiton 模式 ===========\n" +
                        "类名：Canteen\n" +
                        "模式：Multiton\n" +
                        "方法名：Canteen.getInstance()\n" +
                        "功能描述：全局唯一的餐厅实例，含普通、清真、素食餐厅\n" +
                        "==========================================");
        if (!instances.containsKey(type))
        {
            String str_type;
            switch (type)
            {
                case GENERAL:
                    str_type = "普通食堂";
                    break;
                case HALAL:
                    str_type = "清真食堂";
                    break;
                case VEGETARIAN:
                    str_type = "素食食堂";
                    break;
                default:
                    str_type = "---类型错误---";
                    break;
            }
            System.out.println(
                    "==== 延迟初始化 Lazy Initialization 模式 ====\n" +
                            "类名：Canteen\n" +
                            "模式：Lazy Initialization\n" +
                            "方法名：Canteen.getInstance()\n" +
                            "功能描述：第一次使用 " + str_type + " 初始化实例\n" +
                            "==========================================");
            Canteen instance = new Canteen(type);
            instances.put(type, instance);
        }
        return instances.get(type);
    }

    /**
     * 进入食堂
     */
    public void enterCanteen()
    {
        System.out.println("\n请求进入食堂就餐");
        Canteen.getInstance(this.type);
        System.out.println("成功进入食堂：");
        switch (this.type)
        {
            case GENERAL:
                System.out.print("普通食堂\n");
                break;
            case HALAL:
                System.out.print("清真食堂\n");
                break;
            case VEGETARIAN:
                System.out.print("素食食堂\n");
                break;
            default:
                System.out.print("---错误类型---\n");
                break;
        }
    }
}
