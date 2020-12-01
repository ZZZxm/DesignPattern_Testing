package Interpreter;

import java.rmi.UnexpectedException;

import static Constant.Const.*;

/**
 * 读取数值表达式
 * @author lv ziyuan
 * @pattern interpreter
 */
public class NumberExpression implements Interpreter
{
    /**
     * 转换的数值
     */
    double value;

    /**
     * NumberExpression构造函数
     */
    NumberExpression(String str)
    {
        if (Character.isDigit(str.charAt(0)))
        {
            this.value = Double.parseDouble(str);
        } else
        {
            try
            {
                this.value = getValue(str);
            } catch (UnexpectedException err)
            {
                err.printStackTrace();
            }
        }
    }

    /**
     * 获取巧克力价格
     * @return 巧克力价格
     */
    @Override
    public double interpret()
    {
        return value;
    }

    /**
     * 获取巧克力价格
     * @author lv ziyuan
     * @param str 用户输入字符串的分割单元
     * @return 字符串对应数值
     * @throws UnexpectedException 当解析出现错误时抛出UnexpectedException异常
     */
    public static double getValue(String str) throws UnexpectedException
    {
        switch (str)
        {
            case BLACK:
                return BLACK_MONEY;
            case WHITE:
                return WHITE_MONEY;
            default:
                throw new UnexpectedException("Invalid Operator!");
        }
    }
}
