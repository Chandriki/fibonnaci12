package chandriki2;
import java.util.Scanner;

public class fibonnaci1 {
	static int fib(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter the fibonnacci series length:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=0;i<=x;i++)
		{
			System.out.println(fib(i));
		}
		
	}

}
