## Builder

### 测试逻辑

建造者模式指将一个复杂对象的构造过程拆解为多个步骤，多阶段创建过程能为每一步骤都能提供不同的解决方案，即产品的组成是不变的，但是产品的每一部分是可以灵活选择的。同时，这种模式同工厂模式一样实现了构造产品的封装，使得产品的创建与表示分离，用户只需要与指挥者类进行交互，而不需要关心产品是怎样进行构建的。

测试时主要测试指挥者类提供的API能否实现创建具有相同组成类型但不同组成成分的类。

### 测试用例

1. 首先生成指挥者类Director。
2. 测试keeperWorker类的创建过程。
3. 测试producerWorker类的创建过程。
4. 测试PackagerWorker类的创建过程。

### 功能测试

![Builder1](D:\tools\github\DesignPattern_Testing\img\Builder1.png)

![Builder2](D:\tools\github\DesignPattern_Testing\img\Builder2.png)

## 评分

| 设计模式 | Class/Interface API                                          | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| -------- | ------------------------------------------------------------ | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Builder  | Class：<br/>Director、WorkerBuilder、KeeperBuilder、ProducerBuilder、PackagerBuilder<br/>Interface API ：<br/>setBuilder、<br/>construct | 25+25                                      | 25+25                                                 | 无   |
