package Builder;

import AbstractFactory.*;
import Constant.Const;

/**
 * @author liyuanfeng
 * @chinesename 仓库管理员建造者类
 * @function 建造一个仓库管理员
 * @pattern 建造者模式(Builder)
 */
public class KeeperBuilder extends WorkerBuilder
{

    /**
     * 仓库管理员建造者构造函数
     */
    public KeeperBuilder()
    {
        System.out.println("创建仓库管理员Builder，该Builder将新建一名仓库管理员(姓名默认为default）");
    }

    /**
     * 设置工人类型为仓库管理员
     */
    @Override
    public void assignType()
    {
        System.out.println("将工人类型设置为仓库管理员");
        worker.setType(Const.WorkerType.KEEPER);
    }

    /**
     * 设置工作地点为仓库
     */
    @Override
    public void assignPlace()
    {
        System.out.println("将该工人安排至仓库");
        worker.setPlace(Const.WorkPlace.WAREHOUSE);
    }

    /**
     * 为该工人分配黄色服装
     * 服装采用抽象工厂模式生产
     */
    @Override
    public void assignUniform()
    {
        //使用抽象工厂模式，生产相应的服装
        AbstractFactory uniformFactory = FactoryProducer.getFactory("UNIFORM");
        assert uniformFactory != null;
        Uniform uniform = uniformFactory.getUniform("YELLOW");
        uniform.make();
        worker.setUniform(uniform);
        System.out.println("给该工人发放黄色服装");
    }

    /**
     * 为工人分配仓库管理员工作证
     * 工作证采用抽象工厂模式生产
     */
    @Override
    public void assignIdCard()
    {
        //使用抽象工厂模式，生产相应的工作证
        AbstractFactory cardFactory = FactoryProducer.getFactory("CARD");
        assert cardFactory != null;
        Card card = cardFactory.getCard("KEEPER");
        card.produce();
        worker.setCard(card);
        System.out.println("给该工人发放仓库管理员工作证");
    }

}
