import Observer.ChocolateWarehouse;
import Observer.View;
import Chocolate.Chocolate;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname ObserverTest
 * @description TODO
 * @date 2020/12/3 21:15
 */
public class ObserverTest {

    public static void main(String[] args) {
        ChocolateWarehouse chocolateWarehouse = new ChocolateWarehouse();
        View view1 = new View(1);
        View view2 = new View(2);
        View view3 = new View(3);
        chocolateWarehouse.addObserver(view1);
        chocolateWarehouse.addObserver(view2);
        chocolateWarehouse.addObserver(view3);
        System.out.println("##############################################################");
        chocolateWarehouse.updateAllObservers();
        System.out.println("##############################################################");
        chocolateWarehouse.addChocolateToBox(new Chocolate());
        System.out.println("##############################################################");
        chocolateWarehouse.updateAllObservers();
        System.out.println("##############################################################");
    }
}
