import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int num[]= {2,3,4,5,6};
		int sum=0;
		for(int i : num)
		{
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
