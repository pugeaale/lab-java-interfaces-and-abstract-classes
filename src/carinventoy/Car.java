package carinventoy;

/**
 * Car Inventory System
 * Suppose you are building a car inventory system.
 * All cars have a vinNumber, make, model and mileage.
 * But no car is just a car. Each car is either a Sedan, a UtilityVehicle or a Truck.
 */
public abstract class Car {

    //a String representing the VIN number of the car
    private String vinNumber;
    //a String representing the make of the car
    private String make;
    //model: a String representing the model of the car
    private String model;
    //mileage: an int representing the mileage of the car
    private int mileage;

    /**
     * Constructor to create a new car with all properties
     * @param vinNumber representing the VIN number of the car
     * @param make representing the make of the car
     * @param model representing the model of the car
     * @param mileage representing the mileage of the car
     */
    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    /**
     * a method that returns a String containing all of the car's properties in a readable format
     * @return String containing all of the car's properties in a readable format
     */
    public String getInfo() {
        return "Car n°" + vinNumber + " - make : " + make + " - model : "
                + model + " - mileage : " + mileage;
    }
}
