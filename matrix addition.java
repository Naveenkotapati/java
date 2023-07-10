package exam;
import java.util.*;
public class matrixaddition {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter rows");
		int r=s.nextInt();
		System.out.print("Enter columns");
		int c=s.nextInt();
		int m1[][]=new int[r][c];
		int m2[][]=new int[r][c];
		System.out.println("Enter 1st matrix");
		for(int i=0;i<r;i++) 
		{
			for(int j=0;j<c;j++)
			{
				m1[i][j]=s.nextInt();
				
			}
		}
		System.out.println("Enter 2nd matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				m2[i][j]=s.nextInt();
				
			}
		}
		System.out.println("sum of matrix is");
		int sum[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum[i][j]=m1[i][j]+m2[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
