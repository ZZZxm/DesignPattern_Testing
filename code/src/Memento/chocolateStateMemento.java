package Memento;

import Bridge.Size;
import Chocolate.Chocolate;
import State.State;
import Constant.Const;

/**
 * 巧克力状态快照
 *
 * @author zzy
 * @function 设置巧克力的状态改变
 * @pattern Memento
 **/
public class chocolateStateMemento
{
    //只需要设计巧克力的状态，不需要像农场那样还有是否成熟和经验值
    public int amount = 0;
    //巧克力的状态
    private final State state;
    //巧克力颜色（新建实例的时候就已经定义）
    private final String color;

    //巧克力形状（使用set_Size更改）
    protected Size size;

    //巧克力包装（默认为空,使用set_Pack更改）
    public String pack;


    /**
     * 创建一个chocolate作为备份的作物
     *
     * @param chocolate 需要备份的巧克力
     * @author zzy
     **/
    private chocolateStateMemento(Chocolate chocolate)
    {
        this.state = chocolate.state;
        //   this._color=chocolate._color;
        this.pack = chocolate.pack;
        this.amount = chocolate.amount;
        this.color = chocolate.getColor();


    }

    /**
     * chocolate作为备份的作物
     *
     * @param chocolate 需要备份的巧克力
     * @return 备份巧克力当前的状态
     * @author zzy
     **/
    public static chocolateStateMemento getMemento(Chocolate chocolate)
    {
        System.out.println("你正在获取Chocolate的状态(Memento模式)");
        return new chocolateStateMemento(chocolate);

    }

    /**
     * chocolate作为备份的作物
     *
     * @param chocolate 需要回退到某个状态的作物
     * @param state 用户希望退回的状态
     * @author zzy
     **/
    //输入：
    public static void setMemento(Chocolate chocolate, chocolateStateMemento state)
    {
        chocolate.changeState(state.state);
        chocolate.setColor(state.color);
        chocolate.setSize(state.size);
        chocolate.setPack(state.pack);
        System.out.println("你已经成功将Chocolate回退到对应的状态(Memento模式)");
    }

    /**
     * 改变flag状态
     *
     * @param chocolate 需要判断状态的对象
     * @param flag 能够继续操作的标志
     * @pattern Dirty Flag
     * @return flag
     **/
    public static boolean setFlag(Chocolate chocolate, boolean flag)
    {
        if (chocolate.state.getState().equals(Const.CHOCOLATE_STATE[0]))
        {
            flag = true;
        }
        return flag;
    }

    /**
     * 判断flag状态，决定是否能够继续回退
     *
     * @param flag 能够继续操作的标志
     * @pattern Dirty Flag
     **/
    public static void stateJudgement(boolean flag)
    {
        if (flag)
        {
            System.out.println("巧克力已经回退到初始状态，无法继续回退(Dirty Flag模式)");
        } else
        {
            System.out.println("巧克力仍然可以回退(Dirty Flag模式)");
        }
    }

    /**
     * 使用 备忘录 Memento模式和Dirty Flag模式
     */
    public static void mememtoDirtyflag()
    {
        System.out.println("======== 使用 备忘录 Memento模式和Dirty Flag模式 =======");
        System.out.println("现在生产已结束，您选择了回炉生产巧克力");
        Chocolate chocolate = new Chocolate();
        chocolate.printState();
        chocolateStateMemento state0 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook1();
        chocolate.printState();
        //1
        chocolateStateMemento state1 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook2();
        chocolate.printState();
        //2
        chocolateStateMemento state2 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook3();
        chocolate.printState();
        //3
        chocolateStateMemento state3 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook4();
        chocolate.printState();
        //4
        chocolateStateMemento state4 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook5();
        chocolate.printState();
        //5

        boolean flag = false;

        chocolateStateMemento.setMemento(chocolate, state3);
        System.out.println("回退1步后巧克力状态如下");
        chocolate.printState();
        flag = setFlag(chocolate, flag);
        stateJudgement(flag);

        chocolateStateMemento.setMemento(chocolate, state2);
        System.out.println("回退2步后巧克力状态如下");
        chocolate.printState();
        flag = setFlag(chocolate, flag);
        stateJudgement(flag);

        chocolateStateMemento.setMemento(chocolate, state1);
        System.out.println("回退3步后巧克力状态如下");
        chocolate.printState();
        flag = setFlag(chocolate, flag);
        stateJudgement(flag);

        chocolateStateMemento.setMemento(chocolate, state0);
        System.out.println("回退4步后巧克力状态如下");
        chocolate.printState();
        flag = setFlag(chocolate, flag);
        stateJudgement(flag);
    }


}
