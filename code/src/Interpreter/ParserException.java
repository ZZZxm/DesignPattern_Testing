package Interpreter;

/**
 * 自定义的解析异常
 * @function 当发生语法错误会被Parser抛出，用来更快地定位错误
 */
public class ParserException extends Exception
{
    /**
     * 解析异常
     * @param msg 输出消息
     */
    public ParserException(String msg)
    {
        super(msg);
    }
}
