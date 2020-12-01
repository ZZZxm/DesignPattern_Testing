package Strategy;

/**
 * 取原料的接口
 *
 * @function 此接口可以实现将原料添加进机器中
 * @pattern 策略模式(Strategy)
 * @author liyuanfeng
 */
public interface IngredientStrategy
{
    /**
     * 添加原料
     */
    void addIngredients();
}

