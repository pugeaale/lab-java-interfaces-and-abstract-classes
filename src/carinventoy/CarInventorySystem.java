package carinventoy;

/**
 * Main class of the part 2 of the lab
 * to check and test all implementations about the
 * car inventory system
 */
public class CarInventorySystem {

    public static void main(String[] args) {

        System.out.println("Welcome to the car inventory system!");

        Sedan sedanOne = new Sedan("12345", "ford" ,"sport", 10000);
        // check the getInfo method
        System.out.println(sedanOne.getInfo());

        //check and test constructor and getInfo
        UtilityVehicle utilityVehicleOne = new UtilityVehicle("9090", "renault", "kangoo", 123456, false);
        System.out.println(utilityVehicleOne.getInfo());

        UtilityVehicle utilityVehicleTwo = new UtilityVehicle("0909", "opel" , "utility" , 25000, true);
        System.out.println(utilityVehicleTwo.getInfo());
    }
}