package Facade;

import Chocolate.Chocolate;
import Facade.AddChocolateFacade;

import java.util.ArrayList;

/**
 * @author Miracle Ray
 * @project ChocolateFactory
 * @classname FacadeTest
 * @description test for Facade
 * @date 2020/12/2
 */
public class FacadeTest {
    public static void main(String[] args){
        System.out.println("—————————————----------------------------------———— Test[Facade]Pattern —————————————----------------------------------————");
        System.out.println("Facade Test by Miracle Ray.");

        System.out.println("1. Create a chocolate list to store chocolate.");
        ArrayList<Chocolate> chocolateArrayList = new ArrayList<>();
        System.out.println("2. Create a Facade object to test facade pattern.");
        AddChocolateFacade addChocolateFacade = new AddChocolateFacade();
        System.out.println("3. Complete a series of motions to add individual chocolate.");
        addChocolateFacade.addChocolate(chocolateArrayList,new Chocolate());

        System.out.println("");
        System.out.println("Boundary Test: no boundary test.");
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
