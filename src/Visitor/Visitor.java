package Visitor;

import Prototype.*;

/**
 *
 * 访问者接口
 *
 * @author wangqiyun
 * @function 定义访问者用于访问的方法
 * @pattern 访问者模式(Visitor Pattern)
 */

public interface Visitor
{

    /**
     * 访问某个临时工的信息
     *
     * @param worker 一个临时工
     * @pattern 访问者模式(Visitor Pattern)
     */
    void visit(casualLaborer worker);

}
