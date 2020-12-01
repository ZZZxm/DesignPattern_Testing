package State;

import Constant.Const;

/**
 * 待处理状态类
 *
 * @author Caoqinghua，liyuanfneg
 * @function 将巧克力待处理状态抽象为状态类
 * @pattern 状态模式 State
 */
public class ToProcess extends State
{
    /**
     * 构造函数
     */
    public ToProcess()
    {
        stateName = Const.CHOCOLATE_STATE[0];
    }
}
