package Flyweight;

import Chocolate.*;

/**
 *
 * 车辆类
 *
 * @author wangqiyun
 * @chinesename 车辆父类
 * @function 定义装车以及卸货操作
 * @pattern 享元模式模式(FlyWeight Pattern)
 */
public abstract class Car
{

    //定义业务操作
    /**
     * 进行装货操作（继承）
     *
     * @param good 要装入的货物
     * @throws InterruptedException 异常
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public abstract void operate(Chocolate good) throws InterruptedException;

    /**
     * 卸货，重置货车外部状态（货物清空）
     *
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public abstract void outGoods();

}
