package Adapter;

/**
 * 用于实现适配器模式的制作白巧克力的接口
 *
 * @function 该接口的作用是提供生产巧克力的方法
 * @pattern Adapter Pattern
 * @author hezehua
 */
public interface ChocolateMaker
{
    /**
     * 白巧克力机的生产函数
     *
     * @param chocolateType 要生产的巧克力类型
     * @author hzh
     **/
    void make(String chocolateType);
}
