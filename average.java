
//Java Foundations


//**************************************************************************************

import java.util.Scanner;


public class Assignment1 {

//Calculates the average of three integers based on values entered by the users.

    public static void main (String[] args)
    {
        int num1 = 0, num2 = 0, num3 = 0; // Here I am defining the value by initializing them.
        int sum=0;
        double Average; // Declare average
        
        Scanner scan = new Scanner(System.in);
        System.out.print("first number");
        num1 = scan.nextInt();
        System.out.print("second number");
        num2 = scan.nextInt();
        System.out.print("third number");
        num3 = scan.nextInt ();
        sum = num1 + num2 + num3;
        Average = (sum) / 3.0;
        System.out.println ("The Average of the three numbers is : " + Average);
        
    }
}
