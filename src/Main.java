import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static int sumWithRecursion(int[] items) {

        if (items.length == 0) {
            return 0;
        }

        return items[0] + sumWithRecursion(Arrays.copyOfRange(items, 1, items.length));
    }


    private static int countWithRecursion(int[] items) {

        if (items.length == 1) {
            return 1;
        }

        return 1 + countWithRecursion(Arrays.copyOfRange(items, 1, items.length));
    }

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

//        int[] items = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 35, 44, 77, 88};
//
//        int index = binarySearch(items, 20);
//
//        System.out.println(index);
//        assertEquals(index, 11);


//
//        int[] items = new int[]{1, 44, 3, 4, 5, 6, 26, 8, 9, 10, 15, 20, 1, 44, 77, 2};
//
//        int[] sortedItems = selectionSort(items);
//
//        for (int i = 0; i < sortedItems.length; i++) {
//            System.out.println(sortedItems[i]);
//        }
//
//        int valorFatorial = fatorial(3);
//
//        System.out.println(valorFatorial);

//        int[] items = new int[]{1, 44, 3, 4};
//
//        int sum = sumWithRecursion(items);
//
//        System.out.println(sum);

        int[] items = new int[]{1, 44, 3, 4};

        int sum = countWithRecursion(items);

        System.out.println(sum);

    }


    private static int fatorial(int number) {

        if (number == 1) {
            return number;
        }

        return number * fatorial(number - 1);
    }



    // binary search module

    /**
     * @param items      that needs to be ordered
     * @param itemToFind element that must be found
     * @return index of found element
     * O(log n)
     */
    private static int binarySearch(int[] items, int itemToFind) {

        int start = 0;
        int end = items.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (items[middle] == itemToFind) {
                return middle;
            } else if (items[middle] > itemToFind) {
                end = middle;
            } else if (items[middle] < itemToFind) {
                start = middle;
            }
        }

        return 0;
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

        for (int item : items) {
            if (item < lower) {
                lower = item;
            }
        }

        return lower;
    }

}