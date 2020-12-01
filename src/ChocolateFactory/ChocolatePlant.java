package ChocolateFactory;

import java.io.Serializable;
import java.util.Iterator;

import Constant.Const;
import Ingredient.Ingredient;
import Mediator.ingredientMediator;
import Servant.IUpgradeServiced;

/**
 * 巧克力加工厂类
 *
 * @author du mei, lv ziyuan
 * @function 初始化加工厂，工厂理财
 * @pattern Singleton, Lazy Initialization
 */
public class ChocolatePlant implements Serializable, IUpgradeServiced, MoneyManager
{

    private double area; //工厂面积

    private double money;//工厂账户

    private final Menu<Ingredient> ingredientMenu;
    protected ingredientMediator ingredientMediator;

    public Menu<Ingredient> getIngredientMenu()
    {
        return ingredientMenu;
    }

    /**
     * 私有构造函数
     */
    private ChocolatePlant()
    {

        this.area = 500;
        this.money = 10000.0;
        this.ingredientMenu = new Menu<Ingredient>();

        Ingredient liquor = new Ingredient(Const.IngredientType.LIQUOR);
        Ingredient fat = new Ingredient(Const.IngredientType.FAT);
        Ingredient powder = new Ingredient(Const.IngredientType.POWDER);
        Ingredient sugar = new Ingredient(Const.IngredientType.SUGAR);
        Ingredient milk = new Ingredient(Const.IngredientType.MILK);

        ingredientMenu.add(milk);
        ingredientMenu.add(powder);
        ingredientMenu.add(liquor);
        ingredientMenu.add(sugar);
        ingredientMenu.add(fat);
    }

    /**
     * 获取中介者
     *
     * @return 中介者实例 _ingredientMediator
     * @author zhouziyi
     */
    public ingredientMediator getIngredientMediator()
    {
        if (ingredientMediator == null)
        {
            ingredientMediator = new ingredientMediator();
        }
        return ingredientMediator;
    }

    /**
     * 为工厂中所有原料添加中介者
     *
     * @author zhouziyi
     */
    public void addMediatorForAll()
    {
        Iterator<Ingredient> ingredientIt = getIngredientMenu().iterator();
        while (ingredientIt.hasNext())
        {
            ingredientIt.next().setMediator(ingredientMediator);
        }
    }

    /**
     * 为工厂分配一个中介者
     *
     * @param ingredientmediator 待分配的中介者实例
     * @author zhouziyi
     */
    public void setMediatorForFactory(ingredientMediator ingredientmediator)
    {
        this.ingredientMediator = ingredientmediator;
    }


    /**
     * 升级服务-扩大面积的接口
     *
     * @param area 待扩大的面积
     * @return 原来未升级前的面积
     */
    @Override
    public double expand(double area)
    {
        double origin = this.area;
        this.area += area;
        return origin;
    }

    /**
     * 升级服务-返回名称的接口
     *
     * @return 对象名称
     */
    @Override
    public String getName()
    {
        return "巧克力加工厂";
    }

    /**
     * 得到巧克力加工厂的总面积
     *
     * @return 巧克力加工厂总面积
     */
    @Override
    public double getArea()
    {
        return area;
    }

    /**
     * 私有内部类
     * 持有唯一实例
     */
    private static class ChocolatePlantHolder
    {
        private static final ChocolatePlant INSTANCE = new ChocolatePlant();
    }

    /**
     * 获得Factory的唯一实例
     *
     * @return Factory的唯一实例instance
     */
    public static ChocolatePlant getInstance()
    {
        return ChocolatePlantHolder.INSTANCE;
    }


    /**
     * 输出工厂账户余额
     */
    @Override
    public double getMoney()
    {
        return money;
    }

    /**
     * 从工厂余额中扣款
     *
     * @param m 扣款金额
     * @return 扣款是否成功
     */
    @Override
    public boolean reduceMoney(double m)
    {
        if (money >= m)
        {
            money -= m;
            return true;
        }
        return false;
    }

    /**
     * 增加工厂余额
     *
     * @param m 增加金额
     */
    @Override
    public void addMoney(double m)
    {
        money += m;
    }


}
