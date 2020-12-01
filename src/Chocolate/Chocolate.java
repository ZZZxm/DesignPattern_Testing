package Chocolate;

import Constant.Const;
import Decorator.SetPack;
import Decorator.Normal;
import Decorator.Box;
import Bridge.Size;
import State.*;

/**
 * 巧克力类
 * @pattern Bridge
 */
public class Chocolate implements SetPack
{

    public int amount = 0;

    //巧克力颜色（新建实例的时候就已经定义）
    private String color;

    //巧克力形状（使用set_Size更改）
    protected Size size;

    //巧克力包装（默认为空,使用set_Pack更改）
    public String pack;

    //根据State模式来设置巧克力的状态
    public State state;

    /**
     * 巧克力构造函数
     */
    public Chocolate()
    {
        state = new ToProcess();//初始化默认为待处理状态
        pack = "NULL";//默认无包装
    }

    /**
     * 克隆巧克力
     * @return 新巧克力
     */
    public Chocolate clone()
    {
        System.out.println("成功克隆了Chocolate");
        return new Chocolate();
    }

    /**
     * 改变巧克力状态
     */
    public void changeChocolateState()
    {
        //改变巧克力的状态 删掉
        System.out.println("生产过程中改变了巧克力状态");
        /*_state= ChocolateState.getInstance();
        If (_state=='undressed')
        _state='processing';
        else if(_state=='processing')
        _state='processed and not tested'
        else if(_state=='processed and not tested')
        _state='processed and tested';
        else if(_state=='processed and tested');
        _state='packed';
         */
    }

    /**
     * 输出巧克力信息
     */
    public void printChocolate()
    {
        System.out.println("-------现在的巧克力状态-------");
        this.state.showState();
    }

    /**
     * 巧克力状态改变函数
     *
     * @param settingState 需要改变的状态
     */
    public void changeState(State settingState)
    {
        this.state = settingState;
    }

    /**
     * 打印巧克力状态函数
     */
    public void printState()
    {
        this.state.showState();

    }

    /**
     * 巧克力工序1
     */
    public void cook1()
    {
        changeState(new Baked());
    }

    /**
     * 巧克力工序2
     */
    public void cook2()
    {
        changeState(new Refined());
    }

    /**
     * 巧克力工序3
     */
    public void cook3()
    {
        changeState(new Cooled());
    }

    /**
     * 巧克力工序4
     */
    public void cook4()
    {
        changeState(new Cut());
    }

    /**
     * 巧克力工序5
     */
    public void cook5()
    {
        changeState(new Finished());
    }

    /**
     * 在初始化函数中定义颜色
     * @param color 巧克力颜色
     */
    public void initColor(int color)
    {
        if (color == 1)
        {
            this.color = Const.BLACK;
        } else
        {
            this.color = Const.WHITE;
        }
    }

    /**
     * 购设置巧克力形状的函数
     *
     * @param size 形状类
     * @pattern Bridge
     **/
    public void setSize(Size size)
    {
        this.size = size;
    }

    /**
     * 显示巧克力属性的函数
     *
     * @author Bridge
     **/
    public void bridgeShow()
    {
        System.out.println("巧克力有形状和口味两种属性");
        System.out.println("这是一个形状为" + size.getSize() + "的" + color + "巧克力");
    }

    /**
     * 获取巧克力口味的函数
     *
     * @pattern Bridge
     * @return 巧克力口味
     **/
    public String getColor()
    {
        return color;
    }

    /**
     * 设置巧克力口味的函数
     *
     * @param color 巧克力口味（颜色）
     * @pattern
     **/
    public void setColor(String color)
    {
        this.color = color;
    }

    /**
     * 展示巧克力包装的函数
     *
     * @pattern Decorator
     **/
    @Override
    public void display()
    {
        if ("NULL".equals(pack))
        {
            System.out.println("巧克力还没有进行包装");
        } else
        {
            System.out.println("巧克力已经完成包装");
            System.out.println("现在巧克力包装为：" + pack);
        }
    }

    /**
     * 对巧克力进行包装的函数
     *
     * @param pack 表示包装种类的字符串（normal/box）
     * @pattern Decorator
     **/
    public void setPack(String pack)
    {
        SetPack m0 = this;
        //m0.display();
        if ("单个包装".equals(pack))
        {
            SetPack m1 = new Normal(m0);
            m1.display();
        } else
        {
            SetPack m2 = new Box(m0);
            m2.display();
        }
    }

}
