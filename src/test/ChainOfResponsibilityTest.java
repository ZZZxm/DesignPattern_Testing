package test;

import Worker.Worker;
import Worker.WorkerManager;

/**
 * @author Kerr
 * @project test
 * @classname ChainOfResponsibilityTest
 * @description TODO
 * @date 2020/12/4 20:51
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("*   Chain of Responsibility test start    *");
        System.out.println("===========================================");
        // no worker
        System.out.println("test 0: there is no worker");
        WorkerManager.getInstance().repairMachine();

        // nobody is available
        System.out.println("===========================================");
        System.out.println("test 1: nobody is available");
        // create 3 workers
        Worker worker1 = new Worker();
        worker1.setName("Jully");
        worker1.setBusy(true);
        Worker worker2 = new Worker();
        worker2.setName("Bieber");
        worker2.setBusy(true);
        Worker worker3 = new Worker();
        worker3.setName("Brian");
        worker3.setBusy(true);

        // add workers
        WorkerManager.getInstance().addWorker(worker1);
        WorkerManager.getInstance().addWorker(worker2);
        WorkerManager.getInstance().addWorker(worker3);

        // repair the machine
        WorkerManager.getInstance().repairMachine();
        System.out.println("===========================================");

        // someone is available
        System.out.println("test 2: someone is available");
        worker3.setBusy(false);
        WorkerManager.getInstance().repairMachine();
        System.out.println("===========================================");
        System.out.println("*    Chain of Responsibility test over    *");
        System.out.println("===========================================");
    }
}
