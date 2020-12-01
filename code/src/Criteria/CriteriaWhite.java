package Criteria;

import Chocolate.Chocolate;
import Constant.Const;

import java.util.ArrayList;
import java.util.List;


/**
 * 白巧克力过滤器
 * @function 过滤得到颜色为白色的所有巧克力
 * @pattern Filter
 * @author lv ziyuan
 */
public class CriteriaWhite implements Criteria
{

    /**
     * 构造函数
     */
    public CriteriaWhite()
    {

        System.out.println(
                "===========使用过滤器 Filter 模式===========\n" +
                        "类名：ChocolateWhite\n" +
                        "模式：Filter\n" +
                        "方法名：CriteriaWhite.CatchCriteria(List<Chocolate> Chocolates)\n" +
                        "功能描述：过滤生产出的白巧克力\n" +
                        "======================================");
    }

    /**
     * 过滤得到白巧克力
     *
     * @param chocolates 等待被过滤的巧克力列表
     * @return 过滤后的白巧克力列表
     */
    @Override
    public List<Chocolate> catchCriteria(List<Chocolate> chocolates)
    {
        List<Chocolate> whiteChocolates = new ArrayList<Chocolate>();
        for (Chocolate chocolate : chocolates)
        {
            if (chocolate.getColor().equalsIgnoreCase(Const.WHITE))
            {
                whiteChocolates.add(chocolate);
            }
        }
        return whiteChocolates;
    }

   /* test */
    /*
    public static void main(String[] args)
    {
        CriteriaWhite white = new CriteriaWhite();
        Chocolate coco = new Chocolate();
        coco.initColor(2);
        List<Chocolate> input = new ArrayList<Chocolate>();
        input.add(coco);
        List<Chocolate> whiteList = white.catchCriteria(input);
        System.out.println(whiteList.get(0).getColor());
    }*/

}
