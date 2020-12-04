package test;
import MonoState.HealthMachine;

import java.util.Scanner;


public class MonoStateTest {

    public static void main(String[] args) {
        HealthMachine Machine1 = new HealthMachine();

        HealthMachine Machine2 = new HealthMachine();



        while(true){
            try {
                System.out.println("-----------------------------Choose options---------------------------");
                System.out.println("**      1 --- Pass machine2 after scanning card at machine 1        **");
                System.out.println("**      2 --- Pass machine2 without scanning card at machine 1      **");
                System.out.println("**      3 --- Exit                                                  **");
                System.out.println("----------------------------------------------------------------------");
//                System.out.println("");
                Scanner reader=new Scanner(System.in);
                int i;
                i = reader.nextInt();

                if(i == 1){
                    Machine1.scan();//刷卡
                    Machine2.pass();//通过
                }
                else if(i == 2) {
                    Machine2.pass();//报警
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
