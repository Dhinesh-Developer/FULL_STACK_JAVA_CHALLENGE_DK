package DAY;

import java.util.Scanner;

class Rectanlge{
    float area(int l,float b){
        return l*b;
    }
    double area(double l,double b){
        return l*b;
    }
}
public class DAY27 {
    public static void main(String[] args) {
        /*Method overloading with type promotion*/
        Rectanlge r = new Rectanlge();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = in.nextInt();
        System.out.println("Enter the breadth");
        int b = in.nextInt();

        System.out.println(r.area(l,b));

    }
 /*Type promotion is the process of converting a smaller data type to larger data type.
 * Type promotion allowed(Implicit Type casting)
 *
 * Number of parameters
 * DataType of parameter
 * Order of dataTypes in parameter
 * implicit Type casting
 * */
}
