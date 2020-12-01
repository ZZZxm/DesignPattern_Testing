package DAO;

/**
 * office实体，办公室属性有编号和类型
 *
 *  @author Cao Qinghua
 *  @function 定义办公室
 *  @pattern DAO Pattern
 */
public class Office
{

    private String type;
    private int number;

    /**
     * 创建办公室
     * @param type 办公室类型
     * @param number 办公室编号
     * @pattern DAO
     **/
    Office(String type, int number)
    {
        this.type = type;
        this.number = number;
    }

    /**
     * 获取办公室类型
     * @return 办公室类型
     * @pattern DAO
     **/
    public String getType()
    {
        return type;
    }

    /**
     * 设置办公室类型
     * @param type 新的办公室类型
     * @pattern DAO
     **/
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * 获取办公室编号
     * @return 办公室编号
     * @pattern DAO
     **/
    public int getNumber()
    {
        return number;
    }

    /**
     * 设置办公室编号
     * @param number 新的办公室编号
     * @pattern DAO
     **/
    public void setNumber(int number)
    {
        this.number = number;
    }

}
