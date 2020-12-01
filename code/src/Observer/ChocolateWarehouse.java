package Observer;

import Chocolate.Chocolate;
import ExtensionObject.BigBox;
import NullObject.AbstractBox;
import NullObject.Box;
import NullObject.NullBox;

import Servant.IUpgradeServiced;

import java.util.ArrayList;

/**
 * 巧克力仓库
 *
 * @author fu cheng
 * @function 提供巧克力仓库类
 * @pattern Observer
 */
public class ChocolateWarehouse implements Observable, IUpgradeServiced
{
    private final ArrayList<ObserverView> observerViewList;
    /**
     * 巧克力货箱
     */
    private AbstractBox box;
    /**
     * 大巧克力货箱
     */
    private final BigBox bigBox;
    /**
     * 仓库所占面积
     */
    private double area;

    /**
     * 构造函数
     */
    public ChocolateWarehouse()
    {
        System.out.println("巧克力仓库创建成功");
        observerViewList = new ArrayList<>();
        box = new NullBox();
        System.out.println("\n使用扩展对象模式扩展货箱的接口");
        System.out.println("==========使用扩展对象模式 ExtensionObject==========");
        System.out.println("类名：BigBox");
        System.out.println("模式：ExtensionObject");
        System.out.println("方法：BigBox.addTwoChocolate()");
        System.out.println("============================================");
        bigBox = new BigBox();
        this.area = 150;
    }

    /**
     * 得到巧克力仓库的面积
     *
     * @return 仓库面积
     */
    @Override
    public double getArea()
    {
        return this.area;
    }


    /**
     * 添加观察者
     *
     * @param observerView 需要被添加的观察者
     * @pattern Observer
     */
    @Override
    public void addObserver(ObserverView observerView)
    {
        System.out.println("仓库添加库存显示面板View" + observerView.getId());
        observerViewList.add(observerView);
    }

    /**
     * 移除观察者
     *
     * @param observerView 需要被移除的观察者
     * @pattern Observer
     */
    @Override
    public void removeObserver(ObserverView observerView)
    {
        observerViewList.remove(observerView);
    }

    /**
     * 更新所有的观察者
     *
     * @pattern Observer
     */
    @Override
    public void updateAllObservers()
    {
        System.out.println("更新所有仓库库存显示面板的信息...");
        System.out.println("==========使用观察者模式 Observer==========");
        System.out.println("类名：ChocolateWarehouse/View");
        System.out.println("模式：Observer");
        System.out.println("方法：ChocolateWarehouse.updateAllObservers()/View.update()");
        System.out.println("============================================");
        for (ObserverView o : observerViewList
        )
        {
            o.update(this);
        }
    }

    /**
     * 添加巧克力到货箱中
     *
     * @param chocolate 需要被添加的巧克力
     */
    public void addChocolateToBox(Chocolate chocolate)
    {
        if (box instanceof NullBox)
        {
            box = new Box();
        }
        box.addChocolate(chocolate);
    }

    /**
     * 添加巧克力到大货箱中
     *
     * @param chocolateA 需要被添加的巧克力
     * @param chocolateB 需要被添加的巧克力
     */
    public void addChocolateToBox(Chocolate chocolateA, Chocolate chocolateB)
    {
        bigBox.addTwoChocolate(chocolateA, chocolateB);
    }

    /**
     * 获取仓库中巧克力数量
     */
    @Override
    public void getChocolateCount()
    {
        box.getChocolateCount();
        bigBox.getChocolateCount();
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
        return "巧克力仓库";
    }


    /**
     * 获取仓库中所有白巧克力
     *
     * @return 白巧克力数组
     */
    public ArrayList<Chocolate> getAllWhiteChocolates()
    {
        return this.box.getAllChocolates();
    }
    /**
     * 获取仓库中所有黑巧克力
     *
     * @return 黑巧克力数组
     */
    public ArrayList<Chocolate> getAllBlackChocolates()
    {
        return this.bigBox.getAllChocolates();
    }
}
