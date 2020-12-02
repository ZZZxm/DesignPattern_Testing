package test;
import Proxy.ManagerProxy;

import java.util.Scanner;


/**
 * 代理模式测试类
 */

public class ProxyTest {

    public static void main(String[] args){
        ManagerProxy MoneyProxy = new ManagerProxy();
        while(true){
            try {
                System.out.println("-----------------------Choose options---------------------");
                System.out.println("**      1 --- Show the current money of the factory     **");
                System.out.println("**      2 --- Spend money                               **");
                System.out.println("**      3 --- Income money                              **");
                System.out.println("**      4 --- Exit                                      **");
                System.out.println("----------------------------------------------------------");
//                System.out.println("");
                Scanner reader=new Scanner(System.in);
                int i;
                i = reader.nextInt();

                if(i == 1){
                    MoneyProxy.getMoney();

                }
                else if(i == 2) {
                    Scanner num=new Scanner(System.in);
                    System.out.println("Please input the money the factory spent:");
                    int money;
                    money = reader.nextInt();
                    MoneyProxy.reduceMoney(money);

                }
                else if(i == 3) {
                    Scanner num=new Scanner(System.in);
                    System.out.println("Please input the money the factory income:");
                    int money;
                    money = reader.nextInt();
                    MoneyProxy.addMoney(money);
                }
                else if(i == 4){
                    break;
                }
                else{
                    System.out.print("Invalid Input, Please input again.\n");
                }
            } catch (Exception e) {
                System.out.print("Invalid Input, Please input again.\n");
            }
        }




        System.out.println("=============================================");
    }
}
