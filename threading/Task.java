import java.util.*;
class Task 
{
	public static void main(String[] args) 
	{
		System.out.println("Task 1");
		for(int i=0; i<=10; i++)
		{
			System.out.println(" + ");
		}
		System.out.println("Task 1 finished");

		System.out.println("Task 2");
		System.out.println("Enetr the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(n + " is even number ");
		}
		else
		{
			System.out.println(n + " is odd number ");
		}
		System.out.println("Task 2 finished ");

		System.out.println("Task 3 ");

        for(int i=0; i<=10; i++)
		{
			System.out.println(" * ");
		}
		System.out.println("Task 3 finished");
	}
}
