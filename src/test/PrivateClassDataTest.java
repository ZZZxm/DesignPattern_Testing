package test;

import Constant.Const;
import Multiton.Canteen;
import Prototype.casualLaborer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname PrivateClassDataTest
 * @description PrivateClassDataTest
 * @date 2020/12/4 20:24
 */
public class PrivateClassDataTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [PrivateClassDataTest] Test ------------------------------------");

        System.out.println("");
        System.out.println("casualLaborerData.getName()：获取临时工姓名");
        System.out.println("casualLaborerData.getNumber()：获取临时工编号");
        System.out.println("");

        System.out.println("");
        System.out.println("************************* PrivateClassDataTest Test *********************");
        System.out.println("***                           1. 创建临时工并保存信息                    ***");
        System.out.println("***                           2. 查看临时工信息                         ***");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        ArrayList<casualLaborer> workerList = new ArrayList<casualLaborer>();
        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    casualLaborer worker = new casualLaborer();
                    System.out.println("私有类数据模式生效：");
                    worker.setNumber();//私有类数据模式
                    String name;
                    System.out.println("请输入员工姓名");
                    name=input.next();
                    worker.setName(name);
                    workerList.add(worker);
                    break;
                }
                case 2: {
                    for(int i=0;i<workerList.size();i++){
                        System.out.println(workerList.get(i).getNumber());
                        System.out.println(workerList.get(i).getName());
                    }
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
