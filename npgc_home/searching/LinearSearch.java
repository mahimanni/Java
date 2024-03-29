import java.io.*;
public class LinearSearch
{
 //BY ITERATION
 public static int search(int arr[],int n,int x)
 {
  for(int i=0;i<n;i++)
  {
   if(arr[i]==x)
    return i+1;//returning position acc to 1-based indexing
  }
  return -1;//if ele not found return -1
 }

 //BY RECURSION
 public static int searchRecursive(int arr[],int i,int n,int x)
 {
  if(i>=n)
    return -1;
  if(arr[i]==x)
    return i+1;
  return searchRecursive(arr,i+1,n,x);
 }

 public static void main(String [] args)throws IOException
 { 
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the size of array:");
  int n=Integer.parseInt(br.readLine());
  
  int a[]=new int[n];
  System.out.println("Enter the array elements:");
  for(int i=0;i<n;i++)
  {
   a[i]=Integer.parseInt(br.readLine());
  }
  
  System.out.println("Enter the number to search:");
  int x=Integer.parseInt(br.readLine());
  
  int pos=search(a,n,x);
  if(pos==-1)
   System.out.println("Search Unsuccessful");
  else
   System.out.println("Element "+x+" found at position(1-based): "+pos);

  //checking by recursion
  System.out.println("Checking by Recursion method:");
  int posR=searchRecursive(a,0,n,x);
  if(posR==-1)
   System.out.println("Search Unsuccessful");
  else
   System.out.println("Element "+x+" found at position(1-based): "+posR);
 }
}

  