package Specification.DetailedSpecification;

import Ingredient.Ingredient;
import Specification.CompositeSpecification;

/**
 * 具体规约
 *
 *  @author Cao Qinghua
 *  @function 定义白巧克力所需材料
 *  @pattern Specification Pattern
 */
public class IsWhite extends CompositeSpecification
{
    /**
     * 具体规约
     * @param params 要判断的对象
     * @return 是否是白巧克力所需材料
     * @pattern Specification Pattern
     **/
    @Override
    public boolean isSatisfiedBy(Object params)
    {
        Ingredient ingredient = (Ingredient) params;
        return ingredient.isWhite();
    }
}
