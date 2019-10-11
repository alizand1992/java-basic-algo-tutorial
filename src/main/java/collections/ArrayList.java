package collections;

public class ArrayList<T> {
    private static final int INITIAL_SIZE = 10;
    private static final double EXPANSION_RATE = 1.5;
    private int size;
    private Object[] elements;

    /**
     * Default constructor.
     * Instructions:
     *   1. This will initialize the elements to an empty array
     *   2. The size of this array should be determined by a constant called INITIAL_SIZE
     *   3. This constructor will need to set the current size to 0
     */
    ArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    /**
     * Constructor with size
     * Instructions:
     *   1. This constructor initializes the internal array to a custom size.
     *
     * @param init_size custom size to initialize the internal array to
     */
    ArrayList(int init_size) {
        elements = new Object[init_size];
        size = 0;
    }

    /**
     * Array copy constructor.
     * Instructions:
     *   1. This constructor should accept an array of type T (the type is determined at runtime)
     *   2. It will initialize an array of elements with the size arr.length x EXPANSION_RATE
     *     a. EXPANSION_RATE is a constant by which the size of the internal array increases by.
     *   3. Set the current size of the ArrayList to the size of the arr
     *   4. copy all elements of arr into the internal array.
     *
     * @param arr array to create the array list with
     */
    ArrayList(T[] arr) {

    }

    /**
     * Copy constructor:
     * Description:
     *   Copy constructor is a special kind of constructor which allows for deep copy of an object (vs. shallow copy)
     *   this way the internal array will have a duplicate of the rhs instead of referring to that memory address.
     *
     * Instructions:
     *   1. After initializing an object using this constructor, this object should have ALL of properties of rhs
     *
     * @param rhs The ArrayList to be copied into this one
     */
    ArrayList(ArrayList<T> rhs) {

    }

    /**
     * Add
     * Instructions:
     *   1. This method accepts an item of type T.
     *   2. Type T needs to match the elements in the internal array, otherwise it needs to throw an exception
     *   3. The item needs to be added to the end of the internal array
     *     a. If internal array is full, it needs to be expanded by the EXPANSION_RATE
     *
     * Bonus:
     *   1. Make the method chainable:
     *     a. Example: arrayList.add(item).add(item); should be allowed.
     *
     * @param item item to be added
     */
    public void add(T item) {

    }

    /**
     * Get
     * Instructions:
     *   1. This method accepts an index
     *     a. It returns the element at that index if exists
     *     b. If it does not, it throws an IndexOutOfBoundsException
     *
     * @param index the index of the element to be returned
     * @return returns the element at the index
     * @throws IndexOutOfBoundsException  index does not contain a value
     */
    public T get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    /**
     * Size
     * Instructions:
     *   1. This method needs to return the current count for the elements in the internal array.
     *     a. Example: [0, 1, 2] -> size = 3
     *
     * @return the number of elements int he internal array
     */
    public int size() {
        return size;
    }

    /**
     * Remove
     * Instructions:
     *   1. Removes the element at location index
     *     a. Return the element that is being removed.
     *     b. if element does not exist it should throw an IndexOutOfBoundsException
     *
     * @param index index of the element to be removed
     * @return the element that is being removed
     * @throws IndexOutOfBoundsException if the index does not contain an element
     */
    public T remove(int index) throws IndexOutOfBoundsException {
        return null;
    }

    /**
     * This method returns the internal array.
     *
     * @return the internal array
     */
    public Object[] toArray() {
        return elements;
    }
}
