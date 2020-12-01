package PublishSubscribe;

import java.util.Random;

/**
 *
 * 发布者类
 *
 * @author wangqiyun
 * @function 初始化发布者监测用户输入
 * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
 */
public class Load
{

    private final int publishId = new Random().nextInt(100);

    /**
     * 发布者创建
     *
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    public void load()
    {
        System.out.println("创建发布者" + getPublishId() + "监测用户订单。");
    }

    /**
     * 获取发布者Id
     *
     * @return Id 发布者Id
     * @pattern 发布/订阅模式(Publish/Subscribe Pattern)
     */
    public int getPublishId()
    {
        return publishId;
    }
}
