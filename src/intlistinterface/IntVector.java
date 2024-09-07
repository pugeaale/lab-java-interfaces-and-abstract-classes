package intlistinterface;


import java.util.Arrays;

/** IntVector should store numbers in an array with a length of 20 by default.
 When the add method is called, you must first determine if the array is full.
 If it is, create a new array that is double the size of the current array,
 move all elements over to the new array and add the new element.
 (For example, an array of length 10 would be increased to 20.)
 *
 */
public class IntVector implements IntList {

    private int[] vectorList;
    private static final int DEFAULT_SIZE = 20;
    private int count;

    public IntVector() {
        vectorList = new int[DEFAULT_SIZE];
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
        int counter = getCount();
        if (counter < vectorList.length) {
            vectorList[counter] = number;
            setCount(++counter);
        } else {
            System.out.println("updating size");
            upgradeSizeList();
            vectorList[counter] = number;
            setCount(++counter);
        }
    }

    private void upgradeSizeList() {
        System.out.println("old size : " + vectorList.length);
        vectorList = Arrays.copyOf(vectorList, getNewSize());
        System.out.println(vectorList.length);
    }

    private int getNewSize() {
        return vectorList.length * 2;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int get(int id) {
        return vectorList[id];
    }
}
