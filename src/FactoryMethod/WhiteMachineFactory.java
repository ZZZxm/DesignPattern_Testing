package FactoryMethod;

import Machine.Machine;
import Machine.WhiteMachine;

/**
 * 机器工厂接口的实现类
 * @author liyuanfeng
 * @function 它能够创造制作白巧克力的机器
 * @pattern 工厂方法模式(Factory Method Pattern)
 */
public class WhiteMachineFactory implements MachineFactory
{
    /**
     * 创造制作黑巧克力的机器
     */
    @Override
    public Machine createMachine()
    {
        System.out.println("正在使用工厂方法模式创建一台白巧克力生产机...");
        return new WhiteMachine();
    }
}
