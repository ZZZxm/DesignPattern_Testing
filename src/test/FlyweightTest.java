import Chocolate.Chocolate;
import Flyweight.Car;
import Flyweight.FlyweightFactory;

/**
 * @author Ngae Zeh-ghau
 * @classname FlyweightTest
 * @description Test for Flyweight
 * @date 2020/12/2 10:00
 */
public class FlyweightTest {
    public static void main(String[] args) throws InterruptedException {
        Chocolate[] chocolates = { new Chocolate(), new Chocolate(), new Chocolate() };
        Car car = FlyweightFactory.getFlyweight(2);
        Car car2 = FlyweightFactory.getFlyweight(2);
        System.out.println("[TEST] If Flyweight pattern is implemented correctly,");
        System.out.println("[TEST] the following line should be \"true\":");
        System.out.print("[TESTOUT] ");
        System.out.println(car == car2);
        try {
            car.operate(chocolates[0]);
            car2.operate(chocolates[1]);
        } catch (InterruptedException e) {
            System.err.println("Interrupted Exception!");
            throw e;
        }
        Car car_null = FlyweightFactory.getFlyweight(-1);
    }
}
