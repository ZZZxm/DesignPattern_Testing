package Immutable;

/**
 * Immutable类
 *
 *  @author Cao Qinghua
 *  @function 定义不变类
 *  @pattern Immutable Pattern
 */

public class Immutable {

        // 属性私有，满足条件2
        private int state;

        // 属性私有，满足条件2
        private ImmutableTable table;

        private Integer serviceTime;

    /**
     * 定义不变类
     * @param state 桌子的状态值
     * @param table 桌子对象
     * @param serviceTime 桌子的使用时间
     * @pattern Immutable Pattern
     **/

        public Immutable(int state, ImmutableTable table, Integer serviceTime) {

            this.state = state;

            this.table = table;

            this.serviceTime = serviceTime;

        }
    /**
     * 获取桌子状态值
     * @return 桌子的状态值
     * @pattern Immutable Pattern
     **/
        public int getState() {

            return this.state;

        }
    /**
     * 获取桌子
     * @return 桌子对象
     * @pattern Immutable Pattern
     **/
        public ImmutableTable getTable() {

            return this.table;

        }

    /**
     * 获取桌子使用时间
     * @return 桌子使用时间
     * @pattern Immutable Pattern
     **/
        public Integer getServiceTime() {

            return this.serviceTime;

        }

    /**
     * 设置桌子的状态值
     **/
        public void setState() {

            // 对象没有任何方法修改对象的状态,满足条件1

            // do nothing.

        }



}
