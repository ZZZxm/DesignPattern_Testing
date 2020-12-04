package test;
import Chocolate.*;

import java.util.Scanner;
//import org.junit.jupiter.api.Test;

/**
 * 装饰模式测试类
 */

public class DecoratorTest {

    public static void main(String[] args)
    {

        Chocolate t = new Chocolate();
        //显示当前巧克力包装
        t.display();
//   1
        //对巧克力进行包装


        while(true){
            try {
                System.out.println("--------------------Choose options------------------");
                System.out.println("**      1 --- Single package                      **");
                System.out.println("**      2 --- Box package                         **");
                System.out.println("**      3 --- Exit                                **");
                System.out.println("----------------------------------------------------");
//                System.out.println("");
                Scanner reader=new Scanner(System.in);
                int i;
                i = reader.nextInt();

                if(i == 1){

                    t.setPack("单个包装");
                }
                else if(i == 2) {

                    t.setPack("盒装");
                }
                else if(i == 3){
                    break;
                }
                else{
                    System.out.print("Invalid Input, Please input again.\n");
                }
            } catch (Exception e) {
                System.out.print("Invalid Input, Please input again.\n");
            }
        }

    }
}