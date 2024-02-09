/*
*********
 *******
  *****
   ***
    *
 */
public class InvertedTriangle
{
 public static void main(String [] args)
 {
  int i=0,a=9,b=1;
  while(i<5)
  {
    for(int j=0;j<a;j++)
    {
      System.out.print("*");
    }
    System.out.println();
    for(int j=0;j<b;j++) 
    {
      System.out.print(" ");
    }
    b+=1;
    a-=2;
    i+=1;
  }
 }
}