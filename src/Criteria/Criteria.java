package Criteria;

import java.util.List;

import Chocolate.Chocolate;

/**
 * @author lv ziyuan
 * @function 按颜色过滤巧克力
 * @pattern 过滤器模式(Filter Pattern)
 */

public interface Criteria
{
    /**
     * 按照标准过滤输入巧克力得到输出巧克力列表
     *
     * @param chocolates 等待被过滤的巧克力列表
     * @return 返回过滤完成得到的巧克力列表
     */
    List<Chocolate> catchCriteria(List<Chocolate> chocolates);

}


