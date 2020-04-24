/* *create array with numbers 1-10
   *Loop through the numbers
   * Print the total
 */
public class Main {
    public static void main(String [] args) {
int [] ints = {1,2,3,4,5,6,7,8,9,10};
int sum = 0;

/*begin loop*/

for ( int num : ints) {
    sum = sum+num;
    
/* print output*/
System.out.println("The total number is " +sum);
    }
}}
