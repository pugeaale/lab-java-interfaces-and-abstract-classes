package intlistinterface;


/** IntVector should store numbers in an array with a length of 20 by default.
 When the add method is called, you must first determine if the array is full.
 If it is, create a new array that is double the size of the current array,
 move all elements over to the new array and add the new element.
 (For example, an array of length 10 would be increased to 20.)
 *
 */
public class IntVector extends AbstractIntList {

    private static final int DEFAULT_SIZE = 20;

    @Override
    public int getDefaultSize() {
        return DEFAULT_SIZE;
    }

    public int getNewSize() {
        return getSize() * 2;
    }

}
