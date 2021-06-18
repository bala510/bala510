import java.util.*;
public class minmax {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter number");
	int n=obj.nextInt();
	int rem,max=0;
	int min=9;
	while(n!=0)
	{
		rem=n%10;
		if(rem>max)
			max=rem;
		if(rem<min)
			min=rem;
		n=n/10;
	}
	System.out.println("max="+max);
	System.out.println("min="+min);
	}

}
