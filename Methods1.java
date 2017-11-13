import java.util.Scanner;

public class Methods1 {
    public static void main (String []args){
        System.out.println("Please choose a program.");
        System.out.println("1. h(x)=x^10");
        System.out.println("2. f(x,y)=x+y");
        System.out.println("3. g(x,y,z) = squrt(x) + absolute(y) + z^y");
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        if(sc==1){
            System.out.println("Enter a number x to find h(x)=x^10");
            Scanner scanner1=new Scanner(System.in);
            int x=scanner1.nextInt();
            System.out.print("The result is "+h(x));
        }
        else if (sc==2){
            System.out.println("Enter 2 numbers x,y seperated by commas to find f(x,y)=x+y");
            Scanner scanner2=new Scanner(System.in);
            scanner2.useDelimiter(",");
            int x=scanner2.nextInt();
            int y=scanner2.nextInt();
            System.out.println("The result is "+ f(x,y));
        }
        else if (sc==3) {
            System.out.println("Enter 3 numbers x,y,z seperated by commas to find g(x,y,z) = squrt(x) + absolute(y) + z^y");
            Scanner scanner3=new Scanner(System.in);
            scanner3. useDelimiter(",");
            int x=scanner3.nextInt();
            int y=scanner3.nextInt();
            int z=scanner3.nextInt();
            System.out.println("The result is "+g(x,y,z));
        }
    }
        public static long h(int x){
            int product=1;
            int a=0;
            do{
                product*=x;
                a++;
            }while(a<10);
            return product;


        }
        public static long f(int x,int y){
            int z=0;
            z=x+y;
            return z;
        }
        public static double g(int x,int y,int z){
            double result=0;
            double m=0;
            double n=0;
            do{ n+=0.000001;
                m=n*n;
            }while (m<x);
            result+=n;

            if (y<0){
                double product=1;
                int a=0;
                do{
                    product=product*1/z;
                    a--;
                }while(a>y);
                y=y*(-1);
                result+=y+product;
            }

            else if (y>=0){
                double product=1;
                int a=0;
                do{
                    product*=z;
                    a++;
                 }while(a<y);
                result+=y+product;
            }

            return result;
        }
}




