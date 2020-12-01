package Servant;

import ChocolateFactory.ChocolatePlant;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * 升级仆人
 *
 * @author du mei
 * @function 给工厂、仓库升级，增大面积，扣除费用
 * @pattern Servant
 */
public class UpgradeServant implements Serializable
{

    /**
     * 给工厂升级，增大面积，扣除费用
     *
     * @param serviced 待升级的对象
     * @param area     待扩大的面积
     * @pattern Servant
     */
    public void upgrade(IUpgradeServiced serviced, double area)
    {

        double reduce = area * 125.5; // 每平方米25.5元
        DecimalFormat df = new DecimalFormat("0.00");

        //面积检查
        if (!(serviced instanceof ChocolatePlant) &&
                serviced.getArea() + area >= ChocolatePlant.getInstance().getArea())
        {
            System.out.println("面积超限：升级后面积大于加工厂总面积！");
            System.out.println("当前工厂总面积: " + ChocolatePlant.getInstance().getArea() + "平方米");
            System.out.println("仓库当前面积:  " + serviced.getArea() + "平方米");
            System.out.println("待升级面积:    " + area + "平方米\n");
            return;
        }

        //余额检查
        if (ChocolatePlant.getInstance().getMoney() < reduce)
        {
            System.out.println("工厂余额不足！");
            System.out.println("现有余额: " + df.format(ChocolatePlant.getInstance().getMoney()) + " RMB");
            System.out.println("需要钱款:  " + df.format(reduce) + " RMB\n");
            return;
        }

        //升级
        double origin = serviced.expand(area);
        ChocolatePlant.getInstance().reduceMoney(reduce);

        //升级信息输出
        System.out.println("'升级仆人'升级了： " + serviced.getName()
                + "\n面积从 " + origin + " 平方米升级至" + (origin + area) + " 平方米");

        System.out.println("扣款" + df.format(reduce) + " RMB，当前余额："
                + df.format(ChocolatePlant.getInstance().getMoney()) + " RMB\n");
    }
}
