import java.util.Scanner;

public class fabi
{
	public static void main (String[] args)  {
	    Scanner s =new Scanner(System.in);

            int n =s.nextInt();
            int a=0,b=1;
            for(int i =1;i<=n;++i)
            {
                System.out.println(a+" ");
                int c =a+b;
                a =b ;
                b =c;
               
            }
        }
    }