package State;

import Constant.Const;

/**
 * 已精炼状态类
 *
 * @author Caoqinghua，liyuanfneg
 * @function 将巧克力已精炼状态抽象为状态类
 * @pattern 状态模式 State
 */
public class Refined extends State
{
    /**
     * 构造函数
     */
    public Refined()
    {
        stateName = Const.CHOCOLATE_STATE[2];
    }
}