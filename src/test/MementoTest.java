import Chocolate.Chocolate;
import Memento.*;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname MementoTest
 * @description TODO
 * @date 2020/12/3 21:42
 */
public class MementoTest {

    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate();
        chocolate.printState();
        chocolateStateMemento state0 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook1();
        chocolate.printState();
        //1
        chocolateStateMemento state1 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook2();
        chocolate.printState();
        //2
        chocolateStateMemento state2 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook3();
        chocolate.printState();
        //3
        chocolateStateMemento state3 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook4();
        chocolate.printState();
        //4
        chocolateStateMemento state4 = chocolateStateMemento.getMemento(chocolate);
        chocolate.cook5();
        chocolate.printState();
        //5

        chocolateStateMemento.setMemento(chocolate, state3);
        System.out.println("回退1步后巧克力状态如下");
        chocolate.printState();

        chocolateStateMemento.setMemento(chocolate, state2);
        System.out.println("回退2步后巧克力状态如下");
        chocolate.printState();

        chocolateStateMemento.setMemento(chocolate, state1);
        System.out.println("回退3步后巧克力状态如下");
        chocolate.printState();

        chocolateStateMemento.setMemento(chocolate, state0);
        System.out.println("回退4步后巧克力状态如下");
        chocolate.printState();
    }
}
