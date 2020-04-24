/* *create an empty variable. (sum)
Initialize it with 0 in a loop.
go through each element
add each element to sum.
Print sum.

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
