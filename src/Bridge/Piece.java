package Bridge;

/**
 * 设置巧克力为Piece
 *
 * @author hexian
 * @function 设置巧克力形状为Piece
 * @pattern 桥接模式(Bridge Pattern)
 */
public class Piece implements Size
{
    /**
     * 获取巧克力的形状
     *
     * @pattern Bridge
     */
    @Override
    public String getSize()
    {
        return "piece";
    }
}
