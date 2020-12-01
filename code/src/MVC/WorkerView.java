package MVC;

/**
 * 工人视图
 * @pattern MVC
 * @author zzy
 **/
public class WorkerView
{
    /**
     * 输出工人详细信息
     * @param workName 工人姓名
     */
    public void printWorkerDetails(String workName)
    {
        System.out.println("视图显示工人姓名：" + workName);
    }

}
