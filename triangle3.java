import java.util.Scanner;

public class triangle3
{
	public static void main (String[] args)  {
	    Scanner s =new Scanner(System.in);

int n =s.nextInt();
for(int i=1;i<=n;i++)
{
    for(int k=1;k<=i;k++)
    {
        System.out.print(" ");
    }
    for(int j=i;j<=n;j++)
    {
      
        System.out.print(j+ " ");
        
    }
    System.out.println();
}
    }
}

