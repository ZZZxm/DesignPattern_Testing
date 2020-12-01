package Flyweight;

import java.util.HashMap;

/**
 *
 * 享元工厂类
 *
 * @author wangqiyun
 * @function 创建享元工厂存放和拿取享元对象
 * @pattern 享元模式模式(FlyWeight Pattern)
 */


public class FlyweightFactory
{
    //定义一个池容器
    private static HashMap<Integer, Car> pool = new HashMap<>();

    //享元工厂
    /**
     * 通过池容器改变外部状态进行创建和拿取车辆实例，实现享元
     *
     * @param choice 用户做出的选择（小型车辆或者大型车辆）
     * @return flyweight 一个内部状态固定的车辆实例
     * @pattern 享元模式模式(FlyWeight Pattern)
     */
    public static Car getFlyweight(int choice)
    {
        Car flyweight = null;
        if (pool.containsKey(choice))
        {    //池中有该对象
            flyweight = pool.get(choice);
            System.out.print("已有该车实例直接从池中取该车\n");
        } else
        {
            //根据外部状态创建享元对象
            if (choice == 1)
            {
                flyweight = new SmallCar();
                //放入池中
                pool.put(choice, flyweight);
                System.out.print("创建并从池中取出小车\n");
            } else if (choice == 2)
            {
                flyweight = new BigCar();
                //放入池中
                pool.put(choice, flyweight);
                System.out.print("创建并从池中取出大车\n");
            } else
            {
                System.out.print("请输入正确的选择\n");
            }
        }
        return flyweight;
    }
}