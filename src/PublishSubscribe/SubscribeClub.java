package PublishSubscribe;

import java.util.LinkedList;

/**
 *
 * 订阅者大厅类
 *
 * @author wangqiyun
 * @function 初始化发布者和对于的订阅者并在发布者状态改变时通知所有订阅者更新
 * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
 */

public class SubscribeClub
{

    private Load load;

    private final LinkedList<Subscribe> subscribes = new LinkedList<>();

    /**
     * 设置发布者
     *
     * @param load 一个发布者
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    public void setLoad(Load load) {
        this.load = load;
    }

    /**
     * 发布者开始监测
     *
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    public void startLoad(){
        this.load.load();
    }

    /**
     * 设置订阅者
     *
     * @param subscribe 一个订阅者
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    public void setSubscribes(Subscribe subscribe)
    {
        this.subscribes.add(subscribe);
    }

    /**
     * 订阅者接触订阅
     *
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    public void unSubscribes()
    {
        this.subscribes.removeLast();
    }

    /**
     * 订阅者更新状态
     *
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    public void updateSubs()
    {
        for (Subscribe subscribe : this.subscribes)
        {
            subscribe.update();
        }
    }
}
