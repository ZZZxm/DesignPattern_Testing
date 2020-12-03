package Adapter;

import Adapter.ClassChocolateMaker;

/**
 * @author Miracle Ray
 * @project ChocolateFactory
 * @classname AdapterTest
 * @description test for Adapter
 * @date 2020/12/1
 */
public class AdapterTest {
    public static void main(String[] args){
        System.out.println("—————————————---------------------------------———— Test[Adapter]Pattern —————————————----------------------------------————");
        System.out.println("Adapter Test by Miracle Ray.");
        System.out.println("");

        System.out.println("First, create a white chocolate maker. It can produce white chocolate.");
        ClassChocolateMaker WhiteChocolateMaker = new ClassChocolateMaker();
        System.out.println("Use white chocolate maker to make a white chocolate.");
        String ChocolateTestType1 = "white";
        WhiteChocolateMaker.make(ChocolateTestType1);

        System.out.println("");
        System.out.println("Then, use the adapter to produce a dark chocolate with this white chocolate maker.");
        String ChocolateTestType2 = "dark";
        WhiteChocolateMaker.make(ChocolateTestType2);

        System.out.println("");
        System.out.println("Boundary Test");
        System.out.println("When user enter something in addition to these two types, like Milk or Matcha, program can't give warning information or any other responses.");
        System.out.println("Use white chocolate maker to make a matcha chocolate.");
        String ChocolateTestType3 = "Matcha";
        WhiteChocolateMaker.make(ChocolateTestType3);
        System.out.println("Use white chocolate maker to make a milk chocolate.");
        String ChocolateTestType4 = "Milk";
        WhiteChocolateMaker.make(ChocolateTestType4);

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }

}
