package NullObject;

import Chocolate.Chocolate;

import java.util.ArrayList;

/**
 * 货箱接口
 *
 * @author fu cheng
 * @function 提供货箱接口
 * @pattern Null Object
 */
public interface AbstractBox
{
    /**
     * 获取货箱中的巧克力数量
     *
     * @pattern Null Object
     */
    void getChocolateCount();

    /**
     * 添加巧克力
     *
     * @param chocolate 需要添加的巧克力
     * @pattern Null Object
     */
    void addChocolate(Chocolate chocolate);


    /**
     * 获取所有巧克力
     *
     * @return 巧克力数组
     * @pattern Null Object
     */
    ArrayList<Chocolate> getAllChocolates();
}
