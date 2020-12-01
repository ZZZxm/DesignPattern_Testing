package Interpreter;

/**
 * 分割字符串
 * @author lv ziyuan
 * @pattern interpreter
 */
public class Parser
{
    /**
     * 分割字符串
     * @author lv ziyuan
     * @param exp 用户输入的语法表达式
     * @return 解析得到的对应语法树
     * @throws ParserException 当解析出现错误时抛出自定义的ParserException异常
     */
    public static Interpreter parse(String exp) throws ParserException
    {
        System.out.println(
                "==========使用解释器 Interpreter 模式==========\n" +
                        "类名：Parser\n" +
                        "模式：Interpreter\n" +
                        "方法名：Parser.parse(String exp).interpret()\n" +
                        "功能描述：计算装车巧克力的总价\n" +
                        "======================================");
        String[] nodes = exp.split(" ");

        System.out.println("你输入了语法表达式：" + exp);

        return parse(nodes, 0, nodes.length);
    }

    /**
     * @author lv ziyuan
     * @param nodes 输入字符串分割后的词法单元
     * @param start 当前解析子语法树的开始下标
     * @param end   当前解析子语法树的结束下标
     * @return 解析（[start, end)）获得的语法树
     * @throws ParserException 当解析出现错误时抛出自定义的ParseException异常
     */
    private static Interpreter parse(String[] nodes, int start, int end) throws ParserException
    {
        if (start == end)
        {
            return null;
        } else if (start == end - 1)
        {
            return new NumberExpression(nodes[start]);
        }
        assert end - start >= 3;
        //Add
        for (int i = start + 1; i < end; i++)
        {
            int ope = isOpe(nodes[i]);
            if (ope == 1)
            {
                return new AddExpression(parse(nodes, start, i),
                        parse(nodes, i + 1, end));
            }
        }
        //Multiply
        for (int i = start + 1; i < end; i++)
        {
            int ope = isOpe(nodes[i]);
            if (ope == 2)
            {
                return new MultiplyExpression(parse(nodes, start, i),
                        parse(nodes, i + 1, end));
            }
        }
        throw new ParserException("Invalid Expression");
    }

    /**
     * @author lv ziyuan
     * @param str 用户输入字符串的分割单元
     * @return 判断此法单元str是否为操作符以及类型
     */
    static int isOpe(String str)
    {
        switch (str.charAt(0))
        {
            case '+':
                return 1;
            case '*':
                return 2;
            default:
                return 0;
        }
    }

/*    *//**
     * 内部测试函数
     *//*
    public static void main(String[] args) throws ParserException
    {
        System.out.println("======== 使用 解释器 Interpreter模式 =======");
        System.out.println("生产清单：");
        String exp = "2 * " + Const.BLACK + " + " + Const.WHITE;
        System.out.println(exp);

        System.out.println("出售将获得了以下金钱 ： " + Parser.parse(exp).interpret());
    }*/

}
