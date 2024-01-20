/*
   1
  1 1
 1   1
1     1
 1   1
  1 1
   1
*/
public class P2HollowDiamond
{
 public static void patternIterative()
 {
  int a=3,b=3;
  for(int i=1;i<=4;i++)//for printing first 4 rows
  {
   for(int j=0;j<7;j++)
   {
    if(j==a || j==b)
     System.out.print("1");
    else
     System.out.print(" ");
   }
   a-=1;
   b+=1;
   System.out.println();//for giving next line
  }
  
  int c=1,d=5;
  for(int i=1;i<=3;i++)//for printing next 3 rows
  {
   for(int j=0;j<7;j++)
   {
    if(j==c || j==d)
     System.out.print("1");
    else
     System.out.print(" ");
   }
   c+=1;
   d-=1;
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