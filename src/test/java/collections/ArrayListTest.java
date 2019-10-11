package collections;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    // Constructor Tests
    // @Ignore
    @Test
    public void defaultConstructorSetsTheParamsCorrectly() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertEquals(10, arrayList.toArray().length);
        assertEquals(0, arrayList.size());
    }

    // @Ignore
    @Test
    public void constructorWithSizeSetsCorrectArraySizeAndSize() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>(50);

        assertEquals(50, arrayList.toArray().length);
        assertEquals(0, arrayList.size());
    }

    // @Ignore
    @Test
    public void arrayConstructorCopiesTheArrayCorrectlyAndSetValues() throws Exception {
        Integer[] numbers = new Integer[20];

        for (int i = 0; i < 20; i++) {
            numbers[i] = i;
        }

        ArrayList<Integer> arrayList = new ArrayList<>(numbers);

        Object[] elements = arrayList.toArray();

        assertEquals(22, elements.length);
        assertEquals(20, arrayList.size());

        for (int i = 0; i < 20; i++) {
            assertEquals(numbers[i], (Integer)elements[i]);
        }
    }

    // @Ignore
    @Test
    public void copyConstructorCopiesValues() throws Exception {
        Integer[] numbers = new Integer[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = i;
        }

        ArrayList<Integer> arrayList1 = new ArrayList<>(numbers);
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList1);

        Object[] elements = arrayList2.toArray();

        assertEquals(10, elements.length);
        assertEquals(5, arrayList2.size());

        for (int i = 0; i < 5; i++) {
            assertEquals(numbers[i], elements[i]);
        }
    }

    // @Ignore
    @Test
    public void addWillIncreaseTheSizeByOne() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        assertEquals(1, arrayList.size());
    }

    // @Ignore
    @Test
    public void addWillInreaseTheSizeAsManyAsAdded() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            arrayList.add(i);
        }

        assertEquals(4, arrayList.size());
    }

    // @Ignore
    @Test
    public void addWillIncreaseTheInternalArraySizeByExpansionRateWhenFull() {
        ArrayList<Integer> arrayList = new ArrayList<>(5);

        for (int i = 0; i < 6; i++) {
            arrayList.add(i);
        }

        assertEquals(7, arrayList.size());
    }

    // @Ignore
    @Test(expected = IndexOutOfBoundsException.class)
    public void getThrowsIndexOutOfBoundIfOutOfBound() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.get(10);
    }

    // Remove tests.
    // @Ignore
    @Test
    public void removeReducesTheSizeByOne() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        arrayList.remove(2);
        assertEquals(4, arrayList.size());
    }

    // @Ignore
    @Test
    public void removeRemovesTheCorrectIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        arrayList.remove(2);
        Integer unexpected = 2;
        assertNotEquals(unexpected, arrayList.get(2));
    }

    // @Ignore
    @Test
    public void removeShiftsEverythingAfterRemovedIndex() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        arrayList.remove(2);
        Integer excpected = 3;
        assertEquals(excpected, arrayList.get(2));
        excpected += 1;
        assertEquals(excpected, arrayList.get(3));
        excpected += 1;
        assertEquals(excpected, arrayList.get(4));
    }

    // @Ignore
    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWillThrowIndexExceptionIfOutOfBounds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.remove(1);
    }
}
