package TemplateMethodPattern;

import Command.MachineCommand;
import Machine.Machine;
import Worker.Worker;
import Chocolate.Chocolate;

/**
 * 用于实现模版方法模式的巧克力生产类
 *
 * @author hezehua
 * @function 该类的作用是封装生产巧克力的模版方法并定义需要在子类中实现的方法
 * @pattern TemplateMethod Pattern
 */
public abstract class ProduceChocolate
{
    Machine m;
    Worker worker;
    MachineCommand machineCommand;

    /**
     * 让工人添加原料
     *
     * @author hzh
     */
    public abstract void addIngredient();

    /**
     * 调用模版方法，规定巧克力生产流程
     *
     * @return chocolate 巧克力实例
     * @author hzh
     **/
    public Chocolate templateMethod() //模板方法
    {
        System.out.println("======== 使用模版方法 Template Method 模式 ========");
        System.out.println("类名：ProduceChocolate");
        System.out.println("模式：Template Method");
        System.out.println("方法名：ProduceChocolate.TemplateMethod()");
        System.out.println("功能描述：采用Template Method开始生产巧克力");
        System.out.println("======================================");

        calling();

        addIngredient();

        start();

        return m.produce();
    }

    /**
     * 通知工人进行生产
     *
     * @author hzh
     **/
    public void calling()
    {
        System.out.println("通知工人进行生产");
    }

    /**
     * 开始生产
     *
     * @author hzh
     */
    public abstract void start();

}
