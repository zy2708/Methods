import java.util.Scanner;

public class SquareRoot {
    public static void main (String[]args) {
        System.out.println("Enter a number to find its square root");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        System.out.println("The result is "+z(x));
    }
    public static double z(int x){
        double y=0;
        double z=0;
        do{ z+=0.000001;
            y=z*z;
        }while (y<x);
        return z;
    }
}

