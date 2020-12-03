## MVC模式测试文档

### 测试逻辑

MVC即Model-View-Controller，把一个应用的输入、处理、输出流程按照Model、View、Controller的方式进行分离，这样一个应用被分成三个层，即模型层、视图层、控制层。

在本例中，模型为Worker类，封装了数据源和所有基于对这些数据的操作。WorkView作为视图类，封装了对数据源Model的一种显示，具体即对Worker的属性进行展示。一个模型可以由多个视图，而一个视图理论上也可以同不同的模型关联起来。而控制器封装了外界作用于模型的操作，此处为WorkerController，可以控制Worker属性的获取和改变，并在数据变化时更新视图，它使视图和模型分开。

本例应用中，Worker类有姓名这个属性，它不仅是名字，也反映了Worker的职责，Worker Controller可以控制Worker属性的获取和改变，并在数据变化时更新视图。它使视图和模型分开，Worker View(视图)可以对Worker的属性进行展示。

### 测试用例

1.  用户创建一个Worker类对象作为model，同时创建一个WorkerView和WorkerController作为视图和控制器。
2.  用户使用controller对视图执行更新操作。
3.  用户使用controller对实体model类进行设置属性操作。
4.  用户查看视图更新情况。

### 功能测试

![MVC功能测试](F:\DP\测试文件_雷泓\MVC（）模式测试\MVC功能测试.png)

### 边界测试

无边界测试

## 评分

| 设计模式 | Class/Interface API           | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| -------- | ----------------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| MVC      | WorkerView & WorkerController | 正确性25+合理性25                          | 正确性25+合理性25                                     |      |

