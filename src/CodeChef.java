import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values");
        int K = scan.nextInt();
        int X = scan.nextInt();
        int N = K-X;

        if (N>0){
            System.out.println(N);
        }
        else{
            System.out.println("Overflowing");
        }



    }
}