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
 //BY ITERATION
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

 //BY RECURSION
 static int ar=3,br=3,cr=1,dr=5;
 public static void patternRecursive()
 {
  upperHalf(1);
  lowerHalf(1);
 }
 
 public static void upperHalf(int i)
 {
  if(i>4)
    return;
  for(int j=0;j<7;j++)
   {
    if(j==ar || j==br)
     System.out.print("1");
    else
     System.out.print(" ");
   }
   ar-=1;
   br+=1;
   System.out.println();//for giving next line
   upperHalf(i+1);
 }
 public static void lowerHalf(int i)
 {
   if(i>3)
    return;
   for(int j=0;j<7;j++)
   {
    if(j==cr || j==dr)
     System.out.print("1");
    else
     System.out.print(" ");
   }
   cr+=1;
   dr-=1;
   System.out.println();//for giving next line
   lowerHalf(i+1);
 }

 public static void main(String [] args)
 {
  //patternIterative();
  patternRecursive();
 }
}