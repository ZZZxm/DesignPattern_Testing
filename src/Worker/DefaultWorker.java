package Worker;


/**
 * 默认虚拟工人
 *
 * @author du mei
 * @function 是责任链的最后一名“虚拟工人”，若由它执行repair，表明所有工人都忙
 */
class DefaultWorker extends Worker
{

    /**
     * 构造虚拟工人
     *
     * @param root 责任链起始工人
     */
    public DefaultWorker(Worker root)
    {
        super();
        root.setNextWorker(this);
    }

    /**
     * 虚拟工人的repair machine
     * 表示所有工人正忙，无人处理；结束责任链
     */
    @Override
    public void repairMachine()
    {
        // no worker available
        System.out.println("所有的工人都正在忙，目前无法分配工人对机器进行检修\n");
    }

}