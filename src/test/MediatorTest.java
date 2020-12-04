package test;

import ChocolateFactory.ChocolatePlant;
import Mediator.ingredientMediator;

/**
 * @author Kerr
 * @project test
 * @classname MediatorTest
 * @description TODO
 * @date 2020/12/4 22:09
 */
public class MediatorTest {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("*           Mediator test start           *");
        System.out.println("===========================================");
        //create a factory
        ChocolatePlant factory = ChocolatePlant.getInstance();

        // create a ingredientMediator object
        ingredientMediator ingredient_mediator = new ingredientMediator();

        // set the factory and ingredientMediator's attributes
        factory.setMediatorForFactory(ingredient_mediator);
        ingredient_mediator.setFactory(factory);
        factory.addMediatorForAll();

        // test the function
        ingredient_mediator.colleagueChanged();
        System.out.println("===========================================");
        System.out.println("*           Mediator test over            *");
        System.out.println("===========================================");
    }
}
