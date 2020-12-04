## Adapter测试文档

### 测试逻辑

适配器模式是将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

在该测试中，工厂内有一个专门生产白巧克力的白巧克力机ClassChocolateMaker，然而会出现突发情况需要用这台机器生产黑巧克力，于是使用适配器Adapter的对象来实现接口，将黑巧克力生产机DarkChocolateMaker的make（）接口适配到ClassChocolateMaker中，用户可以直接通过接口ClassChocolateMaker来执行DarkChocolateMaker类对应的make（）操作。

### 测试用例

1.  系统内部创建一个DarkChocolateMaker类对象
2.  用户用该DarkChocolateMaker类对象创建并初始化ClassChocolateMaker的实现类Adapter的对象whiteChocolateMaker
3.  用户使用whiteChocolateMaker执行生产白巧克力的操作
4.  用户使用whiteChocolateMaker执行生产黑巧克力的操作

### 功能测试

![Adapter功能测试](F:\DP\测试文件_雷泓\Adapter（适配器）模式测试\Adapter功能测试.png)

### 边界测试

![Adapter边界测试](F:\DP\测试文件_雷泓\Adapter（适配器）模式测试\Adapter边界测试.png)

说明：在本次边界测试中，发现类ClassChocolateMaker中的make（）函数只对“white”和“dark”字符串有对应的响应机制，当以除这两个以外的其他字符串作为参数调用make时，程序没有给出任何响应，因此评分时认为代码健壮性不是做得很好。

## 评分

| 设计模式 | Class/Interface API | framework完成度<br />（正确性25+合理性25） | Sample program/Application<br />（正确性25+合理性25） | 备注 |
| -------- | ------------------- | ------------------------------------------ | ----------------------------------------------------- | ---- |
| Adapter  | ChocolateAdapter    | 正确性25+合理性25                          | 正确性25+合理性23                                     |      |

