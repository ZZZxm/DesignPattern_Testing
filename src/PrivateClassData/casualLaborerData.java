package PrivateClassData;

import java.util.Random;

/**
 *
 * 临时工私有数据类
 *
 * @author wangqiyun
 * @function 保存临时工私有数据
 * @pattern 私有类数据模式(PrivateClassData Pattern)
 */
public class casualLaborerData
{

    private int number;
    private String name;

    /**
     * 初始化临时工编号
     *
     * @pattern 私有类数据模式(PrivateClassData Pattern)
     */
    public void setNumber()
    {
        this.number = new Random().nextInt(100);
    }

    /**
     * 获取临时工编号
     *
     * @return number 该临时工编号
     * @pattern 私有类数据模式(PrivateClassData Pattern)
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * 初始化临时工名字
     *
     * @param name 临时工名字
     * @pattern 私有类数据模式(PrivateClassData Pattern)
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * 获取临时工名字
     *
     * @return name 临时工名字
     * @pattern 私有类数据模式(PrivateClassData Pattern)
     */
    public String getName()
    {
        return name;
    }
}
