package Flyweight;

import Chocolate.*;

import java.util.concurrent.TimeUnit;

/**
 *
 * 大型车辆
 *
 * @author wangqiyun
 * @chinesename 大型车辆类
 * @function 初始化大型车辆以及装车
 * @pattern 享元模式模式(FlyWeight Pattern)
 */
public class BigCar extends Car
{
    private int size = 2;//内部标志
    private int count = 0;
    private Chocolate[] goods = new Chocolate[2];//容器，外部标志

    /**
     * 获取车内货物数量
     *
     * @return 车内货物数量
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public int getGoodsNumber()
    {
        return count;
    }

    /**
     * 增加车内货物数量
     *
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public void addGoodsNumber()
    {
        count++;
    }

    /**
     * 获取车内剩余空间
     *
     * @return 车内剩余空间
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public int getLeftNumber()
    {
        return 2 - count;
    }

    /**
     * 清空货物数量计数器
     *
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public void setGoodsNumber()
    {
        count = 0;
    }

    /**
     * 卸货，重置货车外部状态（货物清空）（继承Car）
     *
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    @Override
    public void outGoods()
    {
        this.goods[0] = null;
        this.goods[1] = null;
        setGoodsNumber();
        System.out.println("\n货物已送出\n");
    }

    /**
     * 装货
     *
     * @param preloads 要装入的货物
     * @throws InterruptedException 异常
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public void inGoods(Chocolate preloads) throws InterruptedException
    {
        if (getGoodsNumber() == 0)
        {
            this.goods[getGoodsNumber()] = preloads;
            addGoodsNumber();
            System.out.print("货物已装车\n");
            System.out.print("货车剩余容量为" + getLeftNumber() + "\n");

        } else if (getGoodsNumber() == 1)
        {
            this.goods[getGoodsNumber()] = preloads;
            addGoodsNumber();
            System.out.print("货物已装车\n");
            System.out.print("货车剩余容量为" + getLeftNumber() + "\n");
            System.out.println("车辆已满开始运送");
            TimeUnit.SECONDS.sleep(1);//秒
            outGoods();
        }

    }

    //根据外部状态进行逻辑处理
    /**
     * 进行装货操作（继承Car）
     *
     * @param good 要装入的货物
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    @Override
    public void operate(Chocolate good) throws InterruptedException
    {

        System.out.println("开始装车");
        inGoods(good);
    }
}
