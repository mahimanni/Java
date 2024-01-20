import java.io.*;
import java.util.*;
public class SubarrayGivenSum
{
 public static ArrayList<Integer> subarraySum(int arr[],int n,int s)
 {
  int i,cursum=arr[0],x=0,y=0,flag=0;
  ArrayList<Integer> al=new ArrayList<Integer>();

  for(i=1;i<=n;i++)
  {
   while(cursum>s && x<i-1)
   {
    cursum-=arr[x];
    x++;
   }
   if(cursum==s)
   {
    y=i;
    flag=1;
    break;
   } 
   if(i<n)
   { 
     cursum+=arr[i];
   }
  }//for loop ends here

  if(flag==1)
  {
   al.add(x+1);
   al.add(y);
  }
  else
  {
   al.add(-1);
  }
  return al;
 }

 public static void main(String [] args) throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the size of array:");
  int n=Integer.parseInt(br.readLine());
    
  int arr[]=new int[n];
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++)
  {
    arr[i]=Integer.parseInt(br.readLine());
  }
  
  System.out.println("Enter sum:");
  int s=Integer.parseInt(br.readLine());
  
  ArrayList<Integer> al=new ArrayList<>();
  al=subarraySum(arr,n,s);
  if(al.get(0)==-1){
    System.out.println("No subarray found with given sum");
  }
  else{
   System.out.println("Subarray found between indices");
   for(int m:al)
   {
    System.out.print(m+" ");
   }
  }
 }
}