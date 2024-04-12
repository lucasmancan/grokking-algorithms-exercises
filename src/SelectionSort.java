import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SelectionSort {

    public static void main(String[] args) {
        int[] items = new int[]{1, 44, 3, 4, 5, 6, 26, 8, 9, 10, 15, 20, 1, 44, 77, 2};

        int[] sortedItems = selectionSort(items);

        for (int sortedItem : sortedItems) {
            System.out.println(sortedItem);
        }
    }

    /**
     * @param items to be sorted using selection sort
     * @return ordered list
     * O (n2)
     */
    private static int[] selectionSort(int[] items) {

        int[] orderedArray = new int[items.length];

        int length = items.length;
        for (int i = 0; i < length; i++) {
            int lower = findLowerElement(items);

            orderedArray[i] = lower;
            items = removeAndCopy(items, lower);
        }

        return orderedArray;
    }

    /**
     * O(n)
     *
     * @param items
     * @param lower
     * @return
     */
    private static int[] removeAndCopy(int[] items, int lower) {

        int[] newArray = new int[items.length - 1];

        int newArrayIndex = 0;
        boolean alreadyRemoved = false;

        for (int item : items) {
            if (item != lower || alreadyRemoved) {
                newArray[newArrayIndex] = item;
                newArrayIndex++;
            } else {
                alreadyRemoved = true;
            }
        }
        return newArray;
    }


    /**
     * O(n)
     *
     * @param items
     * @return
     */
    private static int findLowerElement(int[] items) {

        int lower = items[0];

        for (int i = 0; i < items.length; i++) {
            if (items[i] < lower) {
                lower = items[i];
            }
        }

        return lower;
    }

}