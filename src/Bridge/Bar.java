package Bridge;

/**
 * 设置巧克力为Bar
 *
 * @author hexian
 * @function 设置巧克力形状为Bar
 * @pattern 桥接模式(Bridge Pattern)
 */

public class Bar implements Size
{
    /**
     * 获取巧克力的形状
     *
     * @pattern Bridge
     */
    @Override
    public String getSize()
    {
        return "bar";
    }
}
