package Observer;

/**
 * 仓库显示面板
 *
 * @author fu cheng
 * @function 仓库显示面板，作为观察者
 * @pattern Observer
 */
public class View implements ObserverView
{
    private final Integer id;

    public View(Integer id)
    {
        this.id = id;
    }

    /**
     * 更新观察者状态
     *
     * @param observable 被观察对象
     * @pattern Observer
     */
    @Override
    public void update(Observable observable)
    {
        System.out.println("显示面板View" + id.toString() + "当前的信息为:");
        observable.getChocolateCount();
    }

    /**
     * 获取当前观察者Id
     *
     * @return 观察者Id
     * @pattern Observer
     */
    @Override
    public int getId()
    {
        return this.id;
    }
}
