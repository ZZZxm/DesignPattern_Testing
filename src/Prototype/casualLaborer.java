package Prototype;

import Chocolate.*;
import PublishSubscribe.*;
import Visitor.*;
import PrivateClassData.*;


/**
 *
 * 临时工类
 *
 * @author wangqiyun
 * @function 创建、克隆临时工，实现存取货物装车操作
 * @pattern 原型模式(Prototype Pattern)
 */
public class casualLaborer implements Cloneable, Worker, Subscribe
{

    /**
     * 临时工构造函数
     *
     * @pattern 原型模式(Prototype Pattern)
     */
    public casualLaborer()
    {
        System.out.println("招募临时工成功");
    }

    private Chocolate goods;
    private casualLaborerData casuallaborerdata = new casualLaborerData();

    /**
     * 初始化临时工编号
     *
     * @pattern 私有类数据模式(PrivateClassData Pattern)
     */
    public void setNumber()
    {
        casuallaborerdata.setNumber();
    }

    /**
     * 获取临时工编号
     *
     * @return number 该临时工编号
     * @pattern 私有类数据模式(PrivateClassData Pattern)
     */
    public int getNumber()
    {
        return casuallaborerdata.getNumber();
    }

    /**
     * 初始化临时工名字
     *
     * @param name 临时工名字
     * @pattern 私有类数据模式(PrivateClassData Pattern)
     */
    public void setName(String name)
    {
        casuallaborerdata.setName(name);
    }

    /**
     * 获取临时工名字
     *
     * @return name 临时工名字
     * @pattern 私有类数据模式(PrivateClassData Pattern)
     */
    public String getName()
    {
        return casuallaborerdata.getName();
    }

    /**
     * 获取货物
     *
     * @param goods 从仓库取得的货物
     * @pattern 原型模式(Prototype Pattern)
     */
    public void getGoods(Chocolate goods)
    {
        this.goods = goods;
    }

    /**
     * 货物装车
     *
     * @return goods 要装车的货物
     * @pattern 原型模式(Prototype Pattern)
     */
    public Chocolate loadGoods()
    {
        return this.goods;
    }

    /**
     * 货物清空
     *
     * @pattern 原型模式(Prototype Pattern)
     */
    public void outGoods()
    {
        this.goods = null;
    }

    /**
     * 克隆临时工
     *
     * @return cloneCasualLa 深度克隆得到的新临时工
     * @pattern 原型模式(Prototype Pattern)
     */
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        //casualLaborer cloneCasualLa = (casualLaborer)super.clone();
        System.out.println("克隆成功");
        casualLaborer cloneCasualLa = null;
        try
        {
            cloneCasualLa = (casualLaborer) super.clone();
            cloneCasualLa.getGoods(new Chocolate());
            cloneCasualLa.casuallaborerdata = new casualLaborerData();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return cloneCasualLa;
    }

    /**
     * 接受访问者访问
     *
     * @param visitor 一个访问者
     * @pattern 访问者模式(Visitor Pattern)
     */
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    /**
     * 更新临时工状态（实现Subscribe）
     *
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    @Override
    public void update()
    {
        System.out.println("订阅者" + getName() + "已就绪");
    }
}
