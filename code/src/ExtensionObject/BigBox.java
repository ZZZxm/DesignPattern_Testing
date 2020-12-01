package ExtensionObject;

import Chocolate.Chocolate;
import Facade.AddChocolateFacade;

import java.util.ArrayList;

/**
 * 大货箱
 *
 * @author fu cheng
 * @function 提供大货箱
 * @pattern ExtensionObject
 */
public class BigBox implements AbstractBigBox
{
    private ArrayList<Chocolate> chocolateArrayList;

    static AddChocolateFacade addChocolateFacade = new AddChocolateFacade();

    /**
     * 构造函数，创建巧克力列表
     */
    public BigBox()
    {
        chocolateArrayList = new ArrayList<>();
    }

    /**
     * 获取货箱中的巧克力数量
     *
     * @pattern Extension Object
     */
    @Override
    public void getChocolateCount()
    {
        System.out.print("黑巧克力:");
        System.out.println(chocolateArrayList.size());
    }

    /**
     * 添加巧克力至货箱中
     *
     * @param chocolate 需要添加的巧克力
     * @pattern Extension Object
     */
    @Override
    public void addChocolate(Chocolate chocolate)
    {
        addChocolateFacade.addChocolate(chocolateArrayList, chocolate);
    }

    /**
     * 添加两个巧克力至货箱中
     *
     * @param chocolateA 需要添加的第一个巧克力
     * @param chocolateB 需要添加的第二个巧克力*
     * @pattern Extension Object
     */
    @Override
    public void addTwoChocolate(Chocolate chocolateA, Chocolate chocolateB)
    {
        this.addChocolate(chocolateA);
        this.addChocolate(chocolateB);

    }

    /**
     * 获取所有巧克力
     *
     * @return 巧克力数组
     * @pattern Extension Object
     */
    @Override
    public ArrayList<Chocolate> getAllChocolates()
    {
        ArrayList<Chocolate> res=this.chocolateArrayList;
        this.chocolateArrayList= new ArrayList<>();
        return res;
    }

}
