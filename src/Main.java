import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Adapter.ClassChocolateMaker;
import Builder.*;
import ChocolateFactory.ChocolatePlant;
import ChocolateFactory.Menu;
import Constant.Const;
import Converter.ChocolateConverter;
import Criteria.CriteriaBlack;
import Criteria.CriteriaWhite;
import Delegate.Printer;
import FactoryMethod.DarkMachineFactory;
import FactoryMethod.MachineFactory;
import FactoryMethod.WhiteMachineFactory;
import Flyweight.Car;
import Flyweight.FlyweightFactory;
import Ingredient.Ingredient;
import Interpreter.Parser;
import Interpreter.ParserException;
import MVC.WorkerController;
import MVC.WorkerView;
import Machine.Machine;
import Mediator.ingredientMediator;
import Memento.chocolateStateMemento;
import MonoState.HealthMachine;
import Multiton.Canteen;
import Observer.ChocolateWarehouse;
import Observer.View;
import Prototype.casualLaborer;
import Proxy.ManagerProxy;
import PublishSubscribe.Load;
import PublishSubscribe.SubscribeClub;
import Servant.UpgradeServant;
import Specification.DetailedSpecification.IsDark;
import Specification.DetailedSpecification.IsWhite;
import Specification.Specification;
import TemplateMethodPattern.ProduceChocolate;
import TemplateMethodPattern.ProduceDarkChocolate;
import TemplateMethodPattern.ProduceWhiteChocolate;
import Visitor.allWorker;
import Visitor.nameVisitor;
import Visitor.numberVisitor;
import Worker.Worker;
import Worker.WorkerManager;
import Chocolate.Chocolate;
import DAO.*;
import Immutable.*;

import javax.swing.plaf.IconUIResource;

/**
 * @author du mei/lv ziyuan/cao qinghua/he xian/li yuanfeng/he zehua/wang qiyun/fu cheng/zhou ziyi
 */
public class Main
{
    /**
     * 初始化巧克力工厂时设置的变量
     */
    static private ChocolatePlant factory;
    static private Worker keeper;
    static private Worker packager;
    static private Worker producer;
    static private Machine whiteMachine;
    static private Machine darkMachine;
    static private ChocolateWarehouse chocolateWarehouse;

    /**
     * 主函数
     *
     * @param args 无
     * @throws IOException                IO异常
     * @throws InterruptedException       Interrupted 异常
     * @throws CloneNotSupportedException 不支持 Clone 异常
     * @throws ParserException            Parser 异常
     */
    public static void main(String[] args) throws IOException, InterruptedException, CloneNotSupportedException, ParserException
    {
        init();
        mainMenu();
    }

    /**
     * 主菜单
     *
     * @throws IOException                IO异常
     * @throws InterruptedException       Interrupted 异常
     * @throws CloneNotSupportedException 不支持 Clone 异常
     * @throws ParserException            Parser 异常
     */
    public static void mainMenu() throws IOException, InterruptedException, CloneNotSupportedException, ParserException
    {
        while (true)
        {
            System.out.println("***********************************************************");
            System.out.println("                                                           ");
            System.out.println("                     欢迎来到巧克力工厂                        ");
            System.out.println("                                                           ");
            System.out.println("                     输入1进入工厂管理                        ");
            System.out.println("                     输入2进入原料管理                        ");
            System.out.println("                     输入3开始生产巧克力                       ");
            System.out.println("                     输入4查看员工设施                        ");
            System.out.println("                     输入5开始巧克力装车                      ");
            System.out.println("                     输入6查看模式总览表                      ");
            System.out.println("                     输入7退出巧克力工厂                      ");
            System.out.println("                                                           ");
            System.out.println("                     TongJi University                     ");
            System.out.println("                    Software Engineering                   ");
            System.out.println("************************************************************");
            System.out.print("巧克力工厂>");
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            switch (choice)
            {
                case "1":
                    factoryManage();
                    break;
                case "2":
                    ingredientManage();
                    break;
                case "3":
                    produceManage();
                    break;
                case "4":
                    workerFacility();
                    break;
                case "5":
                    loadTruck();
                    break;
                case "6":
                    showPatterns();
                    break;
                case "7":
                    printExit();
                    System.exit(0);
                default:
                    System.out.println("您输入的指令有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 输出退出信息
     */
    public static void printExit()
    {
        System.out.println("***********************************************************");
        System.out.println("                                                           ");
        System.out.println("                     退出巧克力加工厂                         ");
        System.out.println("                                                           ");
        System.out.println("                      感谢您的使用！                          ");
        System.out.println("                                                           ");
        System.out.println("                    TongJi University                      ");
        System.out.println("                  Software Engineering                     ");
        System.out.println("************************************************************");
    }

    /**
     * 工厂管理菜单
     */
    public static void factoryManage()
    {
        while (true)
        {
            System.out.println("***********************************************************");
            System.out.println("                                                           ");
            System.out.println("                     巧克力工厂-工厂管理                      ");
            System.out.println("                                                           ");
            System.out.println("                     输入1模拟财务管理                        ");
            System.out.println("                      输入2进行机器检修                       ");
            System.out.println("                       输入3升级工厂                         ");
            System.out.println("                      输入4退出至主菜单                       ");
            System.out.println("                                                           ");
            System.out.println("                    TongJi University                      ");
            System.out.println("                  Software Engineering                     ");
            System.out.println("************************************************************");
            System.out.print("巧克力工厂>工厂管理>");
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            switch (choice)
            {
                case "1":
                    manageMoney();
                    break;
                case "2":
                    machineRepair();
                    break;
                case "3":
                    factoryUp();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("您输入的指令有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 原料管理菜单
     *
     * @throws IOException          IO 异常
     * @throws InterruptedException Interrupted 异常
     */
    public static void ingredientManage() throws IOException, InterruptedException
    {
        while (true)
        {
            System.out.println("***********************************************************");
            System.out.println("                                                           ");
            System.out.println("                   巧克力工厂-原料管理                         ");
            System.out.println("                                                           ");
            System.out.println("                    输入1检查库存并进行采购                     ");
            System.out.println("                    输入2进行原料分类                          ");
            System.out.println("                    输入3退出至主菜单                        ");
            System.out.println("                                                           ");
            System.out.println("                    TongJi University                       ");
            System.out.println("                  Software Engineering                      ");
            System.out.println("************************************************************");
            System.out.print("巧克力工厂>原料管理>");
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            switch (choice)
            {
                case "1":
                    // 检查库存并进行采购
                    checkIngredient();
                    break;
                case "2":
                    // 对仓库中的原料进行分类
                    category();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("您输入的指令有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 生产巧克力菜单
     *
     * @throws IOException          IO 异常
     * @throws InterruptedException Interrupted 异常
     */
    public static void produceManage() throws IOException, InterruptedException
    {
        while (true)
        {
            System.out.println("***********************************************************");
            System.out.println("                                                           ");
            System.out.println("                    巧克力工厂-生产巧克力                      ");
            System.out.println("                                                           ");
            System.out.println("                     输入1生产条装白巧克力                     ");
            System.out.println("                     输入2生产块装黑巧克力                     ");
            System.out.println("                     输入3生产异常模拟                        ");
            System.out.println("                     输入4进行生产过程回溯                     ");
            System.out.println("                     输入5测试巧克力转换器                      ");
            System.out.println("                     输入6退出至主菜单                        ");
            System.out.println("                                                           ");
            System.out.println("                   TongJi University                       ");
            System.out.println("                  Software Engineering                     ");
            System.out.println("************************************************************");
            System.out.print("巧克力工厂>生产巧克力>");
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            switch (choice)
            {
                case "1":
                    whiteChocolateProduce();
                    break;
                case "2":
                    darkChocolateProduce();
                    break;
                case "3":
                    abnormalProduce();
                    break;
                case "4":
                    backTracing();
                    break;
                case "5":
                    converter();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("您输入的指令有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 员工设施菜单
     *
     * @throws IOException          IO 异常
     * @throws InterruptedException Interrupted 异常
     */
    public static void workerFacility() throws IOException, InterruptedException
    {
        while (true)
        {
            System.out.println("***********************************************************");
            System.out.println("                                                           ");
            System.out.println("                    巧克力工厂-员工设施                        ");
            System.out.println("                                                           ");
            System.out.println("                     输入1员工刷卡                           ");
            System.out.println("                     输入2进入食堂                           ");
            System.out.println("                     输入3进入办公室                          ");
            System.out.println("                     输入4退出至主菜单                        ");
            System.out.println("                                                           ");
            System.out.println("                   TongJi University                       ");
            System.out.println("                  Software Engineering                     ");
            System.out.println("************************************************************");
            System.out.print("巧克力工厂>员工设施>");
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            switch (choice)
            {
                case "1":
                    gotoWork();
                    break;
                case "2":
                    eatInCanteen();
                    break;
                case "3":
                    enterOffice();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("您输入的指令有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * converter
     */
    public static void converter()
    {
        System.out.println(
                "======== 使用转换器 Converter 模式 =========\n" +
                        "类名：ChocolateConverter\n" +
                        "模式：MConverter\n" +
                        "方法名：ChocolateConverter.main()\n" +
                        "功能描述：实现dto和实体对象之间的转换\n" +
                        "======================================");
        ChocolateConverter.main();
    }

    /**
     * 巧克力装车菜单
     *
     * @throws InterruptedException       Interrupted 异常
     * @throws CloneNotSupportedException 不支持 Clone 异常
     * @throws ParserException            Parser 异常
     */
    public static void loadTruck() throws InterruptedException, CloneNotSupportedException, ParserException
    {
        while (true)
        {
            System.out.println("***********************************************************");
            System.out.println("                                                           ");
            System.out.println("                    巧克力工厂-进行巧克力装车                   ");
            System.out.println("                                                           ");
            System.out.println("                     输入1模拟巧克力库存分类                    ");
            System.out.println("                     输入2进行装车                           ");
            System.out.println("                     输入3退出至主菜单                        ");
            System.out.println("                                                           ");
            System.out.println("                   TongJi University                       ");
            System.out.println("                  Software Engineering                     ");
            System.out.println("************************************************************");
            System.out.print("巧克力工厂>巧克力装车>");
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            switch (choice)
            {
                case "1":
                    filter();
                    break;
                case "2":
                    load();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("您输入的指令有误，请重新输入");
                    break;
            }
        }
    }

    /**
     * 对仓库中的原料进行分类
     */
    public static void category()
    {
        Ingredient[] ingredients = {
                new Ingredient(Const.IngredientType.MILK),
                new Ingredient(Const.IngredientType.SUGAR),
                new Ingredient(Const.IngredientType.FAT),
                new Ingredient(Const.IngredientType.POWDER),
                new Ingredient(Const.IngredientType.LIQUOR)
        };


        IsDark isDark = new IsDark();
        IsWhite isWhite = new IsWhite();

        System.out.println(
                "======== 使用规约 Specification  模式 =========\n" +
                        "类名：Specification\n" +
                        "模式：Specification\n" +
                        "方法名：Specification.isSatisfy()\n" +
                        "功能描述：使用规约模式对原料进行分类\n" +
                        "======================================");
        System.out.println("巧克力工厂对原料的分类采用了规约模式，共有2个初始规约法则：是白巧克力原料/是黑巧克力原料");

        System.out.println("组合得到三个具体规约法则。");
        Specification white_own = isWhite.and(isDark.not());
        System.out.println("是白巧克力的独有原料");
        Specification black_own = isDark.and(isWhite.not());
        System.out.println("是黑巧克力独有原料");
        Specification essential = isWhite.and(isDark);
        System.out.println("是两种巧克力共有原料");

        System.out.println("开始筛选：");
        System.out.println("1.筛选出白巧克力独有原料");
        for (int i = 0; i < ingredients.length; i++)
        {
            if (white_own.isSatisfiedBy(ingredients[i]))
            {
                System.out.println("筛选出:" + ingredients[i].type);
            }
        }
        System.out.println("2.筛选出黑巧克力独有原料");
        for (int i = 0; i < ingredients.length; i++)
        {
            if (black_own.isSatisfiedBy(ingredients[i]))
            {
                System.out.println("筛选出:" + ingredients[i].type);
            }
        }
        System.out.println("3.筛选出两种巧克力共有的原料");
        for (int i = 0; i < ingredients.length; i++)
        {
            if (essential.isSatisfiedBy(ingredients[i]))
            {
                System.out.println("筛选出:" + ingredients[i].type);
            }
        }
    }


    /**
     * 检查库存并进行采购
     */
    public static void checkIngredient()
    {
        System.out.println("巧克力工厂的原料管理采用了中介者模式，中介者会保证所有原料的数目都不低于500，如果检测到低于500的原料，中介者会自动完成采购");
        System.out.println(
                "======== 使用中介者 Mediator 模式 =========\n" +
                        "类名：ingredientMediator\n" +
                        "模式：Mediator\n" +
                        "方法名：ingredientMediator.colleagueChanged()\n" +
                        "功能描述：为工厂设置中介者，统一管理所有原料\n" +
                        "======================================");
        ingredientMediator ingredientmediator = new ingredientMediator();
        factory.setMediatorForFactory(ingredientmediator);
        ingredientmediator.setFactory(factory);
        factory.addMediatorForAll();
        ingredientmediator.colleagueChanged();
    }

    /**
     * 分类巧克力
     */
    public static void filter()
    {
        System.out.println("巧克力工厂的仓库内置了通过filter模式设计的分类器，这个过滤器可以自动完成巧克力的分类，下面对此过程进行模拟");
        CriteriaWhite white = new CriteriaWhite();
        CriteriaBlack black = new CriteriaBlack();
        List<Chocolate> input = new ArrayList<>();
        System.out.print("巧克力输入序列为：");
        for (int i = 0; i < 10; i++)
        {
            Chocolate coco = new Chocolate();
            coco.initColor(i % 3);
            input.add(coco);
            System.out.print(" " + coco.getColor());
        }
        System.out.println();

        List<Chocolate> whiteList = white.catchCriteria(input);
        System.out.print("白巧克力序列为：");
        for (Chocolate temp : whiteList)
        {
            System.out.print(" " + temp.getColor());
        }
        System.out.println();

        List<Chocolate> blackList = black.catchCriteria(input);
        System.out.print("黑巧克力序列为：");
        for (Chocolate temp : blackList)
        {
            System.out.print(" " + temp.getColor());
        }
        System.out.println();

        System.out.println("======================================");
    }

    /**
     * 员工刷卡上班
     */
    public static void gotoWork()
    {
        HealthMachine machine1 = new HealthMachine();
        machine1.scan();//刷卡
        HealthMachine machine2 = new HealthMachine();
        machine2.pass();//通过
        machine2.pass();//报警
    }

    /**
     * 员工在食堂用餐
     */
    public static void eatInCanteen()
    {
        Canteen.getInstance(Const.CanteenType.GENERAL).enterCanteen();
        Canteen.getInstance(Const.CanteenType.HALAL).enterCanteen();
        Canteen.getInstance(Const.CanteenType.VEGETARIAN).enterCanteen();
        Canteen.getInstance(Const.CanteenType.HALAL).enterCanteen();
    }

    /**
     * 进行生产回溯
     */
    public static void backTracing()
    {
        System.out.println("下面将对巧克力的生产流程进行回溯");
        System.out.println("======== 使用备忘录 Memento 模式 =========");
        System.out.println("类名：chocolateStateMemento");
        System.out.println("模式：Memento");
        System.out.println("方法名：chocolateStateMemento.main()");
        System.out.println("功能描述：显示巧克力现在的状态并回退巧克力状态");
        System.out.println("======================================");
        System.out.println("======== 使用责任链 使用Dirty Flag 模式 =========");
        System.out.println("类名：chocolateStateMemento");
        System.out.println("模式：Dirty Flag");
        System.out.println("方法名：chocolateStateMemento.main()");
        System.out.println("功能描述：使用flag判断巧克力回退能否继续进行");
        System.out.println("======================================");
        chocolateStateMemento.mememtoDirtyflag();
    }

    /**
     * 模拟财政管理
     */
    public static void manageMoney()
    {
        ManagerProxy moneyProxy = new ManagerProxy();
        moneyProxy.getMoney();
        moneyProxy.reduceMoney(10.0);
        moneyProxy.addMoney(1.0);
        System.out.print("\n");
    }

    /**
     * 维修机器
     */
    public static void machineRepair()
    {
        System.out.println("======== 使用责任链 Chain of Responsibility 模式 =========");
        System.out.println("类名：WorkerManager");
        System.out.println("模式：Chain of Responsibility");
        System.out.println("方法名：WorkerManager.repairMachine()");
        System.out.println("功能描述：依次查看工人是否有空检机器");
        System.out.println("======================================");

        WorkerManager.getInstance().addWorker(keeper);
        WorkerManager.getInstance().addWorker(producer);
        WorkerManager.getInstance().addWorker(packager);

        WorkerManager.getInstance().repairMachine();

        keeper.setBusy(true);
        WorkerManager.getInstance().repairMachine();

        producer.setBusy(true);
        WorkerManager.getInstance().repairMachine();

        packager.setBusy(true);
        WorkerManager.getInstance().repairMachine();


    }


    /**
     * 进行工厂升级
     */
    public static void factoryUp()
    {
        UpgradeServant servant = new UpgradeServant();
        System.out.println("======== 使用仆人 Servant 模式 =========");
        System.out.println("类名：UpgradeServant");
        System.out.println("模式：Servant");
        System.out.println("方法名：UpgradeServant.upgrade()");
        System.out.println("功能描述：给不同的对象执行共同的升级操作");
        System.out.println("======================================");
        // 待升级对象
        ChocolateWarehouse warehouse = new ChocolateWarehouse();
        /* 巧克力加工厂是单例模式，无需创建 */

        // 升级
        servant.upgrade(warehouse, 61.4);
        servant.upgrade(ChocolatePlant.getInstance(), 3.5);

        // 面积大于加工厂总面积
        servant.upgrade(warehouse, 592);

        // 余额不足
        servant.upgrade(ChocolatePlant.getInstance(), 703.3);
    }

    /**
     * 餐厅就餐
     */
    public static void canteenDining()
    {
        Canteen.getInstance(Const.CanteenType.GENERAL).enterCanteen();
        Canteen.getInstance(Const.CanteenType.HALAL).enterCanteen();
        Canteen.getInstance(Const.CanteenType.VEGETARIAN).enterCanteen();

        Canteen.getInstance(Const.CanteenType.HALAL).enterCanteen();
    }

    /**
     * 工厂初始化函数，这个函数将完成工厂基本设施的创建
     */
    public static void init()
    {
        System.out.println("巧克力工厂初始化中...");
        System.out.println("======== 使用单例 Singleton 模式 =========");
        System.out.println("类名：ChocolatePlant");
        System.out.println("模式：Singleton");
        System.out.println("方法名：ChocolatePlant.getInstance()");
        System.out.println("功能描述：全局唯一的巧克力加工厂实例");
        System.out.println("======================================");
        factory = ChocolatePlant.getInstance();
        System.out.println("获取巧克力加工厂的名称:" + factory.getName());
        System.out.println("获取巧克力加工厂的面积:" + factory.getArea());
        Director director = new Director();
        System.out.println("创建工人中...");
        System.out.println("======== 使用建造者 Builder 模式 ========");
        System.out.println("类名：Director");
        System.out.println("模式：Builder");
        System.out.println("方法名：Director.construct()");
        System.out.println("功能描述：采用Builder模式分步创建不同工人对象");
        System.out.println("======================================");
        System.out.println("======== 使用抽象工厂 Abstract Factory 模式 ========");
        System.out.println("类名：Card");
        System.out.println("模式：AbstractFactory");
        System.out.println("方法名：Card.produce()");
        System.out.println("功能描述：采用抽象工厂模式生产不同类型的服装和工作证");
        System.out.println("======================================");
        WorkerBuilder keeperBuilder = new KeeperBuilder();
        director.setBuilder(keeperBuilder);
        keeper = director.construct();
        System.out.print("\n");
        WorkerBuilder producerBuilder = new ProducerBuilder();
        director.setBuilder(producerBuilder);
        producer = director.construct();
        System.out.print("\n");
        WorkerBuilder packagerBuilder = new PackagerBuilder();
        director.setBuilder(packagerBuilder);
        packager = director.construct();
        System.out.print("\n");
        System.out.println("巧克力工厂对工人信息的管理采用了MVC模式，下面将使用MVC模式修改工人姓名并展示工人信息");
        System.out.println("======== ===========使用 模型-视图-控制器 MVC模式 =====================");
        System.out.println("类名：WorkerController/WorkerView");
        System.out.println("模式：MVC");
        System.out.println("方法：WorkerController.setWorkerName()/WorkerController.updateView()");
        System.out.println("功能描述：将工人信息的数据和操控分离，增强维护性和扩展性，同时简化测试");
        System.out.println("===================================================================");
        Worker model = keeper;
        WorkerView view = new WorkerView();
        WorkerController controller = new WorkerController(model, view);
        controller.updateView();
        controller.setWorkerName("仓库管理员");
        controller.updateView();
        System.out.print("\n");
        model = producer;
        controller = new WorkerController(model, view);
        controller.updateView();
        controller.setWorkerName("生产车间员工");
        controller.updateView();
        System.out.print("\n");
        model = packager;
        controller = new WorkerController(model, view);
        controller.updateView();
        controller.setWorkerName("包装室员工");
        controller.updateView();
        System.out.print("\n");
        System.out.println("创建机器中...");
        System.out.println("======== 使用工厂方法Factory Method模式 ========");
        System.out.println("接口名：MachineFactory");
        System.out.println("模式：Factory Method");
        System.out.println("方法：MachineFactory.createMachine()");
        System.out.println("功能描述：使用工厂方法模式创建生产不同巧克力的机器");
        System.out.println("=============================================");
        MachineFactory factory = new WhiteMachineFactory();
        whiteMachine = factory.createMachine();
        factory = new DarkMachineFactory();
        darkMachine = factory.createMachine();
        chocolateWarehouse = new ChocolateWarehouse();
        chocolateWarehouse.addObserver(new View(1));
        chocolateWarehouse.addObserver(new View(2));
        chocolateWarehouse.addObserver(new View(3));
        System.out.println("巧克力工厂初始化完毕\n");

    }

    /**
     * 生产白巧克力
     */
    public static void whiteChocolateProduce()
    {
        ProduceChocolate wc = new ProduceWhiteChocolate(whiteMachine, producer);
        Chocolate product = wc.templateMethod();
        System.out.println("下面将对巧克力进行包装...");
        System.out.println("巧克力的包装采用了装饰模式，具体包括了盒装和单个包装，演示白巧克力默认采用盒装");
        System.out.println("==========使用装饰模式 Decorator==========");
        System.out.println("类名：Changer");
        System.out.println("模式：Decorator");
        System.out.println("方法：Changer.setChange()/Changer.setChange()");
        System.out.println("============================================");
        product.setPack("盒装");
        /**
         * 生产一个白巧克力
         */
        Menu<Ingredient> menu = factory.getIngredientMenu();
        Iterator<Ingredient> iter = menu.iterator();
        Ingredient a = iter.next();
        a.leftAmount -= 20;
        a = iter.next();
        a = iter.next();
        a.leftAmount -= 15;
        a = iter.next();
        a.leftAmount -= 30;
        a = iter.next();
        a.leftAmount -= 10;
        System.out.println("下面将生产完成的巧克力转入仓库...");
        chocolateWarehouse.addChocolateToBox(new Chocolate());
        chocolateWarehouse.updateAllObservers();
    }

    /**
     * 生产黑巧克力
     */
    public static void darkChocolateProduce()
    {
        ProduceChocolate dc = new ProduceDarkChocolate(darkMachine, producer);
        Chocolate product = dc.templateMethod();
        System.out.println("下面将对巧克力进行包装...");
        System.out.println("巧克力的包装采用了装饰模式，具体包括了盒装和单个包装，演示黑巧克力默认采用单个包装");
        System.out.println("==========使用装饰模式 Decorator==========");
        System.out.println("类名：Changer");
        System.out.println("模式：Decorator");
        System.out.println("方法：Changer.setChange()/Changer.setChange()");
        System.out.println("============================================");
        product.setPack("单个包装");
        /**
         * 生产两个黑巧克力
         */
        Menu<Ingredient> menu = factory.getIngredientMenu();
        Iterator<Ingredient> iter = menu.iterator();
        Ingredient a = iter.next();
        a = iter.next();
        a.leftAmount -= 20;
        a = iter.next();
        a.leftAmount -= 15;
        a = iter.next();
        a.leftAmount -= 30;
        a = iter.next();
        a.leftAmount -= 10;
        System.out.println("下面将生产完成的巧克力转入仓库...");
        chocolateWarehouse.addChocolateToBox(new Chocolate(), new Chocolate());
        chocolateWarehouse.updateAllObservers();
    }

    /**
     * 抛出生产异常
     */
    public static void abnormalProduce()
    {
        ClassChocolateMaker chocolateMaker = new ClassChocolateMaker();

        chocolateMaker.make("white");
        chocolateMaker.make("dark");
    }

    /**
     * 巧克力装车
     */
    public static void load() throws CloneNotSupportedException, InterruptedException, ParserException
    {
        casualLaborer worker1 = new casualLaborer();
        System.out.println("\n保存搬运工信息");
        System.out.println("==========使用私有类数据模式 PrivateClassData==========");
        System.out.println("类名：casualLaborer");
        System.out.println("模式：PrivateClassData");
        System.out.println("方法：casualLaborer.setNumber()");
        System.out.println("============================================");
        worker1.setNumber();
        worker1.setName("老刘");
        System.out.println("\n临时工搬运货物到车上");
        System.out.println("==========使用原型模式 Prototype==========");
        System.out.println("类名：casualLaborer");
        System.out.println("模式：Prototype");
        System.out.println("方法：casualLaborer.clone()");
        System.out.println("============================================");
        casualLaborer worker2 = (casualLaborer) worker1.clone();
        worker2.setNumber();
        worker2.setName("老张");
        casualLaborer worker3 = (casualLaborer) worker1.clone();
        worker3.setNumber();
        worker3.setName("老李");
        System.out.println("\n输出搬运工个人信息");
        System.out.println("==========使用访问者模式 Visitor==========");
        System.out.println("类名：allWorker");
        System.out.println("模式：Visitor");
        System.out.println("方法：allWorker.addStaffs()/allWorker.showReport()");
        System.out.println("============================================");
        allWorker allworker = new allWorker();
        allworker.addStaffs(worker1);
        allworker.addStaffs(worker2);
        allworker.addStaffs(worker3);
        allworker.showReport(new nameVisitor());
        allworker.showReport(new numberVisitor());
        casualLaborer[] workers = new casualLaborer[3];
        workers[0] = worker1;
        workers[1] = worker2;
        workers[2] = worker3;
        SubscribeClub watcher = new SubscribeClub();
        watcher.setLoad(new Load());
        watcher.startLoad();
        watcher.setSubscribes(worker1);
        watcher.setSubscribes(worker2);
        watcher.setSubscribes(worker3);
        System.out.println("装入小车请输入1，装入大车请输入2");
        Scanner input = new Scanner(System.in);
        int contents = 0;
        while (true)
        {
            String in = input.next();
            if ("1".equals(in) || "2".equals(in))
            {
                contents = Integer.parseInt(in);
                System.out.println("\n检测到用户输入时令搬运工就绪");
                System.out.println("==========使用订阅发布模式 PublishSubscribe==========");
                System.out.println("类名：SubscribeClub");
                System.out.println("模式：PublishSubscribe");
                System.out.println("方法：SubscribeClub.updateSubs()");
                System.out.println("============================================");
                watcher.updateSubs();
                break;
            } else
            {
                System.out.println("请输入1或者2");
            }

        }

        ArrayList<Chocolate> whiteChocolates = chocolateWarehouse.getAllWhiteChocolates();
        ArrayList<Chocolate> blackChocolates = chocolateWarehouse.getAllBlackChocolates();
        ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>(whiteChocolates);
        chocolates.addAll(blackChocolates);
        System.out.println("生产清单：");
        String exp = blackChocolates.size() + " * " + Const.BLACK + " + " + whiteChocolates.size() + " * " + Const.WHITE;
        System.out.println(exp);
        System.out.println("出售将获得了以下金钱 ： " + Parser.parse(exp).interpret());
        System.out.println("======================================");
        int chocolateCount = chocolates.size();
        int count = 0;
        Car car1;

        System.out.println("\n创建货车");
        System.out.println("==========使用享元模式 Flyweight==========");
        System.out.println("类名：FlyweightFactory");
        System.out.println("模式：Flyweight");
        System.out.println("方法：FlyweightFactory.getFlyweight()");
        System.out.println("============================================");
        for (int a = 0; a < chocolateCount; a++)
        {//开始出库装车
            if (count > 2)
            {
                count = 0;
            }
            workers[count].getGoods(chocolates.get(a));

            car1 = FlyweightFactory.getFlyweight(contents);
            car1.operate(workers[count].loadGoods());
            workers[count].outGoods();
            if (a == chocolateCount - 1 && chocolateCount % 2 != 0 && contents == 2)
            {
                car1.outGoods();
            }
            count++;

        }

    }

    /**
     * 进入办公室函数
     */
    public static void enterOffice() throws IOException, InterruptedException
    {
        while (true)
        {
            System.out.println("************************************************************");
            System.out.println("                                                            ");
            System.out.println("                 巧克力工厂-员工设施-办公室                 ");
            System.out.println("                                                            ");
            System.out.println("                     输入1查看办公室                           ");
            System.out.println("                     输入2查看桌子状态                         ");
            System.out.println("                     输入3打印文件                            ");
            System.out.println("                     输入4返回员工设施                         ");
            System.out.println("                                                            ");
            System.out.println("                   TongJi University                        ");
            System.out.println("                  Software Engineering                      ");
            System.out.println("*************************************************************");
            System.out.print("巧克力工厂>员工设施>办公室>");
            Scanner input = new Scanner(System.in);
            String choice = input.next();
            switch (choice)
            {
                case "1":
                    getOffice();
                    break;
                case "2":
                    getTable();
                    break;
                case "3":
                    printFile();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("您输入的指令有误，请重新输入");
                    break;
            }
        }


    }

    /**
     * 输出办公室的编号和大小类型、更改办公室类型
     */
    public static void getOffice()
    {

        System.out.println("下面进入办公室");
        System.out.println("办公室采用了DAO模式，可以输出办公室的编号和大小类型、更改办公室类型");
        System.out.println("========使用数据访问对象模式 DataAccessObject========");
        System.out.println("类名：OfficeDAO");
        System.out.println("模式：DAO");
        System.out.println("方法：getAllOffice()/updateOffice()/deleteOffice()");
        System.out.println("=================================================");

        OfficeDAO officeDAO = new OfficeDAOImpl();

        //输出所有的办公室
        System.out.println("下面输出所有办公室");
        for (Office office : officeDAO.getAllOffice())
        {
            System.out.println("office: [number : "
                    + office.getNumber() + ", type : " + office.getType() + " ]");
        }
        //更新办公室
        System.out.println("下面更新办公室，即修改办公室0的类型");
        Office office = officeDAO.getAllOffice().get(0);
        office.setType("very big");
        officeDAO.updateOffice(office);

        //获取办公室
        System.out.println("下面输出更新后的办公室");
        System.out.println("office: [number : "
                + office.getNumber() + ", type : " + office.getType() + " ]");

    }


    /**
     * 使用不变模式table
     */
    public static void getTable()
    {

        System.out.println("办公室桌子采用了不变模式，使用不变类，不变类中的状态不能更改");
        System.out.println("==========使用不变模式 Immutable==============");
        System.out.println("类名：Immutable");
        System.out.println("模式：Immutable");
        System.out.println("方法：getState()");
        System.out.println("============================================");

        int state = 0;

        ImmutableTable u = new ImmutableTable();

        Integer serviceTime = 1;

        u.setNum(1);

        Immutable weak = new Immutable(state, u, serviceTime);

        System.out.println("原始值：桌子的状态值是" + weak.getState() + ",桌子的编号是"

                + weak.getTable().getNum() + ",桌子的使用时间是" + weak.getServiceTime() + "年");

        // 修改引用后

        state = 5;

        // ImmutableTable由于是可变对象引用，所以有影响

        u.setNum(2);

        serviceTime = 2;

        System.out.println("尝试修改桌子的状态值和使用时间后，桌子的状态值是：" + weak.getState() + ",桌子的编号是"

                + weak.getTable().getNum() + ",桌子的使用时间是" + weak.getServiceTime() + "年");
        System.out.println("不能修改桌子的状态值，使用了不变模式");

    }

    /**
     * 委托打印机进行打印4
     */
    public static void printFile()
    {
        System.out.println("在办公室使用打印机");
        System.out.println("============= 使用委托 Delegate 模式 =============");
        System.out.println("类名：Printer");
        System.out.println("模式：Delegate");
        System.out.println("方法名：BAWprint、Colorprint");
        System.out.println("功能描述：委托实际打印类进行打印");
        System.out.println("================================================");
        //建立一个委托打印类
        Printer printer = new Printer();
        System.out.println("创建了一个委托打印类");
        //委托类利用实际打印类进行打印
        printer.BAWprint();
        printer.colorPrint();
    }


    /**
     * 展示所有模式
     */
    public static void showPatterns()
    {
        System.out.println("===========================巧克力工厂设计模式总览表==========================");
        System.out.println("  模式名称:                  查看方式:");
        System.out.println("1.AbstractFactory          工厂初始化");
        System.out.println("2.Adapter                  生产巧克力>生产异常模拟");
        System.out.println("3.Bridge                   生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("4.Builder                  工厂初始化");
        System.out.println("5.Callback                 生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("6.ChainOfResponsibility    工厂管理>进行机器检修");
        System.out.println("7.Command                  生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("8.Composite                生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("9.Converter                生产巧克力>测试巧克力转换器");
        System.out.println("10.DAO                     查看员工设施>进入办公室>查看办公室");
        System.out.println("11.Decorator               生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("12.Delegate                查看员工设施>进入办公室>打印文件");
        System.out.println("13.DirtyFlag               生产巧克力>生产过程回溯");
        System.out.println("14.ExtensionObject         生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("15.Facade                  生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("16.FactoryMethod           工厂初始化");
        System.out.println("17.Filter                  巧克力装车>模拟巧克力分类");
        System.out.println("18.FlyWeight               巧克力装车>进行装车");
        System.out.println("19.Immutable               查看员工设施>进入办公室>查看桌子状态");
        System.out.println("20.Interpreter             巧克力装车>进行装车");
        System.out.println("21.Iterator                原料管理>检查库存并采购");
        System.out.println("22.Lazy Initialization     员工设施>进入食堂");
        System.out.println("23.Mediator                原料管理>检查库存并采购");
        System.out.println("24.Memento                 生产巧克力>生产过程回溯");
        System.out.println("25.MonoState               员工设施>员工刷卡");
        System.out.println("26.Multiton                员工设施>进入食堂");
        System.out.println("27.MVC                     工厂初始化");
        System.out.println("28.NullObject              生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("29.Observer                生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("30.PrivateClassData        巧克力装车>进行装车");
        System.out.println("31.Prototype               巧克力装车>进行装车");
        System.out.println("32.Proxy                   工厂管理>模拟财政管理");
        System.out.println("33.PublishSubscribe        巧克力装车>进行装车");
        System.out.println("34.Servant                 工厂管理>升级工厂");
        System.out.println("35.Singleton               工厂初始化");
        System.out.println("36.Specification           原料管理>进行原料分类");
        System.out.println("37.State                   生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("38.Strategy                生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("39.Visitor                 巧克力装车>进行装车");
        System.out.println("40.TemplateMethod          生产巧克力>生产条装白巧克力/生产巧克力>生产块装黑巧克力");
        System.out.println("========================================================================");
    }
}
