package DAO;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现officeDAO接口
 *
 *  @author Cao Qinghua
 *  @function 实现officeDAO接口
 *  @pattern DAO Pattern
 */
public class OfficeDAOImpl implements OfficeDAO
{

    //列表是当作一个数据库
    List<Office> offices;

    /**
     * 定义办公室List
     * @pattern DAO
     **/
    public OfficeDAOImpl()
    {
        offices = new ArrayList<Office>();
        Office office1 = new Office("big", 0);
        Office office2 = new Office("small", 1);
        offices.add(office1);
        offices.add(office2);
    }

    /**
     * 删除办公室
     * @param office 要删除的办公室
     * @pattern DAO
     **/
    @Override
    public void deleteOffice(Office office)
    {
        offices.remove(office.getNumber());
        System.out.println("office: number " + office.getNumber()
                + ", deleted from database");
    }

    /**
     * 获取所有办公室
     * @return 办公室列表
     * @pattern DAO
     **/
    @Override
    public List<Office> getAllOffice()
    {
        return offices;
    }

    /**
     * 获取办公室
     * @param number 办公室编号
     * @return 办公室对象
     * @pattern DAO
     **/
    @Override
    public Office getOffice(int number)
    {
        return offices.get(number);
    }

    /**
     * 更新办公室
     * @param office 办公室对象
     * @pattern DAO
     **/
    @Override
    public void updateOffice(Office office)
    {
        offices.get(office.getNumber()).setType(office.getType());
        System.out.println("office: number " + office.getNumber()
                + ", updated in the database");
    }

}
