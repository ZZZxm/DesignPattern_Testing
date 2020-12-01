package MVC;

import Worker.Worker;

/**
 * 工人控制器
 * @pattern  MVC
 * @author zzy
 **/
public class WorkerController
{

    private Worker model;
    private WorkerView view;

    public WorkerController(Worker model, WorkerView view)
    {
        this.model = model;
        this.view = view;
    }

    /**
     * 更改工人的名字
     *
     * @param name 要更改的工人的名字
     * @author zzy
     **/
    public void setWorkerName(String name)
    {
        System.out.println("通过控制器将工人姓名修改为：" + name);
        model.setName(name);

    }


    /**
     * 获取工人的名字
     *
     * @return 工人的名字
     * @author zzy
     **/
    public String getWorkerName()
    {
        return model.getName();
    }

    /**
     * 更新视图，有更改就要更新
     *
     * @author zzy
     **/
    public void updateView()
    {
        view.printWorkerDetails(model.getName());
    }


}
