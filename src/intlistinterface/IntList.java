package intlistinterface;

/** Create an IntList interface with the following methods:
 *  add(int number): a method that adds a new number to the list
 *  get(int id): a method that retrieves an element by its ID
 */
public interface IntList {

        /**
         * add(int number): a method that adds a new number to the list
         * @param number
         */
        void add(int number);

        /**
         * get(int id): a method that retrieves an element by its ID
         * @param id the id of the element
         * @return the value of the element id
         */
        int get(int id);
}
