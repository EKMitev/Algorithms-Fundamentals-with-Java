package RecursionAndBacktracking;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <p>1. Recursive Array Sum </p>
 * Write a program that finds the sum of all elements in an integer array. Use recursion.
 */

public class RecursiveArraySum {
    public static void main(String[] args) {

        int[] arr = Arrays.stream(new Scanner(System.in).nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = sumNumbers(arr, 0);
        System.out.println(sum);
    }

    static int sumNumbers(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }

        return numbers[index] + sumNumbers(numbers, index + 1);
    }
}
