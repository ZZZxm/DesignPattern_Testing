package DAO;

import java.util.List;

/**
 * officeDAO接口
 *
 *  @author Cao Qinghua
 *  @function 创建办公室List
 *  @pattern DAO Pattern
 */
public interface OfficeDAO
{
    /**
     * 获取所有办公室
     * @return 办公室列表
     * @pattern DAO
     **/
    List<Office> getAllOffice();

    /**
     * 获取办公室
     * @param number 办公室编号
     * @return 办公室对象
     * @pattern DAO
     **/
    Office getOffice(int number);
    /**
     * 更新办公室
     * @param office 办公室对象
     * @pattern DAO
     **/
    void updateOffice(Office office);
    /**
     * 删除办公室
     * @param office 要删除的办公室
     * @pattern DAO
     **/
    void deleteOffice(Office office);

}
