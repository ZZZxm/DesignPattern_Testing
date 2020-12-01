package Proxy;

import ChocolateFactory.ChocolatePlant;
import ChocolateFactory.MoneyManager;

/**
 * 工厂财产代理
 * @pattern Proxy
 * @author lv ziyuan
 */
public class ManagerProxy implements MoneyManager
{
    private double money;

    /**
     * 构造函数
     */
    public ManagerProxy()
    {
        ChocolatePlant chocolatePlant = ChocolatePlant.getInstance();
        money = chocolatePlant.getMoney();


        System.out.println(
                "============使用代理 Proxy 模式============\n" +
                        "类名：ManagerProxy\n" +
                        "模式：Proxy\n" +
                        "方法名：ManagerProxy.get_money(double m);ManagerProxy.reduce_money(double m);ManagerProxy.add_money(double m);\n" +
                        "功能描述：管理工厂的财产（查看，增加，删除）\n" +
                        "======================================");

    }

    /**
     * 获取工厂当前余额
     * @return 工厂当前余额
     */
    @Override
    public double getMoney()
    {
        System.out.println("Factory的财产有" + money + "元。");
        return money;
    }

    /**
     * 扣款
     * @param m 扣款金额
     * @return 扣款是否成功
     */
    @Override
    public boolean reduceMoney(double m)
    {
        if (money >= m)
        {
            money -= m;
            ChocolatePlant.getInstance().reduceMoney(m);
            System.out.println("Factory花了" + m + "元，余额为" + money + "元。");
            return true;
        }
        m -= money;
        System.out.println("Factory的财产不足" + m + "元，消费失败。");
        return false;
    }

    /**
     * 入账
     * @param m 入账金额
     */
    @Override
    public void addMoney(double m)
    {
        money += m;
        ChocolatePlant.getInstance().addMoney(m);
        System.out.println("Factory的财产增加" + m + "元,总财产为" + money + "元。");
    }

    /*public static void main(String[] args) {
        ManagerProxy a = new ManagerProxy();
        var b = a.get_money();
        var c = a.reduce_money(10.0);
        a.add_money(1.0);
        return;
    }*/
}