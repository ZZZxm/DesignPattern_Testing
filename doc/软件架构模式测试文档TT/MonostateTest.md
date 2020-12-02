## Monostate测试文档

### 测试逻辑

本场景中，无论创建多少个刷卡机，它自身的状态是唯一的。使用HealthMachine()新建一个HealthMachine实例，该实例状态唯一

### 测试用例

1. 用户创建两个HealthMachine实例，machine1和machine2
2. 当用户调用scan代表用户在machine上面进行了刷卡
3. 用户调用pass()函数通过machine
4. 检测machine是否会报警来验证唯一状态

### 功能测试

![image-20201202191127856](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201202191127856.png)

![image-20201202191224552](C:\Users\25392\AppData\Roaming\Typora\typora-user-images\image-20201202191224552.png)

## 评分

| 设计模式  | Class/Interface API | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| --------- | ------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Monostate | HealthMachine       | 50                                         | 50                                                    |      |

