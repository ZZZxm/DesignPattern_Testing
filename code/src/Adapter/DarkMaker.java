package Adapter;

/**
 * 用于实现适配器模式的继承黑巧克力生产接口的实现类
 *
 * @function 该类的作用是实现使用白巧克力机生产黑巧克力的功能
 * @pattern Adapter Pattern
 * @author hezehua
 */
public class DarkMaker implements DarkChocolateMaker
{
    /**
     * 实现生产黑巧克力的功能
     *
     * @author hzh
     **/
    @Override
    public void makeDark()
    {
        System.out.println("======== 使用适配器 Adapter 模式 ========");
        System.out.println("类名：ChocolateMaker");
        System.out.println("模式：Adapter");
        System.out.println("方法名：ChocolateMaker.make()");
        System.out.println("功能描述：采用Adapter模式在一台机器上兼容不同巧克力的生产方式");
        System.out.println("======================================");
        System.out.println("使用白巧克机生产黑巧克力");
    }
}
