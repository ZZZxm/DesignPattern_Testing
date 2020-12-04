import Constant.Const.CanteenType;
import Multiton.Canteen;

/**
 * @author Ngae Zeh-ghau
 * @classname LasyInitializationTest
 * @description Test for Lasy Initialization
 * @date 2020/12/2 10:00
 */
public class LasyInitializationTest {
    public static void main(String[] args) {
        Canteen canteen = Canteen.getInstance(CanteenType.HALAL);
        canteen.enterCanteen();
        Canteen canteen1 = Canteen.getInstance(CanteenType.VEGETARIAN);
        System.out.println("[TEST] Vegetarian canteen is instantiated");
        System.out.println("[TEST] if the following line is \"true\":");
        System.out.print("[TESTOUT] ");
        System.out.println(canteen1 != null);
        System.out.println("[TEST] But NO ONE has entered vegetarian canteen yet.");
        System.out.println("[TEST] Lasy Initialization pattern is NOT implemented correctly!");
    }
}
