package intlistinterface;

import java.util.Arrays;

public abstract class AbstractIntList implements IntList {

    /**
     *  Represent the array of integers
     */
    private int[] list;

    /**
     * represent the number of elements added to list
     */
    private int count;

    /**
     * Create a new array of integers, initialized with the default size
     */
    public AbstractIntList() {
        list = new int[getDefaultSize()];
        setCount(0);
    }

    /**
     * Get the default size of the array, defined when array is created
     * @return the size
     */
    public abstract int getDefaultSize();

    /**
     * Get the new size of the array when the list is full
     * @return the new size
     */
    public abstract int getNewSize();

    /**
     * Get the number of elements added to the list
     * @return the number of elements
     */
    public int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return list.length;
    }

    @Override
    public void add(int number) {
        int counter = getCount();
        // check if the list is full, if so we change the size
        if( counter == getSize() ) upgradeSizeList();
        // then we add the number and update the counter
        list[counter] = number;
        setCount(++counter);
    }

    /**
     *
     * @param id the id of the element
     * @return the value of the id array
     */
    @Override
    public int get(int id) throws IllegalArgumentException {
        if (id >= 0  && id < getCount())  return list[id];
        else if( id >= getCount() &&  id < getSize()) throw new IllegalArgumentException("the id array exist but no value was added ");
        else throw new IllegalArgumentException("id array is out off bounds");
    }

    /**
     * Create a copy of the of array list with a new size
     * The new given size is given with the implementation of getNewSize
     */
    private void upgradeSizeList() {
        System.out.println("array is full - count : " + getCount() + " - size : " + getSize());
        list = Arrays.copyOf(list, getNewSize());
        System.out.println("array size changed - count : " + getCount() + " - size : " + getSize());
    }
}
