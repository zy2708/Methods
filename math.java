import java.util.Scanner;
import java.lang.Math;

public class math {
    public static void main (String[]args){
        System.out.println("Please choose a math method.");
        System.out.println("1. power");
        System.out.println("2. square root");
        System.out.println("3. random");
        System.out.println("4. max");
        System.out.println("5. min");
        System.out.println("6. round");
        System.out.println("7. ceil");
        System.out.println("8. floor");
        System.out.println("9. absolute value");
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        if(sc==1){
            System.out.println("Enter two numbers x and y to find the value of x^y(seperated by comma)");
            Scanner scanner1=new Scanner(System.in);
            scanner1.useDelimiter(",");
            int x=scanner1.nextInt();
            int y=scanner1.nextInt();
            System.out.println("The value of x^y is "+Math.pow(x,y));
        }
        if(sc==2) {
            System.out.println("Enter a number x to find its square root");
            Scanner scanner2 = new Scanner(System.in);
            int x = scanner2.nextInt();
            System.out.println("The value of z square root is " + Math.sqrt(x));
        }
        if(sc==3){
            System.out.println("A random number between 0 and 1");
            System.out.println("The random number is "+Math.random());
        }
        if(sc==4){
            System.out.println("Enter two numbers x and y to find the max value number(seperated by comma)");
            Scanner scanner4 =new Scanner(System.in);
            scanner4.useDelimiter(",");
            int x=scanner4.nextInt();
            int y=scanner4.nextInt();
            System.out.println("The max value number is "+Math.max(x,y));
        }
        if(sc==5){
            System.out.println("Enter two number x and y to find the mininum value number(seperated by comma)");
            Scanner scanner5 =new Scanner(System.in);
            scanner5.useDelimiter(",");
            int x=scanner5.nextInt();
            int y=scanner5.nextInt();
            System.out.println("The mininum value number is "+Math.min(x,y));

        }
        if(sc==6){
            System.out.println("Enter a number x to find its round number");
            Scanner scanner6 =new Scanner(System.in);
            float x=scanner6.nextFloat();
            System.out.println("The round number is "+Math.round(x));
        }
        if(sc==7){
            System.out.println("Enter a number x to find the smallest integer greater than or equal to the number");
            Scanner scanner7 =new Scanner(System.in);
            float x=scanner7.nextFloat();
            System.out.println("The smallest integer greater than or equal to the number is "+Math.ceil(x));

        }
        if(sc==8){
            System.out.println("Enter a number x to find the greatest integer less than or equal to the number");
            Scanner scanner8 =new Scanner(System.in);
            float x=scanner8.nextFloat();
            System.out.println("The greatest integer less than or equal to the number is "+Math.floor(x));

        }
        if(sc==9){
            System.out.println("Enter a number x to find its absolute value");
            Scanner scanner9 =new Scanner(System.in);
            float x=scanner9.nextFloat();
            System.out.println("The absoulute value of the number is "+Math.abs(x));

        }


    }
}

