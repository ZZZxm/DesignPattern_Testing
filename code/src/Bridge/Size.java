package Bridge;

/**
 * 巧克力形状设置接口
 *
 * @author hexian
 * @function 设置巧克力形状
 * @pattern 桥接模式(Bridge Pattern)
 */

public interface Size
{
    /**
     * 展示巧克力的形状
     *
     * @return 巧克力形状
     * @pattern Bridge
     */
    String getSize();
}
