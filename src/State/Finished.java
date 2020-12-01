package State;

import Constant.Const;

/**
 * 已完成状态类
 *
 * @author Caoqinghua，liyuanfneg
 * @function 将巧克力已完成状态抽象为状态类
 * @pattern 状态模式 State
 */
public class Finished extends State
{
    /**
     * 构造函数
     */
    public Finished()
    {
        stateName = Const.CHOCOLATE_STATE[5];
    }
}
