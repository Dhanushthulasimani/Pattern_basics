import java.util.Scanner;

public class triangle1
{
	public static void main (String[] args)  {
	    Scanner s =new Scanner(System.in);
int n =s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=0;k<n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}