import java.util.Scanner;

public class Fibonacci_Program {
	public static int fib(int r)
	{
		if(r<=1)
		{
			return 1;
		}
		else
		{
			return fib(r-1)+fib(r-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,a=0;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		a=fib(n-1);
		System.out.println(a);

	}

}
