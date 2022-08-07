package masterclass;


import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void multiply(int value){
        for( int i = 0; i < 13; i++){
            System.out.printf("%d x %d = %d\n", value,i,value*i);

        }

    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = scan.nextInt();

        multiply(5);











    }
}
