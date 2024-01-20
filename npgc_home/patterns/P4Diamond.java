/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
*/
public class P4Diamond
{
 public static void patternIterative()
 {
  int a=4;
  for(int i=1;i<=5;i++)//for printing first 5 rows
  {
   for(int x=1;x<=a;x++)//for printing starting spaces
   {
    System.out.print(" ");
   }
   a-=1;
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int k=i-1;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving next line 
  }

  int b=1;
  for(int i=4;i>=1;i--)//for printing next 5 rows
  {
   for(int x=1;x<=b;x++)//for printing starting spaces
   {
    System.out.print(" ");
   }
   b+=1;
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int k=i-1;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving next line
  }
 }

 public static void patternRecursive()
 {
 }

 public static void main(String [] args)
 {
  patternIterative();
  patternRecursive();
 }
}