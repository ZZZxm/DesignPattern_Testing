package PublishSubscribe;

/**
 *
 * 订阅者接口
 *
 * @author wangqiyun
 * @function 提供订阅者更新函数
 * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
 */
public interface Subscribe
{
    /**
     * 订阅者更新状态
     *
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    void update();
}
