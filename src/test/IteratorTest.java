/**
 * @author Kerr
 * @classname IteratorTest
 * @description Test for Iterator Pattern
 * @date 2020/12/2 23:57
 */

public class IteratorTest {
    public static void main(String[] args) {
        ChocolatePlant plant = ChocolatePlant.getInstance();
        ChocolatePlant plant1 = ChocolatePlant.getInstance();
        System.out.println("[TEST] If Singleton pattern is implemented correctly,");
        System.out.println("[TEST] the following line should be \"true\":");
        System.out.print("[TESTOUT] ");
        System.out.println(plant == plant1);
    }
}