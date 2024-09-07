package carinventoy;

/**
 * Truck is a specific car and have all car properties
 * Truck objects should have an additional towingCapacity property,
 * a double that represents the towing capacity of the truck.
 */
public class Truck extends Car {

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    //double that represents the towing capacity of the truck.
    private double towingCapacity;

    /**
     * Constructor
     * @param vinNumber
     * @param make
     * @param model
     * @param mileage
     * @param towingCapacity
     */
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    @Override
    public String getInfo() {
        return super.getInfo().replace("Car", "Truck") + " - towing capacity : " + getTowingCapacity();
    }
}
