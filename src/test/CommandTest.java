package test;

import Command.MachineCommand;
import Machine.DarkMachine;
import Machine.WhiteMachine;
import Worker.Worker;

import java.util.Scanner;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname CommandTest
 * @description CommandTest
 * @date 2020/12/1 18:47
 */
public class CommandTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Command] Test ------------------------------------");

        System.out.println("");
        System.out.println("MachineFactory : createMachine : 创建一台巧克力生产机.");
        System.out.println("MachineCommand : MachineCommand(Machine receiver) : 构造函数，指定接收命令的具体机器 .");
        System.out.println("MachineCommand：startMachine() : 机器开始工作，完成一系列具体的工作流程.");
        System.out.println("");

        Worker worker = new Worker();
        DarkMachine darkMachine = new DarkMachine();
        WhiteMachine whiteMachine = new WhiteMachine();

        System.out.println("");
        System.out.println("******  Command Test ****");
        System.out.println("***   1. 生产黑巧克力    ***");
        System.out.println("***   2. 生产白巧克力    ***");
        System.out.println("**** ********************");
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
                    MachineCommand command = new MachineCommand(darkMachine);
                    command.startMachine();
                    break;
                }
                case 2: {
                    MachineCommand command = new MachineCommand(whiteMachine);
                    command.startMachine();
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }   while (flag) ;
    }
}