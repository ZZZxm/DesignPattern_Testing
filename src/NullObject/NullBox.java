package NullObject;

import Chocolate.Chocolate;

import java.util.ArrayList;

/**
 * 空货箱
 *
 * @author fu cheng
 * @function 提供空货箱类
 * @pattern Null Object
 */
public class NullBox implements AbstractBox
{
    /**
     * 获取货箱中的巧克力数量
     *
     * @pattern Null Object
     */
    @Override
    public void getChocolateCount()
    {
        System.out.println("使用空货箱类为没有装巧克力的货箱提供默认操作");
        System.out.println("==========使用空对象模式模式 NullObject==========");
        System.out.println("类名：NullBox");
        System.out.println("模式：NullObject");
        System.out.println("方法：NullBox.getChocolateCount()");
        System.out.println("============================================");
        System.out.println("白巧克力:0");
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
        System.out.println("这是个空货箱");
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
        return new ArrayList<>();
    }
}
