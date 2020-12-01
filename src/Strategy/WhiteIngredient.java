package Strategy;

import Composite.Bags;
import Composite.PackageCreate;
import Constant.Const;

/**
 * 添加原料的接口的实现类，实现添加白巧克力原料
 * @function 工人取回白巧克力的原料
 * @pattern 策略模式(Strategy)
 * @author liyuanfeng
 */
public class WhiteIngredient implements IngredientStrategy
{
    /**
     * 添加原料实现函数，实现的是添加黑巧克力原料
     */
    @Override
    public void addIngredients()
    {
        System.out.println("======== 使用策略 Strategy 模式 ========");
        System.out.println("接口名：IngredientStrategy");
        System.out.println("模式：Strategy");
        System.out.println("方法名：IngredientStrategy.addIngredients()");
        System.out.println("功能描述：采用相应的策略将原料包添加到机器中");
        System.out.println("======================================");
        System.out.println("当前使用的是添加白巧克力原料包策略");
        Bags ingredientBag = PackageCreate.create(Const.WHITE_PACKAGE);
        ingredientBag.show();
        System.out.println("成功将白巧克力原料包加入了机器中！");
        System.out.println("仓库MILK减少20");
        System.out.println("仓库SUGAR减少30");
        System.out.println("仓库LIQUOR减少15");
        System.out.println("仓库FAT减少10");
    }
}
