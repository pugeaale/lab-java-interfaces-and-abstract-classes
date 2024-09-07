package carinventoy;

/**
 * Main class of the part 2 of the lab
 * to check and test all implementations about the
 * car inventory system
 */
public class CarInventorySystem {

    public static void main(String[] args) {

        System.out.println("Welcome to the car inventory system!");

        //check and test constructor and getInfo for Sedan
        Sedan sedanOne = new Sedan("12345", "ford" ,"sport", 10000);
        System.out.println(sedanOne.getInfo());
        Sedan sedanTwo = new Sedan("112345", "peugeot" ,"sport", 99999);
        System.out.println(sedanTwo.getInfo());

        //check and test constructor and getInfo for UtilityVehicle
        UtilityVehicle utilityVehicleOne = new UtilityVehicle("9090", "renault", "kangoo", 123456, false);
        System.out.println(utilityVehicleOne.getInfo());

        UtilityVehicle utilityVehicleTwo = new UtilityVehicle("0909", "opel" , "utility" , 25000, true);
        System.out.println(utilityVehicleTwo.getInfo());

        //check and test constructor and getInfo for TRUCK
        Truck truckOne = new Truck("3434", "ford", "bigtt", 13000, 10000);
        Truck truckTwo = new Truck("232323", "mercredes", "classT", 9999, 30000);
        System.out.println(truckOne.getInfo());
        System.out.println(truckTwo.getInfo());
    }
}