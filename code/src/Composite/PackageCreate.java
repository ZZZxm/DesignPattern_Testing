package Composite;

import ChocolateFactory.ChocolatePlant;
import ChocolateFactory.Menu;
import Constant.Const;
import Ingredient.*;
import ChocolateFactory.Menu;

import java.util.Iterator;

/**
 * 原料包创建类
 *
 * @author hexian
 * @function 生成巧克力原料包
 * @pattern 组合模式(Composite Pattern)
 */

public class PackageCreate
{
    /**
     * 创建原料包的函数
     *
     * @param type 原料包种类
     * @return 一个原料包
     * @pattern Composite
     **/
    public static Bags create(String type)
    {
        System.out.println("============= 使用组合 Composite 模式 =============");
        System.out.println("类名：PackageCreate");
        System.out.println("模式：Composite");
        System.out.println("方法名：PackageCreate.create()");
        System.out.println("功能描述：将多种原料组合为一个原料包(Bags),简化多变量处理");
        System.out.println("================================================");
        Goods sp, sp1;
        Bags ingrePackage;

        //向原料包逐个加入原料

        if ("BlackPackage".equals(type))
        {
            ingrePackage = new Bags(Const.BLACK_PACKAGE);
            sp1 = new Goods("POWDER");

        } else
        {
            ingrePackage = new Bags(Const.WHITE_PACKAGE);
            sp1 = new Goods("MILK");
        }
        ingrePackage.add(sp1);

        sp = new Goods("LIQUOR");
        ingrePackage.add(sp);
        sp = new Goods("FAT");
        ingrePackage.add(sp);
        sp = new Goods("SUGAR");
        ingrePackage.add(sp);
        System.out.println("原料包创建成功，创建了一个" + type);

        //ingre_package.show();
        return ingrePackage;


    }

}
