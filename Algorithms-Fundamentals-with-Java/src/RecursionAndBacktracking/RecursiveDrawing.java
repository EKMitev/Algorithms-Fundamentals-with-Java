package RecursionAndBacktracking;

import java.util.Scanner;

/**
 * <p>2. Recursive Drawing </p>
 * Write a program that draws the figure below depending on <strong>n</strong>. Use recursion.
 */

public class RecursiveDrawing {
    public static void main(String[] args) {

        int input = new Scanner(System.in).nextInt();

        draw(input);
    }

    static void draw(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print('*');
        }
        System.out.println();

        draw(n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print('#');
        }
        System.out.println();
    }
}
