import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Recursion {

    public static void main(String[] args) {

        int valorFatorial = fatorial(3);

        System.out.println("Fatorial of number 3: " + valorFatorial);

        int[] items = new int[]{1, 44, 3, 4};

        int sum = sumWithRecursion(items);

        System.out.println("Sum with recursion: " + sum);

        int count = countWithRecursion(items);

        System.out.println("Counting items using recursion: " + count);

    }


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

    private static int fatorial(int number) {

        if (number == 1) {
            return number;
        }

        return number * fatorial(number - 1);
    }
}