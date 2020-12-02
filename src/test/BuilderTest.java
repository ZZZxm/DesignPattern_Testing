package test;


import Builder.*;
import Worker.Worker;

/**
 * @author Yuan.Cai
 * @project chocolateFactoryTest
 * @classname BuilderTest
 * @description Test for Design Pattern --- Builder
 * @date 2020/12/2 20:57
 */
public class BuilderTest {
    public static void main(String[] args) {
        System.out.println("---------------------------------- [Builder] Test ------------------------------------");
        System.out.println("------------------------------- Test Date:2020/12/2 ----------------------------------");
        System.out.println("Test step1: get Director");
        Director director = new Director();
        System.out.println("Test step1 finished");
        System.out.println("Test step2: KeeperWorker creation testing");
        WorkerBuilder keeperBuilder = new KeeperBuilder();
        director.setBuilder(keeperBuilder);
        Worker a = director.construct();
        System.out.println("Test step2 finished");
        System.out.println("Test step3: ProducerWorker creation testing");
        WorkerBuilder producerBuilder = new ProducerBuilder();
        director.setBuilder(producerBuilder);
        Worker b = director.construct();
        System.out.println("Test step3 finished");
        System.out.println("Test step4: PackagerWorker creation testing");
        WorkerBuilder packagerBuilder = new PackagerBuilder();
        director.setBuilder(packagerBuilder);
        Worker c= director.construct();
        System.out.println("Test step4 finished");
        System.out.println("Test steps all finished!");
    }
}