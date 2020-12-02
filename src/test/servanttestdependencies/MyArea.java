package servanttestdependencies;

import Servant.IUpgradeServiced;

/**
 * @author Ngae Zeh-ghau
 * @classname MyArea
 * @description Custom implement of IUpgradeServiced, used in
 *              LasyInitializationTest.
 * @date 2020/12/2 10:00
 */
public class MyArea implements IUpgradeServiced {

    private double area = 10;

    @Override
    public double expand(double area) {
        double oldArea = this.area;
        this.area += area;
        return oldArea;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getName() {
        return "My Area";
    }

}
