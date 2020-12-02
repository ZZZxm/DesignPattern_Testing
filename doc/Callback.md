## CallbackTest

### 测试逻辑

根据Callback的逻辑，用户向调用实现回调机制的函数提供回调函数，回调函数会在适当的时机被调用。

### 测试用例

1. 用户生成了一个`ArrayList<Chocolate>`的空列表和一个`Chocolate`实例。
2. 用户生成了一个输出`"Test String"`的回调函数。
3. 用户通过PutInAction.putInChocolate()向列表加入实例，同时传入回调函数期待`"Test String"`的输出。

### 功能测试

![Callback Test](../img/CallbackTest.jpg)

## 评分

| 设计模式 | Class/Interface API          | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注                                                         |
| -------- | ---------------------------- | ------------------------------------------ | ----------------------------------------------------- | ------------------------------------------------------------ |
| Callback | PutInAction.putInChocolate() | 25+25                                      | 25+23                                                 | 【次要问题】支持回调函数输入和输出类型均为`void`。没有体现回调函数处理函数内部不同数据输入并给予相应输出的特性。 |

