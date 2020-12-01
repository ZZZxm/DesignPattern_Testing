package ExtensionObject;

import Chocolate.Chocolate;
import NullObject.AbstractBox;

/**
 * 大货箱接口
 *
 * @author fu cheng
 * @function 提供大货箱接口，扩展货箱接口
 * @pattern ExtensionObject
 */
public interface AbstractBigBox extends AbstractBox
{
    /**
     * 添加两个巧克力至货箱中
     *
     * @param chocolateA 需要添加的第一个巧克力
     * @param chocolateB 需要添加的第二个巧克力*
     * @pattern Extension Object
     */
    void addTwoChocolate(Chocolate chocolateA, Chocolate chocolateB);
}
