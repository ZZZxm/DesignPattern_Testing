package MonoState;

/**
 * 健康刷卡机
 *
 * @author lv ziyuan
 * @function 刷卡上班
 * @pattern MonoState
 */
public class HealthMachine
{
    /*
     * 刷卡机的状态定义
     */
    private static boolean isLocked = true;
    private static boolean isAlarming = false;
    private static int _scanNum = 0;
    /*
     * 不同状态机器的定义
     */
    protected final static HealthMachine LOCKED = new Locked();
    protected final static HealthMachine UNLOCKED = new Unlocked();
    protected static HealthMachine itsState = LOCKED;

    /**
     * 构造函数
     */
    public HealthMachine()
    {

        System.out.println(
                "========== 使用 MonoState 模式 ===========\n" +
                        "类名：HealthMachine\n" +
                        "模式：MonoState\n" +
                        "方法名：HealthMachine()\n" +
                        "功能描述：建立健康刷卡机，保证刷卡上班\n" +
                        "==========================================");

    }

    /**
     * 重置机器
     */
    public void reset()
    {
        lock(true);
        alarm(false);
        _scanNum = 0;
        itsState = LOCKED;
    }

    /**
     * 是否锁定
     * @return 是否已锁定
     */
    public boolean locked()
    {
        return isLocked;
    }

    /**
     * 是否警告
     * @return 是否被警告
     */
    public boolean alarm()
    {
        return isAlarming;
    }

    /**
     * 刷卡
     */
    public void scan()
    {
        itsState.scan();
    }

    /**
     * 通过
     */
    public void pass()
    {
        itsState.pass();
    }

    /**
     * 锁定
     * @param shouldLock 锁定状态
     */
    protected void lock(boolean shouldLock)
    {
        isLocked = shouldLock;
    }

    /**
     * 警告
     * @param shouldAlarm 警告状态
     */
    protected void alarm(boolean shouldAlarm)
    {
        isAlarming = shouldAlarm;
    }

    /**
     * 获取刷卡次数
     * @return 刷卡次数
     */
    public int refunds()
    {
        return _scanNum;
    }

    /**
     * 刷卡次数增加1次
     */
    public void deposit()
    {
        _scanNum++;
    }


    /**
     * 代表Locked状态机
     */
    static class Locked extends HealthMachine
    {
        /**
         * 扫描（刷卡）操作
         */
        @Override
        public void scan()
        {
            itsState = UNLOCKED;
            lock(false);
            alarm(false);
            deposit();
            System.out.println("已刷卡！");
        }

        /**
         * 锁定状态通过 会报警
         */
        @Override
        public void pass()
        {
            System.out.println("警告：非法入侵！");
            alarm(true);
        }

    }

    /**
     * 代表UnLocked状态机
     */
    static class Unlocked extends HealthMachine
    {
        /**
         * 非锁定状态禁止刷卡
         */
        @Override
        public void scan()
        {
            System.out.println("请勿重复刷卡！");
        }

        /**
         * 非锁定状态正常通行
         */
        @Override
        public void pass()
        {
            lock(true);
            itsState = LOCKED;
            System.out.println("请快速通行！");
        }
    }


}