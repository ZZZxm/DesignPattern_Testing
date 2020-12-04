package MVC;


import Builder.Director;
import Builder.KeeperBuilder;
import Builder.WorkerBuilder;
import MVC.WorkerController;
import MVC.WorkerView;
import Worker.Worker;

/**
 * @author Miracle Ray
 * @project ChocolateFactory
 * @classname MVCTest
 * @description test for MVC
 * @date 2020/12/3
 */
public class MVCTest {
    static private Worker keeper;
    public static void main(String[] args){
        System.out.println("—————————————------------------------------------———— Test[MVC]Pattern —————————————------------------------------------————");
        System.out.println("Facade Test by Miracle Ray.");

        System.out.println("Create a Worker Object named keeper.");
        System.out.println("Then create a view to show model and a controller to do operation.");
        Director director = new Director();
        WorkerBuilder keeperBuilder = new KeeperBuilder();
        director.setBuilder(keeperBuilder);
        keeper = director.construct();
        Worker model = keeper;
        WorkerView view = new WorkerView();
        WorkerController controller = new WorkerController(model, view);
        controller.updateView();
        controller.setWorkerName("仓库管理员");
        controller.updateView();
        System.out.print("\n");

        System.out.println("Boundary Test: no boundary test.");
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
