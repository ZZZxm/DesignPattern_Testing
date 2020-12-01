package Command;


import Machine.Machine;

/**
 * 命令抽象类的实现类
 *
 * @author zhouziyi
 * @function 这个实现类实现了工人向机器发送命令
 * @pattern Command模式
 **/

public class MachineCommand implements Command
{
    private final Machine receiver;

    /**
     * 构造函数
     * @param receiver 接受操作的机器对象
     */
    public MachineCommand(Machine receiver)
    {
        this.receiver = receiver;
    }

    /**
     * 开始巧克力制作
     * @author zzy
     **/
    @Override
    public void startMachine()
    {
        System.out.println("======== 使用命令 Command 模式 ========");
        System.out.println("类名：MachineCommand");
        System.out.println("模式：Command");
        System.out.println("方法名：MachineCommand.startMachine()");
        System.out.println("功能描述：采用Command模式让工人操控机器生产巧克力");
        System.out.println("======================================");
        System.out.println("工人向机器下达了初始化命令");
        receiver.init();
        System.out.println("工人向机器下达了烘焙命令");
        receiver.baking();
        System.out.println("工人向机器下达了精炼命令");
        receiver.refining();
        System.out.println("工人向机器下达了冷却命令");
        receiver.cooling();
        System.out.println("工人向机器下达了切割命令");
        receiver.cutting();
    }


}




