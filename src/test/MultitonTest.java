package test;

import java.util.Scanner;
import Multiton.Canteen;
import Constant.Const;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname MultitonTest
 * @description MultitonTest
 * @date 2020/12/1 18:49
 */
public class MultitonTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Multiton] Test ------------------------------------");

        System.out.println("");
        System.out.println("Canteen.getInstance(CanteenType type).enterCanteen():进入指定类型的食堂");
        System.out.println("");

        System.out.println("");
        System.out.println("*********************** Multiton Test **************************");
        System.out.println("***                  1. 员工进入普通食堂                        ***");
        System.out.println("***                  2. 员工进入清真食堂                        ***");
        System.out.println("***                  3. 员工进入素食食堂                        ***");
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
                    Canteen.getInstance(Const.CanteenType.GENERAL).enterCanteen();
                    break;
                }
                case 2: {
                    Canteen.getInstance(Const.CanteenType.HALAL).enterCanteen();
                    break;
                }
                case 3: {
                    Canteen.getInstance(Const.CanteenType.VEGETARIAN).enterCanteen();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
