package ChocolateFactory;

/**
 * 财产管理
 *
 * @author lv ziyuan
 * @function 对工厂对财产进校管理
 * @pattern 代理模式(Proxy Pattern)
 */
public interface MoneyManager
{
    /**
     * 获取工厂的财产
     *
     * @return 财产的数值
     */
    double getMoney();

    /**
     * 使用工厂的财产
     *
     * @param m 扣款金额
     * @return 财产能否被使用
     */
    boolean reduceMoney(double m);

    /**
     * 增加工厂的财产
     * @param m 入账金额
     */
    void addMoney(double m);
}
