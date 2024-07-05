import java.util.Scanner;

public class pallidrome
{
	public static void main (String[] args)  {
	    Scanner s =new Scanner(System.in);

    int num =s.nextInt();
    int t=num,rev=0;
    while(t>0)
    {
        int n = t%10;
        rev = rev*10+n;
        t=t/10;
        
    }
    if(num==rev){
    System.out.println("Given number is pallindrome");
    }else{
        System.out.println("Given number is not pallindrome");
    }
}
}
