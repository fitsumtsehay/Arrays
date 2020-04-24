/* *create an empty variable. (sum)
Initialize it with 0 in a loop.
go through each element
add each element to sum.
Print sum.

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        /*begin loop*/

        for (int num : ints) {
            sum = sum + num;
        }
            /* print output*/
            System.out.println("The total number is " + sum);
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter 10 numbers:");
            int[] array = new int[10];
            int i;
            int sum2=0;
            for (i = 0; i < 10; i += 1) {
                array[i] = input.nextInt();

                sum2 = sum2 + array[i];

        }
            System.out.println(" The total sum is: " + sum2);


        System.out.println("the average is "+sum2/10);


    }}
