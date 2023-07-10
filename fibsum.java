class fibsum
{
public static void main(String[]arg)
{
int a=0,b=1,c=0,i,n=4,sum=0;
for(i=1;i<=n;i++)
{
a=b;
b=c;
c=a+b;
sum+=c;
}
System.out.println(sum);
}
}
