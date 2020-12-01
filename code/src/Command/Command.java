/*
 * Command接口，用于实现各类命令
 */

package Command;


/**
 * 工人命令抽象接口
 *
 * @author zhouziyi
 * @function 工人可以发出五种命令，分别对应机器的五种操作
 * @pattern 命令模式
 */
public interface Command
{

    /**
     * 初始化命令
     */
     void startMachine();
}
