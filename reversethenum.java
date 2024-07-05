import java.util.Scanner;

public class reversethenum
{
	public static void main (String[] args)  {
	    Scanner s =new Scanner(System.in);

        int a = 145637;
		int t =a,rev =0;
		while(t>0)
		{
		    int rem = t%10;
		    rev = rev*10+rem;
		    t=t/10;
		}
		    System.out.print(rev);
    }
}