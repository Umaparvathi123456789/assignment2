class Hollowspace2{
 public static void main(String args[])
{
for(int i=1;i<=7;i++)
{
for(int j=1;j<=14;j++)
{
if(i==1 || j==1 || j==14)
{
System.out.print(" ");
}
else
System.out.print(" ");
}
System.out.println();
}
for(int i=1;i<=7;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
for(int j=7;j>=i;j--)
{
if(j==7)
{
System.out.print("");
}
else
System.out.print("  ");
}
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}}}