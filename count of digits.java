import java.util.*;

public class countofdigits {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int n=obj.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
				System.out.println("no of digits= " +count);


	}

}


