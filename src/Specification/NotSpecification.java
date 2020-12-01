package Specification;

public class NotSpecification extends CompositeSpecification
{
    private final Specification a;

    public NotSpecification(Specification a)
    {
        this.a = a;
    }
    /**
     * 判断是否满足规约
     * @param params 要判断的对象
     * @return 是否满足规约
     * @pattern Specification Pattern
     **/
    @Override
    public boolean isSatisfiedBy(Object params)
    {
        return !a.isSatisfiedBy(params);
    }
}
