class Hollowspace{
 public static void main(String args[])
{
for(int i=1;i<=1;i++)
{
for(int j=1;j<=14;j++)
{
System.out.print("*");
}
System.out.println();
}
for(int i=1;i<=6;i++)
{
for(int j=6;j>=i;j--)
{
System.out.print("*");
}
for(int j=1;j<=i;j++)
{
System.out.print("  ");
}
for(int j=6;j>=i;j--)
{
System.out.print("*");
}
System.out.println();
}
for(int i=1;i<=7;i++)
{
for(int j=1;j<=14;j++)
{
if(i==7 || j==1 || j==14)
{
System.out.print("*");
}
else
System.out.print(" ");
}
System.out.println();
}}}