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
    }
}