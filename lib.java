package nav;
import java.util.*;
class personaldetails{
	void info()
	{
		Scanner as=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=as.nextLine();
		Scanner ph=new Scanner(System.in);
		System.out.println("Enter the phone number:");
		int phone=ph.nextInt();
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter address");
		String address=ac.next();
		
	}
}
class bookdetails
{
	void book()
	{
		Scanner b=new Scanner(System.in);
		System.out.println("Enter book name");
		String bookname=b.next();
		Scanner a=new Scanner(System.in);
		System.out.println("Enter Author name:");
		String author=a.next();
	}
}
class fine
{
	void fdetails()
	{
		Scanner da=new Scanner(System.in);
		System.out.println("Enter no.of days:");
		int days=da.nextInt();
		if(days>15)
		{
			System.out.println("pay 100 rupees fine");
		}
		else
		{
			System.out.println("Thanks for your visit");
		}
	}
}
class lib
{
	public static void main(String[] args)
	{
		System.out.println("Enter 1 for personal details");
		System.out.println("Enter 2 for book details");
		System.out.println("Enter 3 for fine details");
		Scanner n=new Scanner(System.in);
		System.out.println("Enter (1/2/3):");
		int op=n.nextInt();
		if(op==1)
		{
			personaldetails i=new personaldetails();
			i.info();
			
		}
		else if(op==2)
		{
			bookdetails j=new bookdetails();
			j.book();
		}
		else if(op==3)
		{
			fine x=new fine();
			x.fdetails();
		}
		else
		{
			System.out.println("Enter valid option");
		}
	}
}

