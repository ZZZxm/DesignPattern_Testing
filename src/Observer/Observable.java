package Observer;

/**
 * 被观察者
 *
 * @author fu cheng
 * @function 提供被观察者接口
 * @pattern Observer
 */
public interface Observable
{
    /**
     * 添加观察者
     *
     * @param observerView 需要被添加的观察者
     * @pattern Observer
     */
    void addObserver(ObserverView observerView);

    /**
     * 移除观察者
     *
     * @param observerView 需要被移除的观察者
     * @pattern Observer
     */
    void removeObserver(ObserverView observerView);

    /**
     * 更新所有的观察者
     *
     * @pattern Observer
     */
    void updateAllObservers();

    /**
     * 获取仓库中巧克力数量
     *
     * @pattern Observer
     */
    void getChocolateCount();
}
