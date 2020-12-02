## ExtensionObject

### 测试逻辑

扩展对象模式的重点是设计一个类以支持在不修改原有类的情况下提供其他方法或服务。

测试时主要测试原有类的功能以及采用ExtensionObject后的扩展功能。

### 测试用例

1. 首先生成原有类Box和扩展后的类BigBox。
2. 测试原有类Box的功能addChocolate。
3. 测试扩展类BigBox的原有功能addChocolate。
4. 测试扩展类BigBox的扩展功能addTwoChocolate。

### 功能测试

![ExtensionObject1](D:\tools\github\DesignPattern_Testing\img\ExtensionObject1.png)

![ExtensionObject2](D:\tools\github\DesignPattern_Testing\img\ExtensionObject2.png)

![ExtensionObject3](D:\tools\github\DesignPattern_Testing\img\ExtensionObject3.png)

## 评分

| 设计模式        | Class/Interface API                                          | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注                |
| --------------- | ------------------------------------------------------------ | ------------------------------------------ | ----------------------------------------------------- | ------------------- |
| ExtensionObject | Class：<br/>Box、BigBox<br/>Interface API ：<br/>addChocolate、<br/>addTwoChocolate | 25+23                                      | 25+25                                                 | 项目中存在同名类Box |

