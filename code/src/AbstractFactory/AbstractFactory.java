package AbstractFactory;

/**
 * 用于实现抽象工厂方法模式的抽象工厂类
 *
 * @function 该类的作用是提供两个生产制服和工作证的方法
 * @pattern AbstractFactory Pattern
 * @author hezehua
 */
public abstract class AbstractFactory
{
    /**
     * 获取制服
     * @param uniform 制服类型
     * @return 制服
     * @author hzh
     */
    public abstract Uniform getUniform(String uniform);

    /**
     * 获取工作证
     * @param card 工作证类型
     * @return 工作证
     * @author hzh
     */
    public abstract Card getCard(String card);
}
