package AbstractFactory;

/**
 * 用于实现抽象工厂方法模式的制服实现类
 *
 * @function 该类的作用是继承Uniform接口的功能，对蓝色制服做具体实现
 * @pattern AbstractFactory Pattern
 * @author hezehua
 */
public class Blue implements Uniform
{
    /**
     * 打印生产蓝色服装
     * @author hzh
     **/
    @Override
    public void make()
    {
        System.out.println("使用抽象工厂模式生产了蓝色服装");
    }
}