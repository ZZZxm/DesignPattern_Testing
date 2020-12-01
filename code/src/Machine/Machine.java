package Machine;

import Chocolate.Chocolate;

/**
 * 巧克力生产机器接口
 *
 * @author liyuanfeng
 * @function 它为巧克力生产机器提供了一组规范的产品功能规约
 * @pattern 工厂方法模式(Factory Method Pattern)
 */

public interface Machine
{
    /**
     * 初始化机器，设置要生产的巧克力类型和初始状态（原料状态）
     */
    void init();

    /**
     * 完成原料烘培，完成烘培后巧克力进入已烘培状态
     */
    void baking();

    /**
     * 完成精炼，完成精炼后巧克力进入已精炼状态
     */
    void refining();

    /**
     * 完成冷却，完成冷却后巧克力进入冷却状态
     */
    void cooling();

    /**
     * 完成切割，完成切割后巧克力进入成品状态
     */
    void cutting();

    /**
     * 完成生产
     * @return 巧克力对象
     */
    Chocolate produce();


}
