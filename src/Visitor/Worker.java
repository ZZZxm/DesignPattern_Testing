package Visitor;

/**
 *
 * 被访问者接口
 *
 * @author wangqiyun
 * @function 定义被访问者用于接受访问者的方法
 * @pattern 访问者模式(Visitor Pattern)
 */

public interface Worker
{
    /**
     * 接受某个访问者的访问
     *
     * @param visitor 一个访问者
     * @pattern 访问者模式(Visitor Pattern)
     */
    public abstract void accept(Visitor visitor);
}
