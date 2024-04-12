public class BinarySearch {

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int[] items = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 35, 44, 77, 88};

        int index = binarySearch(items, 20);

        System.out.println(index);
        Commons.assertEquals(index, 11);
    }
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
}
