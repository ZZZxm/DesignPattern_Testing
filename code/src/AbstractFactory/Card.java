package AbstractFactory;

/**
 * 用于实现抽象工厂方法模式的工作证工厂接口
 *
 * @function 该接口的作用是生产不同员工的工作证
 * @pattern AbstractFactory Method
 * @author hezehua
 */
public interface Card
{
    /**
     * 生产工作证
     * @author hezehua
     */
    void produce();
}
