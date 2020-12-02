import Observer.ChocolateWarehouse;
import Servant.UpgradeServant;
import servanttestdependencies.*;

/**
 * @author Ngae Zeh-ghau
 * @classname ServantTest
 * @description Test for Servant
 * @date 2020/12/2 10:00
 */
public class ServantTest {
    public static void main(String[] args) {
        UpgradeServant servant = new UpgradeServant();
        ChocolateWarehouse warehouse = new ChocolateWarehouse();
        
        MyUpgradeServant servant2 = new MyUpgradeServant();
        MyArea myArea = new MyArea();
        servant2.upgrade(myArea, 1);
        servant.upgrade(myArea, 1);
        servant2.upgrade(warehouse, 1);

        servant.upgrade(warehouse, -1);
    }
}
