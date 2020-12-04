package test;

import Machine.*;
import FactoryMethod.*;

/**
 * @author Y.C.Young
 * @classname FactoryMethodTest
 * @description Test for factory method pattern
 * @date 2020/12/2 17:40
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        MachineFactory wFactory = new WhiteMachineFactory();
        Machine whiteMachine = wFactory.createMachine();

        MachineFactory dFactory = new DarkMachineFactory();
        Machine darkMachine = dFactory.createMachine();
    }
}
