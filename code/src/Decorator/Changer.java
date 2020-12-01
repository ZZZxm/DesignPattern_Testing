package Decorator;

/**
 * 装饰抽象类
 *
 *  @author hexian
 *  @function 对巧克力进行包装
 *  @pattern Decorator Pattern
 */
public class Changer implements SetPack
{
    SetPack m;

    /**
     * 设置改变对象的函数
     *
     * @param m 需要改变的包装类
     * @pattern Decorator
     **/
    public Changer(SetPack m)
    {
        this.m = m;
    }

    /**
     * 显示巧克力包装的函数
     *
     * @pattern Decorator
     **/
    @Override
    public void display()
    {
        m.display();
    }
}
