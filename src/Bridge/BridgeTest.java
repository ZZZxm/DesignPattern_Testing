package Bridge;

import Bridge.Bar;
import Bridge.Piece;
import Bridge.Size;
import Chocolate.Chocolate;

/**
 * @author Miracle Ray
 * @project ChocolateFactory
 * @classname BridgeTest
 * @description test for Bridge
 * @date 2020/12/1
 */
public class BridgeTest {

    public static void main (String[] args){
        System.out.println("—————————————----------------------------------———— Test[Bridge]Pattern —————————————----------------------------------————");
        System.out.println("Bridge Test by Miracle Ray.");
        System.out.println("");

        System.out.println("First, create a new size class for bar.");
        Size bar = new Bar();
        System.out.println("This size is :"+bar.getSize()+".");

        System.out.println("Create a chocolate object.");
        Chocolate chocolate = new Chocolate();
        System.out.println("Set color of this chocolate to white.");
        chocolate.initColor(0);
        System.out.println("Set size of this chocolate to bar.");
        chocolate.setSize(bar);
        chocolate.bridgeShow();
        System.out.println("Set color of this chocolate to black.");
        chocolate.initColor(1);
        chocolate.bridgeShow();
        System.out.println("");

        System.out.println("Second, create a new size class for piece.");
        Size piece = new Piece();
        System.out.println("This size is :"+piece.getSize()+".");
        System.out.println("Create another chocolate object.");
        Chocolate ano_chocolate = new Chocolate();
        System.out.println("Set color of this chocolate to white.");
        ano_chocolate.initColor(0);
        System.out.println("Set size of this chocolate to piece.");
        ano_chocolate.setSize(piece);
        ano_chocolate.bridgeShow();
        System.out.println("Set color of this chocolate to black.");
        ano_chocolate.initColor(1);
        ano_chocolate.bridgeShow();

        System.out.println("");
        System.out.println("Boundary Test: no boundary test.");

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
