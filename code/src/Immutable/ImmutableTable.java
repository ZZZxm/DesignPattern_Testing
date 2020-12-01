package Immutable;

/**
 * ImmutableTable
 *
 *  @author Cao Qinghua
 *  @function 定义桌子
 *  @pattern Immutable Pattern
 */

public class ImmutableTable {

        private int num;
    /**
     * 获取桌子编号
     * @return 桌子编号
     * @pattern Immutable Pattern
     **/
        public int getNum() {

            return num;

        }
    /**
     * 设置桌子编号
     * @param num 要设置的桌子的编号
     * @pattern Immutable Pattern
     **/
        public void setNum(int num) {

            this.num = num;

        }
}
