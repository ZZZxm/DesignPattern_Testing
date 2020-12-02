package test;
import ChocolateFactory.Menu;
import Composite.*;
import Constant.Const;
import Ingredient.Ingredient;
//import org.junit.jupiter.api.Test;


import java.util.Iterator;
import java.util.Objects;

/**
 **组合模式测试类
 */

public class CompositeTest {

    public static void main(String[] args) {
        Menu<Ingredient> _ingredientMenu=new Menu<Ingredient>();
        Ingredient Liquor = new Ingredient(Const.IngredientType.LIQUOR);
        Ingredient Fat = new Ingredient(Const.IngredientType.FAT);
        Ingredient Powder = new Ingredient(Const.IngredientType.POWDER);
        Ingredient Sugar = new Ingredient(Const.IngredientType.SUGAR);
        Ingredient Milk = new Ingredient(Const.IngredientType.MILK);

        _ingredientMenu.add(Liquor);
        _ingredientMenu.add(Fat);
        _ingredientMenu.add(Powder);
        _ingredientMenu.add(Sugar);
        _ingredientMenu.add(Milk);

        //创建一个 新建原料包类
        PackageCreate temp = new PackageCreate();

        //Bags用于存放原料包
        String flavor=Const.BLACK_PACKAGE;
        Bags IngredientPackage;
        IngredientPackage = temp.create(Const.BLACK_PACKAGE);
        //IngredientPackage=temp.create(Const.WHITE_PACKAGE);

        //输出包内原料
        IngredientPackage.show();


    }


}