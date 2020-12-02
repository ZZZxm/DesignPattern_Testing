## Proxy测试文档

### 测试逻辑

巧克力工厂厂长（Manager）除了管理工厂的财产之外还有其它工作，如果理财的工作过于繁重，单一线程中厂长的负载将会很大。因此，厂长的个别方法可以提取出来，交给另一个对象、甚至生成多个对象去完成，即“代理模式（ManagerProxy）”。直到遇见了代理无法处理的问题，才把任务交给厂长处理。使用ManagerProxy.getMoney()来查询Manager管理的工厂剩余财产金额，使用ManagerProxy.reduceMoney()来在Manager支出时需要计算他负责的钱是否足够，判断足够后才实施扣费，使用ManagerProxy.addMoney()来表示工厂获得收入，增加到工厂账户上。

### 测试用例

1. 用户通过ManagerProxy()创建一个管理工厂财产的场景
2. 用户通过使用MoneyProxy.getMoney()获取工厂目前财产数额
3. 调用MoneyProxy.reduceMoney函数，代表工厂目前财产减少
4. 调用MoneyProxy.addMoney函数，代表工厂目前财产增加

### 功能测试

![image-20201203004254738](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201203004254738.png)

![image-20201203004407883](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201203004407883.png)

## 评分

| 设计模式 | Class/Interface API | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| -------- | ------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Proxy    | ManagerProxy        | 50                                         | 50                                                    |      |

