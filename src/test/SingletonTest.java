import ChocolateFactory.ChocolatePlant;

/**
 * @author Ngae Zeh-ghau
 * @classname SingletonTest
 * @description Test for Singleton
 * @date 2020/12/2 10:00
 */
public class SingletonTest {
    public static void main(String[] args) {
        ChocolatePlant plant = ChocolatePlant.getInstance();
        ChocolatePlant plant1 = ChocolatePlant.getInstance();
        System.out.println("[TEST] If Singleton pattern is implemented correctly,");
        System.out.println("[TEST] the following line should be \"true\":");
        System.out.print("[TESTOUT] ");
        System.out.println(plant == plant1);
    }
}
