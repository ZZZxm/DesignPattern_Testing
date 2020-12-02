package servanttestdependencies;

import ChocolateFactory.ChocolatePlant;
import Servant.IUpgradeServiced;

/**
 * @author Ngae Zeh-ghau
 * @classname MyUpgradeServant
 * @description Custom implement of UpgradeServant, used in
 *              LasyInitializationTest.
 * @date 2020/12/2 10:00
 */
public class MyUpgradeServant {
    public void upgrade(IUpgradeServiced serviced, double area) {
        System.out.println("My upgrade begins...");
        if (!(serviced instanceof ChocolatePlant)
                && serviced.getArea() + area >= ChocolatePlant.getInstance().getArea()) {
            return;
        }
        double origin = serviced.expand(area);
        System.out.println("Upgraded " + serviced.getName() + " for free.");
        System.out.println("From " + origin + " m^2 to " + serviced.getArea() + " m^2.");
        System.out.println("");
    }
}