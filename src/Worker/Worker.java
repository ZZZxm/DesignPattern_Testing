package Worker;

import AbstractFactory.Card;
import AbstractFactory.Uniform;
import Command.Command;
import Command.MachineCommand;
import Constant.Const;
import Strategy.IngredientStrategy;

import java.io.Serializable;

/**
 * 工人
 *
 * @author li yuanfeng, zhou ziyi, du mei
 */
public class Worker implements Serializable
{
    private String name;
    private Const.WorkerType type;//工人的类型
    private Const.WorkPlace workPlace;//工人的工作地点
    private Uniform uniform;//工人的服装
    private Card card;//工人的工作证

    private Worker nextWorker; //责任链的下一位工人

    private boolean busy; //创建工人的工作状态，判断是否在工作

    /**
     * 构造工人
     */
    public Worker()
    {
        name = "default";
        this.busy = false;
    }

    /**
     * 内置的策略类，用于决定将哪种原料添加进机器
     **/
    private IngredientStrategy strategy;

    /**
     * 设置策略
     * @param _strategy 策略
     */
    public void setStrategy(IngredientStrategy _strategy)
    {
        this.strategy = _strategy;
    }

    /**
     * 使用当前策略进行原料添加
     */
    public void add()
    {
        strategy.addIngredients();
    }

    /**
     * 设置工人忙碌状态
     *
     * @param busy true表示工人正在工作，false表示工人空闲
     */
    public void setBusy(boolean busy)
    {
        this.busy = busy;
    }

    /**
     * 询问工人忙碌状态
     *
     * @return true表示工人正在工作，false表示工人空闲
     */
    public boolean isBusy()
    {
        return this.busy;
    }

    /**
     * 设置责任链中该工人的下一位工人
     * 是类的私有函数
     *
     * @param worker 下一位工人
     */
    protected void setNextWorker(Worker worker)
    {
        this.nextWorker = worker;
    }

    /**
     * 得到责任链中下一位工人
     *
     * @return 责任链中的下一位工人
     */
    protected Worker getNextWorker()
    {
        return this.nextWorker;
    }


    /**
     * 设置工人姓名
     *
     * @param _name 将要设置的名字
     */
    public void setName(String _name)
    {
        this.name = _name;
    }

    /**
     * 设置工人的类型
     *
     * @param _type 将要设置的类型
     */
    public void setType(Const.WorkerType _type)
    {
        this.type = _type;
    }

    /**
     * 设置工人的工作地点
     *
     * @param _workPlace 将要设置的工作地点
     */
    public void setPlace(Const.WorkPlace _workPlace)
    {
        this.workPlace = _workPlace;
    }

    /**
     * 设置工人的服装
     *
     * @param _uniform 将要发放的服装
     */
    public void setUniform(Uniform _uniform)
    {
        this.uniform = _uniform;
    }

    /**
     * 设置工人使用的工作证
     *
     * @param _card 将要发放的工作证
     */
    public void setCard(Card _card)
    {
        this.card = _card;
    }


    /**
     * 设置责任链中该工人的下一位工人
     * 是类外部调用的接口
     *
     * @param next 待加入责任链的工人
     * @pattern Chain of Responsibility
     */
    public void addNext(Worker next)
    {
        if (nextWorker instanceof DefaultWorker)
        {
            Worker w = this.nextWorker;
            this.nextWorker = next;
            next.setNextWorker(w);
        } else
        {
            nextWorker.addNext(next);
        }
    }

    /**
     * 工人维修机器
     * 如果当前对象不能维修，则调用责任链中下一个对象的repairMachine函数，传递职责。
     *
     * @pattern Chain of Responsibility
     */
    public void repairMachine()
    {
        if (!this.busy)
        {
            System.out.println("安排工人 " + getName() + " 对机器进行检修\n");
        } else
        {
            System.out.println("工人 " + getName() + " 正在忙");
            nextWorker.repairMachine();
        }
    }


    /**
     * 获取工人名字
     *
     * @return 工人的名字
     */
    public String getName()
    {
        return name;
    }



}