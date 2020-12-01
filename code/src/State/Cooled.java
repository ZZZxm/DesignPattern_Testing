package State;

import Constant.Const;

/**
 * 已冷却状态类
 *
 * @author Caoqinghua，liyuanfneg
 * @function 将巧克力已冷却状态抽象为状态类
 * @pattern 状态模式 State
 */
public class Cooled extends State
{
    /**
     * 构造函数
     */
    public Cooled()
    {
        stateName = Const.CHOCOLATE_STATE[3];
    }
}