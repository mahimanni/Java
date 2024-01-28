import java.io.*;
import java.util.ArrayList;
public class Array2
{
 public static void insert(int a[],int pos,int num)
 {
  int b[]=new int[a.length+1];
  for(int i=0;i<a.length+1;i++)
  {
   if(pos>i)
    b[i]=a[i];
   else//(pos==i)
    b[i]=num;
   
   if(pos<i)
    b[i]=a[i-1];
  }
  System.out.println("After insertion:");
  for(int x:b)
   System.out.print(x+" ");
  System.out.println();
 }

 public static void delete(int a[],int pos)
 {
  for(int i=0;i<a.length-1;i++)
  {
   if(i>=pos)
    a[i]=a[i+1];
  }
  //System.out.println("Last index="+a[a.length-1]);
  //for(int x:a)
  for(int i=0;i<a.length-1;i++)
    System.out.print(a[i]+" ");
  System.out.println();
 }
 
 public static void subset(int ind,ArrayList<Integer> al,int a[])
 {
  if(ind>=a.length)
  {
   for(int x: al)
    System.out.print(x+" ");
   if(al.size()==0)
    System.out.print("{}");

   System.out.println();
   return;
  }
  
  al.add(a[ind]);
  subset(ind+1,al,a);
  al.remove(al.size()-1);
  subset(ind+1,al,a);
 }

 public static void main(String [] args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  int a[]=new int[10];
  System.out.println("Enter the array elements:");
  for(int i=0;i<10;i++)
  {
   a[i]=Integer.parseInt(br.readLine());
  }
  
  int choice,n;
  while(true)
  {
   System.out.println("1 Insert an element at particular position\n2 Delete an element at particular position\n3 Find the subset of array elements");
   System.out.println("Enter choice:");
   n=Integer.parseInt(br.readLine());
   switch(n)
   {
    case 1:
     System.out.println("Enter the position(1-based) at which you want to insert the number:");
     int pos=Integer.parseInt(br.readLine());
     System.out.println("Enter the number to be inserted:");
     int num=Integer.parseInt(br.readLine());
     insert(a,pos-1,num);
     break;
  
    case 2:
     System.out.println("Enter the position(1-based) of element to be deleted:");
     int p=Integer.parseInt(br.readLine());
     delete(a,p-1);
     break;
 
    case 3:
     ArrayList<Integer> al=new ArrayList<>();
     subset(0,al,a);
     break;
    
    default:
     System.out.println("Invalid choice");
   }
   System.out.println("Do you want to continue:\nPress 1 to continue\nPress 0 to exit");
   choice=Integer.parseInt(br.readLine());
   if(choice==0)
      System.exit(0);
  }//while ends here

 }//main method ends here
}//class ends here