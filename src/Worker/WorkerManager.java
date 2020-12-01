package Worker;

import java.io.Serializable;


/**
 * 工人管理
 *
 * @author du mei
 * @function 添加工人；分配工人维修机器
 * @pattern Chain of Responsibility, Singleton
 */
public class WorkerManager implements Serializable
{

    Worker noWorkerAvailable; // 责任链最后一位虚拟工人，标记责任链结束
    Worker rootWorker;        // 责任链起始工人

    /**
     * 私有构造函数
     */
    private WorkerManager()
    {

        rootWorker = new Worker();
        noWorkerAvailable = new DefaultWorker(rootWorker);
        rootWorker.setBusy(true);

    }

    /**
     * 私有静态类，持有Worker Manager的唯一实例
     */
    private static class WorkerManagerHolder
    {
        private static final WorkerManager INSTANCE = new WorkerManager();
    }

    /**
     * 访问WorkerManager唯一实例的接口
     *
     * @return WorkerManager的唯一实例
     * @pattern Singleton
     */
    public static WorkerManager getInstance()
    {
        return WorkerManagerHolder.INSTANCE;
    }

    /**
     * 增加工人至责任链
     *
     * @param worker 待加入的工人
     */
    public void addWorker(Worker worker)
    {
        rootWorker.addNext(worker);
    }

    /**
     * 维修机器请求的调用接口
     * 调用责任链第一个对象(root)的repairMachine函数，开始传递维修请求。
     *
     * @pattern Chain of Responsibility
     */
    public void repairMachine()
    {
        System.out.println("开始分配工人对机器进行检修...");
        rootWorker.getNextWorker().repairMachine();
    }


}
