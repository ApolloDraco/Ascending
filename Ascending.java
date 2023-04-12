/* 
 *  Description: A program that prompts the user to enter three integers
 *  and displays the integers in ascending order
*/

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter three integers: ");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Sort numbers
        Arrays.sort(numbers);

        // Display numbers in ascending order
        System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));
    }
}
