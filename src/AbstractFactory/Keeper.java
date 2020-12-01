package AbstractFactory;

/**
 * 用于实现抽象工厂方法模式的工作证实现类
 *
 * @function 该类的作用是继承Card接口的功能，对生成仓库管理员的工作证做具体实现
 * @pattern AbstractFactory Pattern
 * @author hezehua
 */
public class Keeper implements Card
{
    /**
     * 打印生产仓库管理员工作证
     *
     * @author hzh
     **/
    @Override
    public void produce()
    {
        System.out.println("使用抽象工厂模式生产了仓库管理员工作证");
    }
}