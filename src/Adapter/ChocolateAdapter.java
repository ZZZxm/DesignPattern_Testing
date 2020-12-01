package Adapter;

/**
 * 用于实现适配器模式的继承巧克力生产接口的实现类
 *
 * @function 该类的作用是把黑巧克力的制作方法适配到白巧克力机上，使得白巧克机器能够制作黑巧克力
 * @pattern Adapter Pattern
 * @author hezehua
 */
public class ChocolateAdapter implements ChocolateMaker
{

    DarkChocolateMaker darkChocolateMaker;

    /**
     * 构造函数：实现适配器功能，当参数为黑巧克力时，新建黑巧克力的生产
     *
     * @param chocolateType 要生产的巧克力类型
     * @author hzh
     **/
    public ChocolateAdapter(String chocolateType)
    {
        if ("dark".equalsIgnoreCase(chocolateType))
        {
            darkChocolateMaker = new DarkMaker();
        }
    }

    /**
     * 在白巧克力机的make中调用黑巧克力的生产函数
     *
     * @param chocolateType 要生产的巧克力类型
     * @author hzh
     **/
    @Override
    public void make(String chocolateType)
    {
        if ("dark".equalsIgnoreCase(chocolateType))
        {
            darkChocolateMaker.makeDark();
        }
    }
}
