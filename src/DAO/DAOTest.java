package DAO;

import DAO.*;

/**
 * @author Miracle Ray
 * @project ChocolateFactory
 * @classname DAOTest
 * @description test for DAO
 * @date 2020/12/2
 */
public class DAOTest {
    public static void main (String[] args){
        System.out.println("—————————————------------------------------------———— Test[DAO]Pattern —————————————-----------------------------------————");
        System.out.println("DAO Test by Miracle Ray.");
        System.out.println("Class Name : officeDAO");
        System.out.println("");

        OfficeDAO officeDAO = new OfficeDAOImpl();

        System.out.println("Output all offices.");
        for(Office office:officeDAO.getAllOffice()){
            System.out.println("office: [number : "
                    +office.getNumber()+", type : "+office.getType()+" ]");
        }

        System.out.println("Update an office.");
        Office office = officeDAO.getAllOffice().get(1);
        office.setType("Large");
        officeDAO.updateOffice(office);

        System.out.println("Delete an office.");
        Office office1 = officeDAO.getAllOffice().get(0);
        officeDAO.deleteOffice(office1);

        for(Office office2:officeDAO.getAllOffice()){
            System.out.println("office: [number : "
                    +office.getNumber()+", type : "+office.getType()+" ]");
        }

        /**
         * 边界测试：问题特别大
         */
        System.out.println("");
        System.out.println("Boundary Test: There are some inconsiderable problems in entering boundary data.");
        System.out.println("Ⅰ. What's office number stand by? Does it means the office sequence number in OfficeList?");
        System.out.println("    If it's, why you provide a public function interface that user can change office number at will?");
        System.out.println("    Take an example, if I set an number of an office which origin is 1 as 3(it's always legal), when I use this number(3) to get the office, ");
        System.out.println("    obviously, the List will be out of bound.");
        System.out.println("    Like this:");
        System.out.println("    Office office = officeDAO.getAllOffice().get(1);");
        System.out.println("    office.setNumber(3);");
        System.out.println("    officeDAO.updateOffice(office);");
        System.out.println("    The program will break down.");

        System.out.println("");
        System.out.println("Ⅱ. This is a list of mock office databases but it doesn't provide an add function interface to user.");
        System.out.println("    Add element is one of the most significant functions in a database, nevertheless it doesn't provide.");
        System.out.println("    It may bring a very very bad User Experience to all users.");

        System.out.println("");
        System.out.println("Ⅲ. The amount of raw data is too small, so it can not reflect the characteristic of database.");

        System.out.println("");
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
