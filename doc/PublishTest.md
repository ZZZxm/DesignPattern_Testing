## Publish测试文档

### 测试逻辑

在本例中，建立一个发布者监测用户输入，当用户输入了正确的选择后，发布者在发布大厅发布通知让所有订阅者，即所有临时工就绪，准备装货。使用SubscribeClub.setSubscribe(Subscribe subscribe)函数表示订阅者订阅发布者，将其加入订阅者队列中。使用Subscribe.update()函数表示订阅者收到信息，更新自身状态。

### 测试用例

1. 用户创建三个临时工worker1，worker2，worker3，一个订阅者watcher
2. 订阅者调用setSubscribes(worker)来订阅发布者，将worker1，worker2，worker3，加入订阅者列表
3. 调用Subscribe.update()函数，使得加入订阅者列表的临时工更新自身状态。
4. 检测worker1，worker2，worker3是否订阅成功

### 功能测试

![image-20201202200115002](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201202200115002.png)

![image-20201202200731950](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201202200731950.png)

## 评分

| 设计模式  | Class/Interface API | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| --------- | ------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Monostate | HealthMachine       | 50                                         | 49                                                    |      |

