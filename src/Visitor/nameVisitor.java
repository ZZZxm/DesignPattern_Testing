package Visitor;

import Prototype.*;

/**
 *
 * 临时工名字访问者
 *
 * @author wangqiyun
 * @function 访问并输出临时工姓名
 * @pattern 访问者模式(Visitor Pattern)
 */
public class nameVisitor implements Visitor
{

    /**
     * 访问某个临时工的名字
     *
     * @param worker 一个临时工
     * @pattern 访问者模式(Visitor Pattern)
     */
    @Override
    public void visit(casualLaborer worker)
    {
        System.out.println("该临时工的名字是：" + worker.getName());
    }
}
