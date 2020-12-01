package Adapter;

/**
 * 用于实现适配器模式的继承巧克力生产接口的实现类
 *
 * @function 该类的作用是实现使用白巧克力机生产白巧克力和黑巧克力的功能
 * @pattern Adapter Pattern
 * @author hezehua
 */
public class ClassChocolateMaker implements ChocolateMaker
{
    ChocolateAdapter chocolateAdapter;
    /**
     * 在白巧克力机器中同时实现生产白巧克力和调用黑巧克力生产的函数
     *
     * @param chocolateType 要生产的巧克力类型
     * @author hzh
     **/
    @Override
    public void make(String chocolateType)
    {

        if ("white".equalsIgnoreCase(chocolateType))
        {
            System.out.println("======== 使用适配器 Adapter 模式 ========");
            System.out.println("类名：ChocolateMaker");
            System.out.println("模式：Adapter");
            System.out.println("方法名：ChocolateMaker.make()");
            System.out.println("功能描述：采用Adapter模式在一台机器上兼容不同巧克力的生产方式");
            System.out.println("======================================");
            System.out.println("使用白巧克机生产白巧克力");
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (chocolateType.equalsIgnoreCase("dark"))
        {
            chocolateAdapter = new ChocolateAdapter(chocolateType);
            chocolateAdapter.make(chocolateType);
        }
    }
}
