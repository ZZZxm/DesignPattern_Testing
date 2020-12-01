package Criteria;

import Chocolate.Chocolate;
import Constant.Const;

import java.util.ArrayList;
import java.util.List;


/**
 * 黑巧克力过滤器
 * @function 过滤得到颜色为黑色的所有巧克力
 * @pattern Filter
 * @author lv ziyuan
 */
public class CriteriaBlack implements Criteria
{

    /**
     * 构造函数
     */
    public CriteriaBlack()
    {

        System.out.println(
                "===========使用过滤器 Filter 模式===========\n" +
                        "类名：ChocolateBlack\n" +
                        "模式：Filter\n" +
                        "方法名：CriteriaBlack.CatchCriteria(List<Chocolate> Chocolates)\n" +
                        "功能描述：过滤生产出的黑巧克力\n" +
                        "======================================");
    }

    /**
     * 过滤得到黑巧克力
     *
     * @param chocolates 等待被过滤的巧克力列表
     * @return 过滤后的黑巧克力列表
     */
    @Override
    public List<Chocolate> catchCriteria(List<Chocolate> chocolates)
    {
        List<Chocolate> blackChocolates = new ArrayList<Chocolate>();
        for (Chocolate chocolate : chocolates)
        {
            if (chocolate.getColor().equalsIgnoreCase(Const.BLACK))
            {
                blackChocolates.add(chocolate);
            }
        }
        return blackChocolates;
    }
}