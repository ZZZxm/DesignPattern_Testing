## Facade模式测试文档

### 测试逻辑

通过对外观的包装，使客户端只能看到外观对象，而不会看到具体的细节对象，这样降低了应用程序的复杂度，并且提高了程序的可维护性。换言之，在外观模式中，子系统的外部调用者必须通过一个统一的 Facade 对象才能和子系统内部通信。

在本测试类中，主要用外观模式实现了把巧克力产品装入货箱的操作，定义了AddChocolateFacade为外观角色，供客户（用户）角色调用；定义了OpenBoxAction、PutInAction、CloseBoxAction作为子系统角色，用于实现子系统的功能，并处理由Facade对象指派的任务，对子系统而言，facade和client角色是未知的，没有Facade的任何相关信息；即没有指向Facade的实例。客户Client只需要调用addChocolateFacade中的addChocolate（）函数即可由系统内部完整整个把巧克力产品装入货箱的操作。

### 测试用例

1.  系统自动创建好一个当前巧克力产品的列表，并且初始化一个实现addChocolate操作的外观类。
2.   用户调用addChocolateFacade中相关addChocolate操作，系统依次调用OpenBoxAction、PutInAction、CloseBoxAction函数，其中使用回调模式获取巧克力，最终对客户而言仅一个操作而言就完成了addChocolate。

### 功能测试

![Facade功能测试](F:\DP\测试文件_雷泓\Facade（外观）模式测试\Facade功能测试.png)

### 边界测试

无边界测试

## 评分

| 设计模式 | Class/Interface API | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| -------- | ------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Facade   | AddChocolateFacade  | 正确性25+合理性25                          | 正确性25+合理性25                                     |      |

