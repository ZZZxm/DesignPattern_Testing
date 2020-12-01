package NullObject;

import Chocolate.Chocolate;
import Facade.AddChocolateFacade;

import java.util.ArrayList;

/**
 * 货箱
 *
 * @author fu cheng
 * @function 提供货箱类
 * @pattern Null Object
 */
public class Box implements AbstractBox
{
    private ArrayList<Chocolate> chocolateArrayList;

    static AddChocolateFacade addChocolateFacade = new AddChocolateFacade();

    /**
     * 构造函数
     */
    public Box()
    {
        chocolateArrayList = new ArrayList<Chocolate>();
    }

    /**
     * 获取货箱中的巧克力数量
     *
     * @pattern Null Object
     */
    @Override
    public void getChocolateCount()
    {
        System.out.print("白巧克力:");
        System.out.println(chocolateArrayList.size());
    }

    /**
     * 添加巧克力
     *
     * @param chocolate 需要添加的巧克力
     * @pattern Null Object
     */
    @Override
    public void addChocolate(Chocolate chocolate)
    {
        addChocolateFacade.addChocolate(chocolateArrayList, chocolate);
    }

    /**
     * 获取所有巧克力
     *
     * @return 巧克力数组
     * @pattern Null Object
     */
    @Override
    public ArrayList<Chocolate> getAllChocolates()
    {
        ArrayList<Chocolate> res=this.chocolateArrayList;
        this.chocolateArrayList=new ArrayList<Chocolate>();
        return res;
    }
}
