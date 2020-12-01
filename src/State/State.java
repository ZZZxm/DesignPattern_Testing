package State;

import Chocolate.Chocolate;

/**
 * 状态模式抽象基类
 *
 * @author Caoqinghua, liyuanfeng
 * @function 为巧克力的各个状态提供了抽象类，其子类有待加工/已烘焙/已精炼/已冷却/成品,其环境类是Chocolate
 * @pattern 状态模式 State
 */
public abstract class State
{
    protected String stateName;//状态名
    protected Chocolate chocolate;//状态环境类

    /**
     * 展示巧克力当前状态
     */
    public void showState()
    {
        System.out.println("当前巧克力处于" + stateName + "状态");
    }

    /**
     * 获取巧克力当前状态
     * @return 当前状态
     */
    public String getState()
    {
        return stateName;
    }
}
