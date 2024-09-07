package carinventoy;

/**
 * A utility vehicle extends Car and have all car properties like vinNumber, model...
 *  Utility vehicle have also one more special property :
 *  a boolean that represents whether the vehicle has four-wheel drive.
 */
public class UtilityVehicle extends Car {

    // a boolean that represents whether the vehicle has four-wheel drive.
    private boolean fourWheelDrive;

    /**
     * Constructor with all utility vehicle properties
     * @param vinNumber
     * @param make
     * @param model
     * @param mileage
     * @param fourWheelDrive
     */
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return super.getInfo().replace("Car", "Utility Vehicle") + " - has four whell drive :" + isFourWheelDrive();
    }
}
