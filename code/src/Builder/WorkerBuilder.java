package Builder;

import Worker.Worker;

/**
 * 建造者抽象类
 *
 * @author liyuanfeng
 * @function 为建造者提供基本框架，以提高建造者可扩展性
 * @pattern 建造者模式(Builder)
 *
 */
public abstract class WorkerBuilder
{

    protected Worker worker;

    /**
     * 分配工人类型抽象方法
     */
    public abstract void assignType();

    /**
     * 分配工作地点抽象方法
     */
    public abstract void assignPlace();

    /**
     * 分配工作服装抽象方法
     */
    public abstract void assignUniform();

    /**
     * 分配工作证的抽象方法
     */
    public abstract void assignIdCard();

    /**
     * 创建工人的方法
     */
    public void createWorker()
    {
        System.out.println("创建了一名新的工人");
        worker = new Worker();
    }


    /**
     * 获取建造者建造的工人
     *
     * @return 建造者建造后的工人
     */
    public Worker getWorker()
    {
        return this.worker;
    }

}
