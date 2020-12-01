package Composite;

/**
 * 原料包组件——物品
 *
 * @author hexian
 * @function 建立一个物品
 * @pattern 组合模式(Composite Pattern)
 */
public class Goods implements Articles
{
    private String name;     //名字
    //private int quantity;    //数量

    /**
     * 初始化物品
     *
     * @param name 物品名字
     * @pattern Composite
     */
    public Goods(String name)
    {
        this.name = name;
        //this.quantity = quantity;
    }

    /**
     * 展示物品属性函数
     *
     * @pattern Composite
     */
    @Override
    public void show()
    {
        System.out.println(name);
    }
}
