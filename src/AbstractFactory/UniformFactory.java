package AbstractFactory;

/**
 * 用于实现抽象工厂方法模式中生产制服的继承于抽象工厂的制服工厂
 *
 * @function 该类的作用是根据制服种类的不同新建不同种类的制服
 * @pattern AbstractFactory Pattern
 * @author hezehua
 */
public class UniformFactory extends AbstractFactory
{
    /**
     * 生产不同的工作证
     *
     * @return null
     * @param cardType 工作证类型
     * @author hzh
     **/
    @Override
    public Card getCard(String cardType)
    {
        return null;
    }

    /**
     * 生产不同的制服
     *
     * @return Uniform 制服类
     * @param uniform 制服类型
     * @author hzh
     **/
    @Override
    public Uniform getUniform(String uniform)
    {
        if (uniform == null)
        {
            return null;
        } else if ("YELLOW".equalsIgnoreCase(uniform))
        {
            return new Yellow();
        } else if ("BLUE".equalsIgnoreCase(uniform))
        {
            return new Blue();
        } else if ("RED".equalsIgnoreCase(uniform))
        {
            return new Red();
        }
        return null;
    }
}