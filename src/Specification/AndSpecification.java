package Specification;

public class AndSpecification extends CompositeSpecification
{
    private final Specification a;
    private final Specification b;

    public AndSpecification(Specification a, Specification b)
    {
        this.a = a;
        this.b = b;
    }

    /**
     * 判断是否满足规约
     * @param params 要判断的对象
     * @return 是否满足规约
     */
    @Override
    public boolean isSatisfiedBy(Object params)
    {
        return a.isSatisfiedBy(params) && b.isSatisfiedBy(params);
    }
}
