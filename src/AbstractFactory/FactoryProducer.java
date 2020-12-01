package AbstractFactory;

/**
 * 用于实现抽象工厂方法模式的工厂生产类
 *
 * @function 该类的作用是新建生产工作证和制服的工厂
 * @pattern AbstractFactory Pattern
 * @author hezehua
 */
public class FactoryProducer
{
    /**
     * 创建不同的工厂
     *
     * @return AbstractFactory 抽象工厂类
     * @param choice 生产产品类型
     * @author hzh
     **/
    public static AbstractFactory getFactory(String choice)
    {
        if ("CARD".equalsIgnoreCase(choice))
        {
            return new CardFactory();
        } else if ("UNIFORM".equalsIgnoreCase(choice))
        {
            return new UniformFactory();
        }
        return null;
    }
}
