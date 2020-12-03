import Builder.*;
import Chocolate.Chocolate;
import FactoryMethod.DarkMachineFactory;
import FactoryMethod.MachineFactory;
import FactoryMethod.WhiteMachineFactory;
import MVC.WorkerController;
import MVC.WorkerView;
import Machine.Machine;
import Observer.ChocolateWarehouse;
import Observer.View;
import TemplateMethodPattern.ProduceChocolate;
import TemplateMethodPattern.ProduceDarkChocolate;
import TemplateMethodPattern.ProduceWhiteChocolate;
import Worker.Worker;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname TemplateMethodTest
 * @description TODO
 * @date 2020/12/3 16:02
 */
public class TemplateMethodTest {

    private static Worker producer;
    private static Machine whiteMachine;
    private static Machine darkMachine;

    public static void main(String[] args) {
        init();
        ProduceChocolate wc = new ProduceWhiteChocolate(whiteMachine, producer);
        Chocolate product1 = wc.templateMethod();

        ProduceChocolate dc = new ProduceDarkChocolate(darkMachine, producer);
        Chocolate product2 = dc.templateMethod();
    }

    private static void init() {
        Worker keeper;
        Worker packager;
        ChocolateWarehouse chocolateWarehouse;

        Director director = new Director();
        WorkerBuilder keeperBuilder = new KeeperBuilder();
        director.setBuilder(keeperBuilder);
        keeper = director.construct();

        WorkerBuilder producerBuilder = new ProducerBuilder();
        director.setBuilder(producerBuilder);
        producer = director.construct();

        WorkerBuilder packagerBuilder = new PackagerBuilder();
        director.setBuilder(packagerBuilder);
        packager = director.construct();

        Worker model = keeper;
        WorkerView view = new WorkerView();
        WorkerController controller = new WorkerController(model, view);
        controller.updateView();
        controller.setWorkerName("仓库管理员");
        controller.updateView();
        model = producer;
        controller = new WorkerController(model, view);
        controller.updateView();
        controller.setWorkerName("生产车间员工");
        controller.updateView();
        model = packager;
        controller = new WorkerController(model, view);
        controller.updateView();
        controller.setWorkerName("包装室员工");
        MachineFactory factory = new WhiteMachineFactory();
        whiteMachine = factory.createMachine();
        factory = new DarkMachineFactory();
        darkMachine = factory.createMachine();
        chocolateWarehouse = new ChocolateWarehouse();
        chocolateWarehouse.addObserver(new View(1));
        chocolateWarehouse.addObserver(new View(2));
        chocolateWarehouse.addObserver(new View(3));
    }
}
