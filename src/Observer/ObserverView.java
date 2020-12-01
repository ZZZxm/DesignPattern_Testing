package Observer;

/**
 * 观察者
 *
 * @author fu cheng
 * @function 提供观察者接口
 * @pattern Observer
 */
public interface ObserverView
{
    /**
     * 更新观察者状态
     *
     * @param observable 被观察对象
     * @pattern Observer
     */
    void update(Observable observable);

    /**
     * 获取当前观察者Id
     *
     * @return 观察者Id
     * @pattern Observer
     */
    int getId();
}
