package Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * 临时工结构类
 *
 * @author wangqiyun
 * @function 提供被访问者列表以及对应访问方法的数据结构类
 * @pattern 访问者模式(Visitor Pattern)
 */
public class allWorker
{

    private final List<Worker> staffs = new LinkedList<>();

    /**
     * 向被访问的临时工列表添加临时工
     *
     * @param worker 一个临时工
     * @pattern 访问者模式(Visitor Pattern)
     */
    public void addStaffs(Worker worker)
    {
        staffs.add(worker);
    }


    /**
     * 使用某个访问者对列表中的每一个临时工进行访问
     *
     * @param visitor 一个访问者
     * @pattern 访问者模式(Visitor Pattern)
     */
    public void showReport(Visitor visitor)
    {
        for (Worker staff : staffs)
        {
            staff.accept(visitor);
        }
    }

}
