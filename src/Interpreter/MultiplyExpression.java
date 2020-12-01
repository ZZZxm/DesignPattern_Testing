package Interpreter;

/**
 * 读取乘法表达式
 * @author lv ziyuan
 * @pattern Interpreter
 */
public class MultiplyExpression implements Interpreter
{
    /**
     * 左、右子节点
     */
    private final Interpreter left;
    private final Interpreter right;

    /**
     * MultiplyExpression 构造函数
     */
    MultiplyExpression(Interpreter left, Interpreter right)
    {
        this.left = left;
        this.right = right;
    }

    /**
     * 计算巧克力价格
     * @author lv ziyuan
     * @return 乘法表达式的计算值
     */
    @Override
    public double interpret()
    {
        return left.interpret() * right.interpret();
    }
}