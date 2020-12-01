package Interpreter;

/**
 * 增添表达式
 * @author lv ziyuan
 * @pattern Interpreter
 */
public class AddExpression implements Interpreter
{

    /**
     * 左、右子节点
     */
    private final Interpreter left;
    private final Interpreter right;

    /**
     * AddExpression 构造函数
     */
    AddExpression(Interpreter left, Interpreter right)
    {
        this.left = left;
        this.right = right;
    }

    /**
     * 计算巧克力价值
     * @author lv ziyuan
     * @return 返回加法表达式的价值
     */
    @Override
    public double interpret()
    {
        return left.interpret() + right.interpret();
    }
}