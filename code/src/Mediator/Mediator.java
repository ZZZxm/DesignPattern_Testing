package Mediator;

import java.io.Serializable;

/**
 * 中介者接口
 */
public interface Mediator extends Serializable
{
    /**
     * 产生同事类
     */
    void createColleagues();

    /**
     * 改变同事类
     */
    void colleagueChanged();
}
