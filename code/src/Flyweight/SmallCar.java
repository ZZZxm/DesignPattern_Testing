package Flyweight;

import java.util.concurrent.TimeUnit;
import Chocolate.*;

/**
 *
 * 小型车辆
 *
 * @author wangqiyun
 * @chinesename 小型车辆类
 * @function 初始化小型车辆以及装车
 * @pattern 享元模式模式(FlyWeight Pattern)
 */
public class SmallCar extends Car {
    private int Size = 1;//内部标志

    //接受外部状态

    private Chocolate[] goods = new Chocolate[Size];//外部标志

    /**
     * 获取车内货物数量
     *
     * @return 车内货物数量
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public int getGoodsNumber() {
        return 1-goods.length;
    }

    /**
     * 装货
     *
     * @param preloads 要装入的货物
     * @throws InterruptedException 异常
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public void inGoods(Chocolate preloads) throws InterruptedException {
        this.goods[0] = preloads;
        System.out.printf("货物已装车\n");
        System.out.printf("货车剩余容量为"+getGoodsNumber()+"\n");
        System.out.println("车辆已满开始运送");
        TimeUnit.SECONDS.sleep(1);//秒
        outGoods();

    }


    /**
     * 卸货，重置货车外部状态（货物清空）（继承Car）
     *
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    @Override
    public void outGoods(){
        this.goods[0] = null;
        System.out.println("\n货物已送出\n");
    }

    //根据外部状态进行逻辑处理
    /**
     * 进行装货操作（继承Car）
     *
     * @param good 要装入的货物
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    @Override
    public void operate(Chocolate good) throws InterruptedException {
        System.out.println("开始装车");
        inGoods(good);
    }

}