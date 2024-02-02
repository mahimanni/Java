/*
Output-
aBcD
eFgH
iJkL
mNoP
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class abcd
{
 public static void main(String [] args)throws IOException
 {
   int p=97,q=65,p2=97,q2=65,m,n,x=0;
   //int m=4,n=4,x=0;   

   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the no of rows:");
   m=Integer.parseInt(br.readLine());
   System.out.println("Enter the no of columns:");
   n=Integer.parseInt(br.readLine());

   for(int i=0;i<m;i++)
   {
    for(int j=0;j<n;j++)
    {
     if((i+j)%2==0 && x%2==0)
     {
      System.out.print((char)p);
     }
     if((i+j)%2==0 && x%2!=0)
     {
       System.out.print((char)q2);
     }
    if((i+j)%2!=0 && x%2==0)
    {
      System.out.print((char)q);
    }
    if((i+j)%2!=0 && x%2!=0)
    {
      System.out.print((char)p2);
    }
    p+=1;
    q+=1;
    p2+=1;
    q2+=1;
   }
   System.out.println();
   x+=1;
  }//outer for loop ends here

 }
}
