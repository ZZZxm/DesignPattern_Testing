## Composite测试文档

### 测试逻辑

在巧克力加工厂中，使用创建原料包类PackageCreate作为原料创建接口，Ariticles为组件接口类，使用原料袋类Bags和物品类Goods进行实现。调用创建原料包类PackageCreate中的Create函数后，在判断了原料包种类后逐一向原料包中加入该种原料包相应原料。同时减少仓库中对应原料库存。使用Packeagecreate.create(String type)来获得一个原料包实例。

1. 用户通过Menu<Ingredient> _ingredientMenu输入系列需要使用的原料
2. 用户通过PackageCreate创建一个新的原料包类
3. 调用IngredientPackage.show()函数显示原料包中的原料

### 功能测试

![image-20201203005509999](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201203005509999.png)

## 评分

| 设计模式  | Class/Interface API   | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| --------- | --------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Composite | Packeagecreate.create | 45                                         | 45                                                    |      |

