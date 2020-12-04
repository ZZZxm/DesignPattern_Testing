package test;

import Chocolate.Chocolate;
import Converter.ChocolateConverter;
import Memento.chocolateStateMemento;

import java.util.Scanner;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname ConverterTest
 * @description ConverterTest
 * @date 2020/12/1 18:49
 */
public class ConverterTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Converter] Test ------------------------------------");

        System.out.println("");
        System.out.println("ChocolateConverter.ChocolateConverter():初始化一个转换器，包括新建一个巧克力和它的快照.");
        System.out.println("Converter.converterFromEntity(Chocolate):ChocolateStateMemento:将Chocolate实体转换为对应的ChocolateStateMemento.");
        System.out.println("Converter.converterFromDto(ChocolateStateMemento):将ChocolateStateMemento转换为对应的Chocolate实体.");
        System.out.println("");

        Chocolate chocolate = new Chocolate();
        ChocolateConverter converter = new ChocolateConverter();
        chocolateStateMemento stateMemento = converter.convertFromEntity(chocolate);

        System.out.println("");
        System.out.println("*******************         Converter Test            **********************");
        System.out.println("***                 1. 查看巧克力当前状态                                   ***");
        System.out.println("***                 2. 将Chocolate实体转换为对应的ChocolateStateMemento     ***");
        System.out.println("***                 3. 将ChocolateStateMemento实体转换为对应的Chocolate     ***");
        System.out.println("****************************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    chocolate.printChocolate();
                    break;
                }
                case 2: {
                    stateMemento = converter.convertFromEntity(chocolate);
                    break;
                }
                case 3: {
                    chocolate = converter.convertFromDto(stateMemento);
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
