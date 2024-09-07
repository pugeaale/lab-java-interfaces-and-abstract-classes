package carinventoy;

/**
 * Sedan extends Car and has the same properties of a Car
 */
public class Sedan extends Car {

    /**
     * Constructor with all sedan properties
     * @param vinNumber
     * @param make
     * @param model
     * @param mileage
     */
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }
}
