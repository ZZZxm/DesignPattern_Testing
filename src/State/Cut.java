package State;

import Constant.Const;

/**
 * 已切割状态类
 *
 * @author Caoqinghua，liyuanfneg
 * @function 将巧克力已切割状态抽象为状态类
 * @pattern 状态模式 State
 */
public class Cut extends State
{
    /**
     * 构造函数
     */
    public Cut()
    {
        stateName = Const.CHOCOLATE_STATE[4];
    }
}