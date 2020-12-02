package test;


import ExtensionObject.BigBox;
import NullObject.Box;
import Chocolate.Chocolate;

/**
 * @author Yuan.Cai
 * @project chocolateFactoryTest
 * @classname ExtensionObjectTest
 * @description Test for Design Pattern --- Extension Object
 * @date 2020/12/2 20:23
 */
public class ExtensionObjectTest {
    public static void main(String[] args) {
        System.out.println("----------------------------- [Extension Object] Test --------------------------------");
        System.out.println("------------------------------- Test Date:2020/12/2 ----------------------------------");
        System.out.println("Test step1: get Box");
        Box box = new Box();
        System.out.println("Test step1 finished");
        System.out.println("Test step2: get extended class BigBox");
        BigBox bigBox = new BigBox();
        System.out.println("Test step2 finished");
        System.out.println("Test step3: Box function addChocolate testing");
        box.addChocolate(new Chocolate());
        System.out.println("Test step3 finished");
        System.out.println("Test step4: BigBox function addChocolate testing");
        bigBox.addChocolate(new Chocolate());
        System.out.println("Test step4 finished");
        System.out.println("Test step5: BigBox extended function addTwoChocolate testing");
        bigBox.addTwoChocolate(new Chocolate(), new Chocolate());
        System.out.println("Test step5 finished");
        System.out.println("Test steps all finished!");
    }
}