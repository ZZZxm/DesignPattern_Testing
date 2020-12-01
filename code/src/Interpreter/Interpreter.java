package Interpreter;

/**
 * @author lv ziyuan
 * @function 计算巧克力的价格
 * @pattern 解释器模式(Interpreter Pattern)
 */
public interface Interpreter
{

    /**
     * 计算巧克力价格
     * @return 巧克力价格
     */
    double interpret();
}