import java.util.*;
public class reverse {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		int n=obj.nextInt();
		int rev=0,rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
				System.out.println(" reverse= " +rev);


	}

}

OUTPUT
========
enter number
12345
 reverse= 54321

