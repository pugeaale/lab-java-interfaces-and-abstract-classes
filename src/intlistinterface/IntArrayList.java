package intlistinterface;

/**
 * IntArrayList should store numbers in an array with a length of 10
 * by default. When the add method is called, you must first determine
 * if the array is full. If it is, create a new array that is 50% larger,
 * move all elements over to the new array and add the new element.
 * (For example, an array of length 10 would be increased to 15.)
 */
public class IntArrayList extends AbstractIntList {

    /**
     * the default array int size
     */
    private static final int DEFAULT_SIZE = 10;

    @Override
    public int getDefaultSize() {
        return DEFAULT_SIZE;
    }

    /**
     * Return the new size,
     * @return Int array list return a upgrade size by 50% of the current size
     */
    @Override
    public int getNewSize() {
        return (int) (getSize() * 1.5);
    }

}
