import java.util.Scanner;
public class A1_Fibonacci {
	

	public void fibonacciIterative(int n) 
	{
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		if(n == 1) {
			System.out.print(fib1);
		}
		if(n == 2) {
			System.out.print(fib1+" "+fib2);
		}
	    System.out.print(fib1+" "+fib2);
		for(int i=3; i<=n; i++) 
		{
		    
			fib3=fib1+fib2;    
            System.out.print(" "+fib3);    
            fib1=fib2;    
            fib2=fib3;   
		}
		
	}
	
	
	public int fibonacciRecursive(int n) {
		if(n == 1 || n == 2) {
			return n-1;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	
	public static void main(String args[]) {
		A1_Fibonacci fib = new A1_Fibonacci();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Iterative version:");
		System.out.print("Enter no of terms to be generated in fibonacci sequence:");
		int n=Integer.parseInt(s.nextLine());
		fib.fibonacciIterative(n);
		
		
		System.out.println("\nRecursive version:");
		System.out.print("Enter no of terms to be generated in fibonacci sequence:");
		n=Integer.parseInt(s.nextLine());
		System.out.print(fib.fibonacciRecursive(n));
		s.close();
		
	}
}
