package test;

import Constant.Const;
import Interpreter.Parser;
import Interpreter.ParserException;

import java.util.Scanner;

/**
 * @author Kerr
 * @project test
 * @classname InterpreterTest
 * @description TODO
 * @date 2020/12/4 19:10
 */
public class InterpreterTest {
    public static void main(String args[]){
        System.out.println("Produce List: (please input it in follow way)");
        System.out.println("num1 * Black + num2 * White");
        System.out.println("* Don't forget the space!! *");
        Scanner input = new Scanner(System.in);
        String exp = input.nextLine();

        System.out.println(exp);
        try {
            System.out.println("got money: " + Parser.parse(exp).interpret());
        } catch (ParserException e) {
            e.printStackTrace();
        }
        System.out.println("======================================");
    }
}
