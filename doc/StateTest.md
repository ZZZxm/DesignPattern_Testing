## State测试文档

### 测试逻辑

State是抽象状态类，有ToProcess , Baked , Refined , Cooled ,Finished这五个子类作为具体状态类，代表巧克力有待加工、已烘焙、已精炼、已冷却、成品这五种状态。使用Chocolate中的cook()转换其状态并打印。

### 测试用例

1. 用户创建一个Chocolate对象
2. 调用printState()打印其状态
3. 根据Chocolate对象所在状态选择cook操作
4. 执行cook操作转换其状态

### 功能测试

（测试结果的截图，可以略作说明但不必须）

### 边界测试（if necessary）

（边界测试的截图，可以略作说明但不必须）

## 评分

| 设计模式 | Class/Interface API | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| -------- | ------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
|State | State  |   50          |    50                     |      |