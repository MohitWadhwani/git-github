import java.util.Scanner;
class num
{
        public static void main(String [] args)
        {
                int a,b,n;
                Scanner in=new Scanner(System.in);
                System.out.println("enter two numbers");
                a=in.nextInt();
                b=in.nextInt();
                System.out.println("enter nth number which is divisble by one of the above and both number");
                n=in.nextInt();
          System.out.println((n/a)*(n/b));
                }
        }

