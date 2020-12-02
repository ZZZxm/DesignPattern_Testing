package test;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import AbstractFactory.Card;
import AbstractFactory.Uniform;

/**
 * @author Yuan.Cai
 * @project chocolateFactoryTest
 * @classname AbstractFactoryTest
 * @description Test for Design Pattern --- Abstract Factory
 * @date 2020/12/2 19:11
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("----------------------------- [Abstract Factory] Test --------------------------------");
        System.out.println("------------------------------- Test Date:2020/12/2 ----------------------------------");
        System.out.println("Test step1: get factory that produces card");
        AbstractFactory cardFactory = FactoryProducer.getFactory("CARD");
        System.out.println("Test step1 finished");
        System.out.println("Test step2: get factory that produces uniform");
        AbstractFactory uniformFactory = FactoryProducer.getFactory("UNIFORM");
        System.out.println("Test step2 finished");
        System.out.println("Test step3: cardFactory produces different cards");
        Card card1 = cardFactory.getCard("KEEPER");
        card1.produce();
        Card card2 = cardFactory.getCard("PRODUCER");
        card2.produce();
        Card card3 = cardFactory.getCard("PACKAGER");
        card3.produce();
        System.out.println("Test step3 finished");
        System.out.println("Test step4: uniformFactory produces different uniforms");
        Uniform uniform1 = uniformFactory.getUniform("RED");
        uniform1.make();
        Uniform uniform2 = uniformFactory.getUniform("BLUE");
        uniform2.make();
        Uniform uniform3 = uniformFactory.getUniform("YELLOW");
        uniform3.make();
        System.out.println("Test step4 finished");
        System.out.println("Test steps all finished!");
    }
}