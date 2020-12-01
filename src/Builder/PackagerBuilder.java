package Builder;

import AbstractFactory.*;
import Constant.Const;

/**
 * @author liyuanfeng
 * @chinesename 包装室工人建造者类
 * @function 建造一个包装室工人
 * @pattern 建造者模式(Builder)
 */
public class PackagerBuilder extends WorkerBuilder
{

    /**
     * 包装室工人建造者构造函数
     */
    public PackagerBuilder()
    {
        System.out.println("创建包装室员工Builder，该Builder将新建一名包装室员工(姓名默认为default)");
    }


    /**
     * 设置工人类型为包装室工人
     */
    @Override
    public void assignType()
    {
        System.out.println("将工人类型设置为包装室工人");
        worker.setType(Const.WorkerType.PACKAGER);
    }

    /**
     * 设置工人工作地点为包装室
     */
    @Override
    public void assignPlace()
    {
        System.out.println("将工人安排至包装室");
        worker.setPlace(Const.WorkPlace.PACK_ROOM);
    }

    /**
     * 为该工人分配蓝色服装
     * 服装采用抽象工厂模式生产
     */
    @Override
    public void assignUniform()
    {
        //使用抽象工厂模式，生产相应的服装
        AbstractFactory uniformFactory = FactoryProducer.getFactory("UNIFORM");
        assert uniformFactory != null;
        Uniform uniform = uniformFactory.getUniform("BLUE");
        uniform.make();
        worker.setUniform(uniform);
        System.out.println("给该工人发放蓝色服装");
    }

    /**
     * 为工人分配包装室员工工作证
     * 工作证采用抽象工厂模式生产
     */
    @Override
    public void assignIdCard()
    {
        //使用抽象工厂模式，生产相应的工作证
        AbstractFactory cardFactory = FactoryProducer.getFactory("CARD");
        assert cardFactory != null;
        Card card = cardFactory.getCard("PACKAGER");
        card.produce();
        worker.setCard(card);
        System.out.println("给该工人发放包装室员工工作证");
    }
}
