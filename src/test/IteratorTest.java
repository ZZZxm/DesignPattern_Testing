package test;

import ChocolateFactory.ChocolatePlant;
import ChocolateFactory.Menu;
import Ingredient.Ingredient;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Kerr
 * @classname IteratorTest
 * @description Test for Iterator Pattern
 * @date 2020/12/2 23:57
 */

public class IteratorTest {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("*           Iterator test start           *");
        System.out.println("===========================================");
        // create a factory
        ChocolatePlant chocolatePlant = ChocolatePlant.getInstance();

        // create Menu
        Menu<Ingredient> ingredientMenu;
        ingredientMenu = chocolatePlant.getIngredientMenu();

        // create Iterator
        Iterator<Ingredient> ingredientIter = ingredientMenu.iterator();

        // test
        while (ingredientIter.hasNext())
        {
            Ingredient ingredient = ingredientIter.next();
            System.out.println("the ingredient "+ingredient.type+"'s" +
                    " amount: "+ ingredient.leftAmount);
        }
        System.out.println("===========================================");
        System.out.println("*           Iterator test over           *");
        System.out.println("===========================================");
    }
}