public class P1BoxMinusDiamond
{
 public static void patternIterative()
 {
  int a=0;
  
  //for printing first 5 rows of pattern
  for(int i=5;i>=1;i--)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int x=0;x<a;x++)//for giving spaces between two triangles
   {
    System.out.print(" ");
   }
   a+=2;
   for(int k=i;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving line
  }
  
  a=a-2;
  //for printing the next 5 rows of pattern 
  for(int i=1;i<=5;i++)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int x=0;x<a;x++)
   {
    System.out.print(" ");
   }
   a-=2;
   for(int k=i;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();
  } 
 }

 public static void patternRecursive()
 {
 }

 public static void main(String []args)
 {
  patternIterative();
  patternRecursive();
 }
}
