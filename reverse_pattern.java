import java.util.Scanner;

public class reverse_pattern
{
	public static void main (String[] args)  {
	    Scanner s =new Scanner(System.in);

int n =s.nextInt();
for(int i=n;i>0;i--)
{
    for(int k=0;k<n-i;k++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}
    }
}