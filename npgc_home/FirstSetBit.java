/* 18->010010 O/P:2
   12->1100   O/P:3*/

import java.io.*;
public class FirstSetBit
{
 //Functional Recursive Function
 public static int getFirstSetBit(int n)
 { 
  if(n==0)
    return 0;//if no set bit in the no then return 0
  if(n%2==1)
  {
   return 1;
  } 
  else
  {
   return 1+getFirstSetBit(n/2);
  }
 }

 public static void main(String [] args)throws IOException
 {
  int n;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Input the number:");
  n=Integer.parseInt(br.readLine());
  System.out.println("First set bit from right side in binary representation of no found at index(1-based): "+getFirstSetBit(n));
 }
}