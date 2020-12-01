package Ingredient;

import Constant.Const;
import Mediator.Colleague;
import Mediator.ingredientMediator;
import Mediator.Mediator;


import javax.swing.plaf.nimbus.State;

/**
 * 原料类
 *
 * @function 用于给Mediator模式检测是否需要采购某一种原料
 * @pattern Mediator
 * @author zzy
 **/
public class Ingredient implements Colleague
{

    protected ingredientMediator ingredientMediator;

    public Const.IngredientType type;

    //剩余量
    public int leftAmount;

    /**
     * 构造函数
     * @param type 原料类型
     */
    public Ingredient(Const.IngredientType type)
    {
        //库存量
        this.leftAmount = 300;
        this.type = type;
    }

    /**
     * 消耗原料
     * @param state 巧克力状态
     */
    public void consumeIngredient(State state)
    {
        this.leftAmount--;
    }

    /**
     * 判断是否需要采购
     *
     * @return 返回是否需要采购
     * @author zzy
     **/
    public boolean isEnough()
    {
        return this.leftAmount >=500;
    }

    /**
     * 判断原料是否已经用完
     *
     * @return 返回是否已经用完
     * @author zzy
     **/
    public boolean isEmpty()
    {
        return this.leftAmount == 0;
    }


    /**
     * 购买原料
     * @param num 购买原料的数量
     */
    public void purchase(int num)
    {
        this.leftAmount += num;

    }

    /**
     * 取原料包时减少商品库存
     *
     * @author hexian
     **/
    public void consume()
    {
        this.leftAmount -= 90;
    }

    /**
     * 为车间对象设置中介者
     * @param mediator 中介者
     * @author zzy
     **/

    @Override
    public void setMediator(Mediator mediator)
    {
        ingredientMediator = (ingredientMediator) mediator;
    }

    /**
     * 赋予Colleague类功能
     * @author zzy
     **/
    @Override
    public void setColleagueEnable()
    {
        ingredientMediator.colleagueChanged();
    }

    /**
     * 确定原料种类
     * @return 是白巧克力true；黑巧克力false
     * @author caoqinghua
     */
    public boolean isWhite(){
        if(this.type== Const.IngredientType.POWDER){
            return false;
        }
        else{
            return true;
        }
    }
    /**
     * 确定原料种类
     * @return 是黑巧克力true；白巧克力false
     * @author caoqinghua
     */
    public boolean isDark(){
        if(this.type== Const.IngredientType.MILK){
            return false;
        }
        else{
            return true;
        }
    }

}
