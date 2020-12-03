import Delegate.Printer;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname DelegateTest
 * @description TODO
 * @date 2020/12/3 15:53
 */
public class DelegateTest {
    public static void main(String[] args) {
        System.out.println("============= 使用委托 Delegate 模式 =============");
        System.out.println("类名：Printer");
        System.out.println("模式：Delegate");
        System.out.println("方法名：BAWprint、Colorprint");
        System.out.println("功能描述：委托实际打印类进行打印");
        System.out.println("================================================");
        //建立一个委托打印类
        Printer printer = new Printer();
        //委托类利用实际打印类进行打印
        printer.BAWprint();
        printer.colorPrint();
    }
}
