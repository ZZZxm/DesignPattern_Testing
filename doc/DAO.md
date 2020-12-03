## 测试文档框架

### 测试逻辑

DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来，通过新增DAO层将底层数据访问和上层业务逻辑解耦。

DAO 设计模式是基于接口设计的，也就是说它拥有了面向对象设计原则“面向接口编程而非实现编程”所具有的灵活性和可维护性代码的优势。

在本例中，OfficeDAO接口定义对应Office数据对象的操作函数，包括数据更新、获取与删除，OfficeDAOImpl作为OfficeDAO的实现类从List中读取Office对象。

### 测试用例

1.  用户创建一个Office类的数据访问对象，系统自动初始化一个List存储Office信息。
2.  用户输出List中所有office的信息。
3.  用户模拟向数据库的操作执行更新操作，更新List中特定office元素的Type属性。
4.  用户模拟向数据的的操作执行删除操作，删除List中特定office元素。

### 功能测试

![DAO功能测试](F:\DP\测试文件_雷泓\DAO（数据访问对象）模式测试\DAO功能测试.png)

功能测试共进行3个：select * from officetable；update office set Type="Large" where officeNumber=1；delete from officetable where officeNumber=0

### 边界测试

![DAO边界测试](F:\DP\测试文件_雷泓\DAO（数据访问对象）模式测试\DAO边界测试.png)

边界测试共存在3个问题：

（1）get函数存在逻辑问题：该get函数是以officeNumber为传参传入，并使用List所带函数get(int index)来获取序列中对应位置（或index索引）的Office对象，但是Office又提供了一个公共的setNumber函数接口，即用户可以调用该公共接口进行Number的更改，比如把Number从1改成3，再进行update，这时候会报List越界的错。

（2）没有提供插入接口，相当于数据库无法拓展。

（3）基础存储数据量太过于少，不便于测试。

## 评分

| 设计模式 | Class/Interface API | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| -------- | ------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| DAO      | OfficeDAO           | 正确性20+合理性25                          | 正确性20+合理性25                                     |      |

