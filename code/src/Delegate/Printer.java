package Delegate;

/**
 * 用于使用打印机打印的委托类
 *
 * @author hexian
 * @function 委托其他实体类完成实际操作
 * @pattern Delegate Pattern
 */
public class Printer
{
    BAWPrinter printerBAW = new BAWPrinter(); // create the delegate

    /**
     * 委托黑白打印
     * @pattern Delegate
     */
    public void BAWprint()
    {
        printerBAW.print(); // delegation
    }

    ColorPrinter printerColor = new ColorPrinter();

    /**
     * 委托彩色打印
     * @pattern Delegate
     */
    public void colorPrint()
    {
        printerColor.print(); // delegation
    }
}
