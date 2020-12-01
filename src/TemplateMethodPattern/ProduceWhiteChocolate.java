package TemplateMethodPattern;

import Command.MachineCommand;
import Machine.*;
import Strategy.WhiteIngredient;
import Strategy.IngredientStrategy;
import Worker.Worker;

/**
 * 用于实现模版方法模式的白巧克力生产类
 * @function 该类的作用是实现在父类中定义的方法
 * @pattern TemplateMethod Pattern
 * @author hezehua
 */
public class ProduceWhiteChocolate extends ProduceChocolate {

    /**
     * 构造函数
     * @param m 机器
     * @param worker 工人
     */
    public ProduceWhiteChocolate(Machine m, Worker worker){
        this.m =m;
        this.worker =worker;
        machineCommand = new MachineCommand(this.m);
    }

    /**
     * 写入白巧克力开始生产的实际操作
     *
     * @author hzh
     **/
    @Override
    public void start() {
        machineCommand.startMachine();
    }

    /**
     * 写入白巧克力放入原料的实际操作
     *
     * @author hzh
     **/
    @Override
    public void addIngredient(){
        IngredientStrategy strategy = new WhiteIngredient();
        worker.setStrategy(strategy);
        worker.add();
    }

}
