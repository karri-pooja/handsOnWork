import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number1:");
		int num1=sc.nextInt();
		System.out.println("enter number2:");
		int num2=sc.nextInt();
		System.out.println("enter number3:");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3)
			System.out.println(num1 + "is largest number");
		else if(num2>num3)
			System.out.println(num2 + "is largest number");
		else
			System.out.println(num3 + "is largest number");
			
	}

}
