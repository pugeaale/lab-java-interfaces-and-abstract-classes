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
        this.fourWheelDrive = fourWheelDrive;
    }


}
