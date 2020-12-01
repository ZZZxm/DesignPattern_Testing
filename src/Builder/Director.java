package Builder;


import Worker.Worker;

/**
 * 指挥者
 *
 * @author liyuanfeng
 * @function 用于控制建造者创建工人
 * @pattern 建造者模式(builder)
 */
public class Director
{
    private WorkerBuilder builder;

    /**
     * 设置具体要使用的指挥者
     *
     * @param builder 用于建造工人的建造者
     */
    public void setBuilder(WorkerBuilder builder)
    {
        this.builder = builder;
    }

    /**
     * 指挥建造者建造工人
     *
     * @return 建造完成的工人
     */
    public Worker construct()
    {
        builder.createWorker();
        builder.assignType();
        builder.assignIdCard();
        builder.assignUniform();
        builder.assignPlace();
        System.out.println("工人新建成功");
        return builder.getWorker();
    }

}
