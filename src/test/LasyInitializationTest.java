import Constant.Const.CanteenType;
import Multiton.Canteen;

/**
 * @author Ngae Zeh-ghau
 * @classname LasyInitializationTest
 * @description Test for LasyInitialization
 * @date 2020/12/2 10:00
 */
public class LasyInitializationTest {
    public static void main(String[] args) {
       Canteen canteen = Canteen.getInstance(CanteenType.HALAL);
       System.out.println(canteen == null);
       Canteen canteen2 = new Canteen();
    }
}
