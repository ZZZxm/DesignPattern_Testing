package Decorator;

import Chocolate.Chocolate;

/**
 * 装饰子类—具体装饰normal
 *
 *  @author hexian
 *  @function 对巧克力实现normal装饰
 *  @pattern Decorator Pattern
 */
public class Normal extends Changer
{
    /**
     * 定位改变对象
     * @param m 改变包装接口SetPack
     * @pattern Decorator
     **/
    public Normal(SetPack m)
    {
        super(m);
    }

    /**
     * 显示巧克力包装的函数
     *
     * @pattern Decorator
     **/
    @Override
    public void display()
    {
        setChanger();
        super.display();
    }

    /**
     * 改变巧克力的_pack属性的函数
     * @pattern Decorator
     **/
    public void setChanger()
    {
        ((Chocolate) super.m).pack = "单个包装";
    }
}
