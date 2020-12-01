package Converter;

import java.util.function.Function;

/**
 * 巧克力转换器类
 *
 * @author zhouziyi
 * @function converter，实现dto（Data Transfer Object）对象和entity（实体）对象的转换
 * @pattern Converter
 **/

public class Converter<T, U>
{
    private final Function<T, U> fromDto;
    private final Function<U, T> fromEntity;


    /**
     * 判断是否需要采购
     *
     * @param fromDto 函数对象，将dto转换为实体
     * @param fromEntity 函数对象，将实体转换为dto
     * @author zzy
     **/
    public Converter(final Function<T, U> fromDto, final Function<U, T> fromEntity)
    {
        this.fromDto = fromDto;
        this.fromEntity = fromEntity;
    }

    /**
     * 判断是否需要采购
     *
     * @param dto 待转换的DTO
     * @return 转换后的实体对象
     * @author zzy
     **/
    public final U convertFromDto(final T dto)
    {
        System.out.println("你正在从对应dto恢复实体（使用转换器Converter模式）");
        return fromDto.apply(dto);
    }


    /**
     * 判断是否需要采购
     *
     * @param entity 待转换的实体
     * @return 转换后的DTO
     * @author zzy
     **/
    public final T convertFromEntity(final U entity)
    {
        System.out.println("你正在从对应的实体生成相应的dto（使用转换器Converter模式）");
        return fromEntity.apply(entity);
    }


}
