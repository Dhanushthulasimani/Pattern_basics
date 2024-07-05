                
import java.util.Scanner;

public class pattern_1_01_101
{
	public static void main (String[] args)  {
	    Scanner s =new Scanner(System.in);
                int n =s.nextInt();
                int t = 0;
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        t = i+j;
                        if(t%2==0)
                        {
                            System.out.print("1");
                        }
                        else{
                            System.out.print("0");
                        }
                    }
                    System.out.println();
                }
            }
        }