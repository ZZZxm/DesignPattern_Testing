package Mediator;

import Ingredient.Ingredient;
import ChocolateFactory.Menu;
import ChocolateFactory.ChocolatePlant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 原料中介者
 * @pattern Mediator
 * @author zzy
 */
public class ingredientMediator implements Mediator
{
    private Menu<Ingredient> ingredientMenu;
    private HashSet<Ingredient> shortIngredients = new HashSet<>();
    //调用dm的
    private ChocolatePlant chocolatePlant;

    //设置数量不够的原材料的个数
    private int ingredientMaxLeast = 0;


    /**
     * 创建原料列表
     */
    @Override
    public void createColleagues()
    {

        ingredientMenu = chocolatePlant.getIngredientMenu();
    }


    /**
     * 购买原料
     * 包括检查需要购买的原材料有哪些（向Mediator报告）以及Mediator检查是否要购买，买多少
     *
     * @author zzy
     **/
    @Override
    public void colleagueChanged()
    {
        //每检查一次需要清空上一次需要采购的原材料列表
        shortIngredients.clear();
        if (ingredientMenu == null)
        {
            System.out.println("_ingredientMenu is null");
            return;
        }


        Iterator<Ingredient> ingredientIter = ingredientMenu.iterator();
        System.out.println("中介者会使用Iterator遍历所有原料并检查数目");
        System.out.println("==================使用迭代器 Iterator 模式===================");
        System.out.println("类名：MenuIterator");
        System.out.println("模式：Iterator");
        System.out.println("方法名：Iterator.hasNext()/Iterator.next()/Iterator.remove()");
        System.out.println("功能描述：实现一个原料管理迭代器，以便对所有原料进行管理");
        System.out.println("==========================================================");
        while (ingredientIter.hasNext())
        {
            Ingredient ingredient = ingredientIter.next();
            System.out.println("原料"+ingredient.type+"的数量为："+ ingredient.leftAmount);
            if (ingredient.isEmpty())
            {
                //如果没有了，立即购买
                System.out.println(ingredient.type + "原料没有了，立即购买500");
                ingredient.purchase(500);

            } else if (!ingredient.isEnough())
            {
                shortIngredients.add(ingredient);
            }


        }

        System.out.println("中介者将使用Iterator遍历所有不足的原料并进行采购:");
        if(shortIngredients.size()==0){
            System.out.println("所有原料均是充足的，不需要购买");
        }
        if (shortIngredients.size() >= ingredientMenu.getSize() - ingredientMaxLeast)
        {
            Iterator<Ingredient> shortIngredientIter = shortIngredients.iterator();
            //采购的原料总数
            while (shortIngredientIter.hasNext())
            {
                Ingredient shortIngredient = shortIngredientIter.next();
                //计算需要购买多少
                int shortNum = 500 - shortIngredient.leftAmount;
                //直接购买，增加库存到100
                System.out.println("购买"+shortIngredient.type + "原料" + shortNum);
                shortIngredient.purchase(shortNum);
            }
        }

    }

    /**
     * 设置中介者的边界条件
     * @author zzy
     **/
    public ingredientMediator()
    {
        shortIngredients = new HashSet<>();
        ingredientMaxLeast = 2;

        System.out.println("中介者初始化完成");


    }


    /**
     * 获取不足的材料
     *
     * @return 不足的材料
     * @author zzy
     **/
    public Set<Ingredient> getShortIngredient()
    {
        return shortIngredients;
    }

    public void setFactory(ChocolatePlant chocolatePlant)
    {
        this.chocolatePlant = chocolatePlant;
        createColleagues();
        if (ingredientMenu == null)
        {
            System.out.println("ingredientmenu is null in createcolleagues");
        }
    }
}

