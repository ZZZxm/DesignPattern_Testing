package AbstractFactory;

/**
 * 用于实现抽象工厂方法模式中生产工作证的继承于抽象工厂的工作证工厂
 *
 * @function 该类的作用是根据工作证种类的不同新建不同种类的工作证
 * @pattern AbstractFactory Method
 * @author hezehua
 */
public class CardFactory extends AbstractFactory
{
    /**
     * 生产不同的工作证
     *
     * @return Card 工作证类
     * @param cardType 工作证类型
     * @author hzh
     **/
    @Override
    public Card getCard(String cardType)
    {
        if (cardType == null)
        {
            return null;
        }
        if ("PRODUCER".equalsIgnoreCase(cardType))
        {
            return new Producer();
        } else if ("PACKAGER".equalsIgnoreCase(cardType))
        {
            return new Packager();
        } else if ("KEEPER".equalsIgnoreCase(cardType))
        {
            return new Keeper();
        }
        return null;
    }

    /**
     * 生产不同的制服
     *
     * @return null
     * @param uniform 制服类型
     * @author hzh
     **/
    @Override
    public Uniform getUniform(String uniform)
    {
        return null;
    }
}
