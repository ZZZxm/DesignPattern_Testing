package Specification;

/**
 * Specification接口
 *
 *  @author Cao Qinghua
 *  @function 提供接口
 *  @pattern Specification Pattern
 */
public interface Specification
{

    /**
     * 判断是否满足规约
     * @param params 要判断的对象
     * @return 是否满足规约
     * @pattern Specification Pattern
     **/
    boolean isSatisfiedBy(Object params);
    /**
     * 与运算
     * @param other 另一个规约条件
     * @return 新的规约
     * @pattern Specification Pattern
     **/
    Specification and(Specification other);
    /**
     * 或运算
     * @param other 另一个规约条件
     * @return 新的规约
     * @pattern Specification Pattern
     **/
    Specification or(Specification other);
    /**
     * 非运算
     * @return 新的规约
     * @pattern Specification Pattern
     **/
    Specification not();
}
