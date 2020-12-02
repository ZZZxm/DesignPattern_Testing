## AbstractFactory

### 测试逻辑

抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

测试时主要测试由超级工厂基类生成的具体工厂类能否完成预期的生产产品工作。

### 测试用例

1. 首先根据AbstractFactory基类生成两个具体工厂类，一个类为cardFactory，负责生产CARD，另一个类为uniformFactory，负责生产UNIFORM。
2. 测试cardFactory类能否生产不同类型的CARD：调用cardFactory类的getCard方法，然后对CARD进行produce。
3. 测试uniformFactory类能否生产不同类型的UNIFORM：调用uniformFactory类的getUniform方法，然后对UNIFORM进行make。

### 功能测试

![AbstractFactory](D:\tools\github\DesignPattern_Testing\img\AbstractFactory.png)

## 评分

| 设计模式        | Class/Interface API                                          | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| --------------- | ------------------------------------------------------------ | ------------------------------------------ | ----------------------------------------------------- | ---- |
| AbstractFactory | Class：<br/>AbstractFactory、Card、Uniform<br/>Interface API ：<br/>cardFactory.getCard、<br/>uniformFactory.getUniform、<br/>Card.produce、Uniform.make、FactoryProducer.getFactory | 25+25                                      | 25+25                                                 | 无   |

