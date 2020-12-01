package Facade;

import CallBack.CallBackInterface;
import Chocolate.Chocolate;

import java.util.ArrayList;

/**
 * 将巧克力放入货箱中的一系列动作
 *
 * @author fu cheng
 * @function 提供了将巧克力放入货箱中的动作
 * @pattern Facade
 */
public class AddChocolateFacade
{
    static OpenBoxAction openBoxAction = new OpenBoxAction();
    static PutInAction putInAction = new PutInAction();
    static CloseBoxAction closeBoxAction = new CloseBoxAction();

    /**
     * 将巧克力放入货箱中
     *
     * @param chocolateArrayList box巧克力货箱中维护的巧克力数组
     * @param chocolate          需要添加的新巧克力
     * @function 将巧克力添加到货箱中
     */
    public void addChocolate(ArrayList<Chocolate> chocolateArrayList, Chocolate chocolate)
    {
        System.out.println("\n将巧克力放入货箱中使用了外观模式");
        System.out.println("==========使用外观模式 Facade==========");
        System.out.println("类名：AddChocolateFacade/OpenBoxAction/PutInAction/CloseBoxAction");
        System.out.println("模式：Facade");
        System.out.println("方法：AddChocolateFacade.addChocolate()/OpenBoxAction.openBox()/PutInAction.putInChocolate()/CloseBoxAction.closeBox()");
        System.out.println("============================================");
        openBoxAction.openBox();
        System.out.println("\n将巧克力放入货箱中的动作使用了回调模式");
        System.out.println("==========使用回调模式 CallBack==========");
        System.out.println("模式：CallBack");
        System.out.println("方法：CallBack()");
        System.out.println("============================================");
        CallBackInterface callback = () -> System.out.println("当前获取了一个巧克力...");
        putInAction.putInChocolate(callback, chocolateArrayList, chocolate);
        closeBoxAction.closeBox();
    }
}
