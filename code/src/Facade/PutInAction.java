package Facade;

import CallBack.CallBackInterface;
import Chocolate.Chocolate;

import java.util.ArrayList;

/**
 * 放入巧克力
 *
 * @author fu cheng
 * @function 提供了放入巧克力的动作
 * @pattern Facade
 */
public class PutInAction
{
    /**
     * 打开货箱
     *
     * @param callback 回调函数
     * @param chocolateArrayList box巧克力货箱中维护的巧克力数组
     * @param chocolate          需要添加的新巧克力
     * @function 将巧克力放入货箱中
     */
    public void putInChocolate(CallBackInterface callback, ArrayList<Chocolate> chocolateArrayList, Chocolate chocolate)
    {
        callback.call();
        chocolateArrayList.add(chocolate);
        System.out.println("巧克力被放入了货箱中");
    }
}
