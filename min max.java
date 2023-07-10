package exam;
import java.util.*;
public class maxmin {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of elements:");
		int n=sc.nextInt();
		System.out.print("Enter the elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);System.out.println("Enter the m value:");
		int M=sc.nextInt();
		Arrays.sort(a);System.out.println("Enter the n value:");
		int N=sc.nextInt();
		int max=a[n-M];
		int min=a[N-1];
		int sum=max+min;
		int diff=max-min;
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		System.out.println("sum: "+sum);
		System.out.println("diff: "+diff);
	}
}
