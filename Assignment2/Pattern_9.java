class Pattern_9

{
  public static void main(String abc[])
  {
for(char i='A';i<='E';i++)
{
for(char j='D';j>=i;j--)
{
System.out.print(" ");
}
for(char k='A';k<=i;k++)
{
System.out.print(k+ " ");
}
System.out.println();
}}}