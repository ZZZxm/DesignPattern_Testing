package test;
import Prototype.*;
import PublishSubscribe.Load;
import PublishSubscribe.SubscribeClub;

import java.util.Scanner;

public class PublishSubscribeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        casualLaborer worker1 = new casualLaborer();
        casualLaborer worker2 = (casualLaborer) worker1.clone();
        casualLaborer worker3 = (casualLaborer) worker1.clone();
        SubscribeClub watcher =new SubscribeClub();
        while(true){
            try {
                System.out.println("--------------------Choose options------------------");
                System.out.println("**      1 --- Recruit a publisher                 **");
                System.out.println("**      2 --- Publish an order                    **");
                System.out.println("**      3 --- Exit                                **");
                System.out.println("----------------------------------------------------");
//                System.out.println("");
                Scanner reader=new Scanner(System.in);
                int i;
                i = reader.nextInt();

                if(i == 1){

                    worker1.setNumber();
                    worker1.setName("老刘");

                    worker2.setNumber();
                    worker2.setName("老张");

                    worker3.setNumber();
                    worker3.setName("老李");

                    watcher.setLoad(new Load());
                    watcher.startLoad();

                    watcher.setSubscribes(worker1);
                    watcher.setSubscribes(worker2);
                    watcher.setSubscribes(worker3);

                }
                else if(i == 2) {
                    System.out.println("Please input the order you want to publish:");
                    Scanner sc1 = new Scanner(System.in);
                    String no = sc1.next();
                    System.out.println("The publisher pattern is valid :");
                    watcher.updateSubs();


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
