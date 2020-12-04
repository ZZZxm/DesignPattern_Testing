package test;

import Chocolate.Chocolate;
import Criteria.CriteriaBlack;
import Criteria.CriteriaWhite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Y.C.Young
 * @classname FilterTest
 * @description Test for filter pattern
 * @date 2020/12/2 19:23
 */
public class FilterTest {

    public static void main(String[] args) {
        CriteriaWhite white = new CriteriaWhite();
        CriteriaBlack black = new CriteriaBlack();
        List<Chocolate> input = new ArrayList<Chocolate>();
        int[] colorArr = {0, 1, 3, 4, 0, 2, 1};
        System.out.print("巧克力输入序列为：");
        for (int i = 0; i < 7; i++) {
            Chocolate chocolate = new Chocolate();
            chocolate.initColor(colorArr[i]);
            input.add(chocolate);
            System.out.print(" " + chocolate.getColor());
        }
        System.out.println();

        List<Chocolate> white_list = white.catchCriteria(input);
        System.out.print("白巧克力序列为：");
        for (Chocolate temp : white_list) {
            System.out.print(" " + temp.getColor());
        }
        System.out.println();

        List<Chocolate> black_list = black.catchCriteria(input);
        System.out.print("黑巧克力序列为：");
        for (Chocolate temp : black_list) {
            System.out.print(" " + temp.getColor());
        }
        System.out.println();

        System.out.println("======================================");
    }

}
