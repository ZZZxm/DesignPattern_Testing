package Mediator;

/**
 * 同事接口
 *
 * @pattern Mediator
 * @author zzy
 */
public interface Colleague
{

    /**
     * 设置中介者
     *
     * @param mediator the mediator
     */
    void setMediator(Mediator mediator);

    /**
     * 赋予Colleague类功能
     */
    void setColleagueEnable();

}
