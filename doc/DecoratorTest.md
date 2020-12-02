## Decorator测试文档

### 测试逻辑

巧克力工厂出售巧克力的时候需要对巧克力进行包装，为了使产品更具有多样性满足不同需求，将巧克力分别包装为盒装和单个包装，为了防止工人混淆单个包装以及盒装，选择装饰器模式对巧克力包装进行解耦和封装。使用巧克力类中的setPack函数对巧克力进行包装，SetPack接口为包装抽象构建，Changer为包装的抽象装饰，Normal、Box为巧克力具体包装是Changer的子类。

调用Chocolate.setPack(String pack)去改变巧克力的外包装，其中参数pack表示包装类型的string，可以为normal或者box

### 测试用例

1. 用户创建一个Chocolate的对象
2. 用户使用setPack选择如何对于该巧克力进行包装
3. 巧克力包装完成

### 功能测试

![image-20201202171737893](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201202171737893.png)

![image-20201202172005877](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201202172005877.png)

## 评分

| 设计模式  | Class/Interface API  | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| --------- | -------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Decorator | setPack(String pack) | 50                                         | 49                                                    |      |

