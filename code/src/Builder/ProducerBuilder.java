package Builder;

import AbstractFactory.*;
import Constant.Const;

/**
 * 生产工人建造者类
 *
 * @author liyuanfeng
 * @function 建造一个生产工人
 * @pattern 建造者模式(Builder)
 */
public class ProducerBuilder extends WorkerBuilder
{

    /**
     * 生产工人建造者类构造函数
     */
    public ProducerBuilder()
    {
        System.out.println("创建生产车间员工Builder，该Builder将新建一名生产车间员工(姓名默认为default）");
    }


    /**
     * 设置工人类型为生产工人
     */
    @Override
    public void assignType()
    {
        System.out.println("将工人类型设置为生产工人");
        worker.setType(Const.WorkerType.PRODUCER);
    }

    /**
     * 设置工人工作地点为车间
     */
    @Override
    public void assignPlace()
    {
        System.out.println("将工人安排至生产车间");
        worker.setPlace(Const.WorkPlace.WORKSHOP);
    }

    /**
     * 为该工人分配红色服装
     * 服装采用抽象工厂模式生产
     */
    @Override
    public void assignUniform()
    {
        //使用抽象工厂模式，生产相应的服装
        AbstractFactory uniformFactory = FactoryProducer.getFactory("UNIFORM");
        assert uniformFactory != null;
        Uniform uniform = uniformFactory.getUniform("RED");
        uniform.make();
        worker.setUniform(uniform);
        System.out.println("给该工人发放红色服装");
    }

    /**
     * 为工人分配生产车间员工工作证
     * 工作证采用抽象工厂模式生产
     */
    @Override
    public void assignIdCard()
    {
        //使用抽象工厂模式，生产相应的工作证
        AbstractFactory cardFactory = FactoryProducer.getFactory("CARD");
        assert cardFactory != null;
        Card card = cardFactory.getCard("PRODUCER");
        card.produce();
        worker.setCard(card);
        System.out.println("给该工人发放生产车间员工工作证");
    }
}
