package Visitor;

import Prototype.*;

/**
 *
 * 临时工编号访问者
 *
 * @author wangqiyun
 * @function 访问并输出临时工编号
 * @pattern 访问者模式(Visitor Pattern)
 */

public class numberVisitor implements Visitor
{

    /**
     * 访问某个临时工的编号
     *
     * @param worker 一个临时工
     * @pattern 访问者模式(Visitor Pattern)
     */
    @Override
    public void visit(casualLaborer worker)
    {
        System.out.println("该临时工的编号是：" + worker.getNumber());
    }
}
