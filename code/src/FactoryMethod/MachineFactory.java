package FactoryMethod;

import Machine.Machine;

/**
 * 用于实现工厂方法模式的工厂接口
 *
 * @author liyuanfeng
 * @function 该接口的作用是创建一台机器
 * @pattern Factory Method Method
 */
public interface MachineFactory
{
    /**
     * 创建机器操作
     *
     * @return 创建的机器接口
     */
    Machine createMachine();
}

