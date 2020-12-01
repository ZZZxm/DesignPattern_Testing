package Machine;

import Bridge.Piece;
import Bridge.Size;
import Chocolate.Chocolate;

/**
 * 制作黑巧克力机器实现类
 *
 * @author liyuanfeng
 * @function 实现机器接口，实现的机器接口可以提供制作黑巧克力的功能
 * @pattern 工厂方法模式(Factory Method Pattern)
 */
public class DarkMachine implements Machine
{
    Chocolate chocolate;

    /**
     * 构造函数，提示黑巧克力机以及创建成功
     */
    public DarkMachine()
    {
        System.out.println("成功创建一台黑巧克力生产机");
        chocolate = new Chocolate();
    }

    /**
     * 黑巧克力机初始化
     */
    @Override
    public void init()
    {
        System.out.println("机器初始化中，即将开始生产黑巧克力...");
        chocolate.initColor(1);//设置为黑巧克力
        System.out.println("巧克力的加工过程将分为4大步骤，分别是烘焙、精炼、冷却塑形和切割，每一步骤都会改变巧克力状态");
        System.out.println("=======================使用 状态 State 模式====================");
        System.out.println("类名：State");
        System.out.println("模式：State");
        System.out.println("方法名：Chocolate.changeState()");
        System.out.println("功能描述：将巧克力的多种状态抽象为类，以提高可扩展性，同时减少条件判断语句");
        System.out.println("=============================================================");

    }

    /**
     * 黑巧克力原料烘焙
     */
    @Override
    public void baking()
    {
        System.out.println("正在对黑巧克力原料进行烘培...");
        chocolate.cook1();
        chocolate.printState();
    }

    /**
     * 白巧克力原料精炼
     */
    @Override
    public void refining()
    {
        System.out.println("正在对烘焙后的黑巧克力原料进行精炼...");
        chocolate.cook2();
        chocolate.printState();
    }

    /**
     * 白巧克力原料冷却
     */
    @Override
    public void cooling()
    {
        System.out.println("正在对精炼后的黑巧克力原料进行冷却和塑形...");
        chocolate.cook3();
        chocolate.printState();
    }

    /**
     * 白巧克力原料进行切割
     */
    @Override
    public void cutting()
    {
        System.out.println("正在对生产的黑巧克力进行切割...");
        System.out.println("在对巧克力的种类和形状两个属性管理时，使用了桥接模式：");
        System.out.println("=====================使用 桥接 Bridge 模式===============================");
        System.out.println("类名：Size(抽象为类的属性）");
        System.out.println("模式：Bridge");
        System.out.println("方法名：Chocolate.set_Size()");
        System.out.println("功能描述：将有多种实现方法的巧克力切割后形状属性抽象为类，降低实现类数量同时提高扩展性");
        System.out.println("======================================================================");
        Size shape = new Piece();
        chocolate.setSize(shape);
        System.out.println("成功将黑巧克力切割成块状");
        chocolate.cook4();
        chocolate.printState();
    }

    /**
     * 完成黑巧克力的生产
     *
     * @return 生产的巧克力
     */
    @Override
    public Chocolate produce()
    {
        System.out.println("黑巧克力生产完成！");
        chocolate.cook5();
        chocolate.printState();
        return this.chocolate;
    }
}
