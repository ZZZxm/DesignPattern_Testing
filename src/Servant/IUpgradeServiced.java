package Servant;

/**
 * 升级服务接口
 *
 * @author du mei
 * @function 为可以升级的类定义统一接口
 * @pattern Servant
 */
public interface IUpgradeServiced
{

    /**
     * 扩大面积接口函数
     *
     * @param area 待扩大的面积
     * @return 对象原来的面积
     */
    double expand(double area);

    /**
     * 获取升级的对象的名称
     *
     * @return 升级对象的名称
     */
    String getName();

    /**
     * 得到待升级对象的面积
     *
     * @return 升级对象当前面积
     */
    double getArea();
}
