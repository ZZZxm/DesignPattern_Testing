package AbstractFactory;

/**
 * 用于实现抽象工厂方法模式的工作证实现类
 *
 * @function 该类的作用是继承Card接口的功能，对生成生产车间员工的工作证做具体实现
 * @pattern AbstractFactory Pattern
 * @author hezehua
 */
public class Packager implements Card
{
    /**
     * 打印生产生产车间员工工作证
     *
     * @author hzh
     **/
    @Override
    public void produce()
    {
        System.out.println("使用抽象工厂模式生产了生产车间员工工作证");
    }
}
