package test;

import Chocolate.Chocolate;
import Memento.chocolateStateMemento;
import State.Finished;
import State.Refined;
import State.ToProcess;

/**
 * @author Y.C.Young
 * @classname DirtyFlagTest
 * @description Test for dirty flag pattern
 * @date 2020/12/2 17:55
 */
public class DirtyFlagTest {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate();
        boolean flag = false;

        System.out.println("\n==========创建一个巧克力对象，将其置为终态==========");
        chocolate.changeState(new Finished());
        System.out.print("此处输出巧克力当前状态：");
        chocolate.printState();
        System.out.println("=====下面更新其回退标记并检查其状态是否还可以回退=====");
        flag = chocolateStateMemento.setFlag(chocolate, flag);
        chocolateStateMemento.stateJudgement(flag);

        System.out.println("\n===============将该巧克力置为某中间态===============");
        chocolate.changeState(new Refined());
        System.out.print("此处输出巧克力当前状态：");
        chocolate.printState();
        System.out.println("=====下面更新其回退标记并检查其状态是否还可以回退=====");
        flag = chocolateStateMemento.setFlag(chocolate, flag);
        chocolateStateMemento.stateJudgement(flag);

        System.out.println("\n================将该巧克力置为初态=================");
        chocolate.changeState(new ToProcess());
        System.out.print("此处输出巧克力当前状态：");
        chocolate.printState();
        System.out.println("=====下面更新其回退标记并检查其状态是否还可以回退=====");
        flag = chocolateStateMemento.setFlag(chocolate, flag);
        chocolateStateMemento.stateJudgement(flag);

    }
}
