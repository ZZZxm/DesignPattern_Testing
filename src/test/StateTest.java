package test;

import Chocolate.Chocolate;
import Constant.Const;
import State.*;

import java.util.Scanner;

/**
 * @author lsy
 * @project chocolateFactory
 * @classname StateTest
 * @description Test for State Pattern
 * @date 2020/12/3 22:45
 */
public class StateTest {
    public static void main(String[] args){

        System.out.println("---------------------- State Test ----------------------");
        System.out.println("---                                                  ---");
        System.out.println("---              0 quit                              ---");
        System.out.println("---              1 baking the chocolate              ---");
        System.out.println("---              2 refining the chocolate            ---");
        System.out.println("---              3 cool down the chocolate           ---");
        System.out.println("---              4 cutting the chocolate             ---");
        System.out.println("---              5 finish the production process     ---");
        System.out.println("---                                                  ---");
        System.out.println("---Tips: You must take the order step by step!!      ---");
        System.out.println("--------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        int i;
        boolean flag = true;

        Chocolate chocolate1 = new Chocolate();
        chocolate1.printState();

        while(flag){
            System.out.print("Enter the order [0 to quit]:");
            i = input.nextInt();

            if((i == 1 && chocolate1.state.getState()!="待处理")
                    ||(i == 2 && chocolate1.state.getState()!="已烘焙")
                    ||(i == 3 && chocolate1.state.getState()!="已精炼")
                    ||(i == 4 && chocolate1.state.getState()!="已冷却")
                    ||(i == 5 && chocolate1.state.getState()!="已切割")
            ){
                System.out.println("Please execute the order step by step!");
                continue;
            }

            switch (i){
                case 0:
                    flag = false;
                    break;
                case 1:{
                    System.out.println("baking the chocolate");
                    chocolate1.cook1();
                    chocolate1.printState();
                    break;
                }
                case 2:{
                    System.out.println("refining the chocolate");
                    chocolate1.cook2();
                    chocolate1.printState();
                    break;
                }
                case 3:{
                    System.out.println("cool down the chocolate");
                    chocolate1.cook3();
                    chocolate1.printState();
                    break;
                }
                case 4:{
                    System.out.println("cutting the chocolate");
                    chocolate1.cook4();
                    chocolate1.printState();
                    break;
                }
                case 5:{
                    System.out.println("finish the production process");
                    chocolate1.cook5();
                    chocolate1.printState();
                    break;
                }
                default:{
                    System.out.println("\nInvalid Input, Please input again.");
                    break;
                }
            }
        }
    }
}
