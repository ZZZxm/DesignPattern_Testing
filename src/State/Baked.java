package State;

import Constant.Const;

/**
 * 已烘焙状态类
 *
 * @author Caoqinghua，liyuanfneg
 * @function 将巧克力已烘焙状态抽象为状态类
 * @pattern 状态模式 State
 */
public class Baked extends State
{
    /**
     * 构造函数
     */
    public Baked()
    {
        stateName = Const.CHOCOLATE_STATE[1];
    }
}