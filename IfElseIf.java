import java.util.Scanner;

public class IfElseIf{
	
	

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter year:");
		int year=sc.nextInt();
		if(year>=1990 && year < 1995)
					System.out.println("you are early 90's born");
		else if(year>=1995 && year < 2000)
					System.out.println("you are early 90's born");
		else if(year>=2000 && year < 2010)
					System.out.println("you are early 90's born");
		else if( year>=2010 && year < 2020)
					System.out.println("you are early 90's born");
		else
				System.out.println("Invalid Year");
	}
}
