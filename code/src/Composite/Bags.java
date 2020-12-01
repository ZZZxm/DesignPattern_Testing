package Composite;

import java.util.ArrayList;

import Constant.Const;

/**
 * 原料包组件——包
 *
 * @author hexian
 * @function 建立一个包
 * @pattern 组合模式(Composite Pattern)
 */
public class Bags implements Articles
{
    private String name;     //名字
    private final ArrayList<Articles> bags = new ArrayList<Articles>();

    /**
     * 构造函数
     * @param name 原料包名称
     */
    public Bags(String name)
    {
        this.name = name;
    }

    /**
     * 加入物品
     *
     * @param c 原料组件接口
     * @pattern Composite
     */
    public void add(Articles c)
    {
        bags.add(c);
    }

    /**
     * 移除物品
     *
     * @param c 原料组件接口
     * @pattern Composite
     */
    public void remove(Articles c)
    {
        bags.remove(c);
    }

    /**
     * 获取包内子节点
     *
     * @param i 节点序号
     * @return 该序号的对象
     * @pattern Composite
     */
    public Articles getChild(int i)
    {
        return bags.get(i);
    }

    /**
     * 展示包内物品函数
     *
     * @pattern Composite
     */
    @Override
    public void show()
    {
        System.out.println("原料包中含有：");
        for (Object obj : bags)
        {
            ((Articles) obj).show();
        }
    }
}
