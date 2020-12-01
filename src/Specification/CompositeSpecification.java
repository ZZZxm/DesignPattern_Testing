package Specification;

public abstract class CompositeSpecification implements Specification
{
    /**
     * 与运算
     * @param other 另一个规约条件
     * @return 新的规约
     * @pattern Specification Pattern
     **/
    @Override
    public Specification and(Specification other)
    {
        return new AndSpecification(this, other);
    }
    /**
     * 非运算
     * @return 新的规约
     * @pattern Specification Pattern
     **/
    @Override
    public Specification not()
    {
        return new NotSpecification(this);
    }
    /**
     * 或运算
     * @param other 另一个规约条件
     * @return 新的规约
     * @pattern Specification Pattern
     **/
    @Override
    public Specification or(Specification other)
    {
        return new OrSpecification(this, other);
    }
}
