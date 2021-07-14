import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter year:");
		int year=sc.nextInt();
		int c=0;
		if(year>=1990 &&year<=1995) {
			c=1;
		}
		else if(year>=1996 &&year<=2000) {
			c=2;
		}
		else if(year>=2001 &&year<=2010) {
			c=3;
		}
		else if(year>=2011 &&year<=2021) {
			c=4;
		}
		switch(c) {
		case 1:
			System.out.println("Early 90's born");
			break;
		case 2:
			System.out.println("Late 90's born");
			break;
		case 3:
			System.out.println("You are new decade born");
			break;
		case 4:
			System.out.println("You are recently born");
			break;
		default:
			System.out.println("Invalid Year");
			break;
		}
	}

}
