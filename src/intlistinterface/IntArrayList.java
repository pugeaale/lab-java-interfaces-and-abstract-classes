package intlistinterface;

/**
 * IntArrayList should store numbers in an array with a length of 10
 * by default. When the add method is called, you must first determine
 * if the array is full. If it is, create a new array that is 50% larger,
 * move all elements over to the new array and add the new element.
 * (For example, an array of length 10 would be increased to 15.)
 */
public class IntArrayList implements IntList {

    private int[] arrayList;
    private static final int DEFAULT_SIZE = 10;
    private int count;

    /**
     *
     */
    public IntArrayList() {
        arrayList = new int[DEFAULT_SIZE];
        setCount(0);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @param number
     */
    @Override
    public void add(int number) {
        int count = getCount();
        arrayList[count] = number;
        setCount(++count);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int get(int id) {
        return arrayList[id];
    }
}
