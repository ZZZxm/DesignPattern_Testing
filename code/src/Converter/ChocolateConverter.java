package Converter;

import Chocolate.Chocolate;
import Memento.chocolateStateMemento;

/**
 * 巧克力转换器类
 *
 * @author zhouziyi
 * @function converter，实现dto（Data Transfer Object）对象和entity（实体）对象的转换
 * @pattern Converter
 **/
public class    ChocolateConverter extends Converter<chocolateStateMemento, Chocolate>
{

    /**
     * 初始化转换器
     *
     * @author zzy
     **/
    public ChocolateConverter()
    {
        super(chocolateState ->
        {
            Chocolate chocolate = new Chocolate();
            chocolateStateMemento.setMemento(chocolate, chocolateState);
            return chocolate;
        }, chocolateStateMemento::getMemento);
        System.out.println("你初始化了一个ChocolateConverter(转换器)");

    }

    public static void main()
    {
        // System.out.println("======== 使用 转换器 Converter模式 =======");
        Chocolate chocolate = new Chocolate();
        System.out.println("要转换的chocolate状态如下");
        chocolate.printChocolate();

        ChocolateConverter converter = new ChocolateConverter();
        chocolateStateMemento stateMemento = converter.convertFromEntity(chocolate);
        System.out.println("你使用了转换器模式获得一个dto");


        Chocolate converted = converter.convertFromDto(stateMemento);
        System.out.println("你使用转换器将dto转成了一个新的chocolate");
        System.out.println("它的状态如下");
        converted.printChocolate();
    }
}
