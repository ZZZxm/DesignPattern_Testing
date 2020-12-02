import java.util.ArrayList;

import Chocolate.Chocolate;
import Facade.PutInAction;
import CallBack.CallBackInterface;

/**
 * @author Ngae Zeh-ghau
 * @classname CallbackTest
 * @description Test for Callback
 * @date 2020/12/2 10:00
 */
public class CallbackTest {
    public static void main(String[] args) {
        ArrayList<Chocolate> chocolateArrayList = new ArrayList<>();
        CallBackInterface callback = () -> System.out.println("Test String");
        new PutInAction().putInChocolate(callback, chocolateArrayList, new Chocolate());
    }
}
