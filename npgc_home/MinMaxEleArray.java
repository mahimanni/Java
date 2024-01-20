//Program to find the minimum and maximum element in the array
import java.io.*;
public class MinMaxEleArray
{
 public static void minMax(int a[])
 {
   int min=a[0],max=a[0];
   for(int i=0;i<a.length;i++)
   {
     if(a[i]<min)
        min=a[i];
     if(a[i]>max)
        max=a[i];
   } 
   System.out.println("Minimum element in the array: "+min);
   System.out.println("Maximum element in the array: "+max);
 }
 public static void main(String [] args) throws IOException
 {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int n;
   System.out.println("Input the length of the array:");
   n=Integer.parseInt(br.readLine());
   int a[]=new int[n];
   System.out.println("Enter the elements:");
   for(int i=0;i<n;i++)
   {
     a[i]=Integer.parseInt(br.readLine());
   }
   minMax(a);
 }
}