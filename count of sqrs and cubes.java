import java.util.*;
public class countofsqrsandcubes {
	static boolean sq(int n)
	{
		int s=(int)Math.sqrt(n);
		return (s*s)==n;	
	}
	static boolean cu(int n)
	{
		int c=(int)Math.cbrt(n);
		return(c*c*c)==n;
	}
	static int show(int n)
	{
		int count =0;
		for(int i=1;i<=n;i++)
		{
			if(sq(i))
				count++;
			else if(cu(i))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		System.out.println("no of squares and cubes="+(show(n)));
		
	}

}
