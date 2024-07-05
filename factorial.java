import java.util.Scanner;

public class factorial
{
	public static void main (String[] args)  {
	    Scanner s =new Scanner(System.in);
        int facto=1;
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            facto =facto*i;
        }
        System.out.println("Factorial of : "+n);
        System.out.println(facto);
    }
}