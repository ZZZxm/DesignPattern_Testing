## Prototype

### 测试逻辑

原型模式（Prototype Pattern）是通过原型进行创建对象的方法。用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。

测试时主要测试生成一个临时工，并将其作为原型，生成另外两个临时工，对其进行访问并打印。

### 测试用例

1. 通过new一个casualLabour，并对他进行setnumber()和setName()，把他作为原型。
2. 通过clone操作进行另外两个零时工。
3. 分别进行setNumber和setName。

### 功能测试

![Prototype](../img/Prototype.jpg)

注：Prototype是用于一些相对来说比较单调的事物的clone操作，这里用在临时工的克隆上，不太合理。另外setNumber函数没有实际的操作。

## 评分

| 设计模式  | Class/Interface API                                          | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| --------- | ------------------------------------------------------------ | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Prototype | Class：<br/>Allworker<br/>Interface API ：<br/>worker.setNumber、<br/>worker.setName<br/> | 24+25                                      | 25+23                                                 | 无   |

