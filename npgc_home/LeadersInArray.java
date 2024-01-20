/*
Given array of +ve integers.Find leaders in the array.
An element of array is leader if it is greater than or equal to all the elements to its right side
Rightmost element is always a leader

eg-
n=6
A[]={16,17,4,3,5,2}
O/P- 17 5 2 */

import java.io.*;
import java.util.Stack;
public class LeadersInArray
{

 public static void printLeaders(int arr[],int size)//TC:O(n) SC:O(1)
 {
   /* Idea is to scan elements from R->L and keep track of max till now
   When max changes its value print it*/

   int maxFromRight=arr[size-1],i;
   System.out.println("Leaders elements in the array are:");

   System.out.print(maxFromRight+" ");//Rightmost element is always a leader 
   for(i=size-2;i>=0;i--)
   {
     if(arr[i]>=maxFromRight)
     {
       maxFromRight=arr[i];
       System.out.print(maxFromRight+" ");
     }
   } 
 }//printLeaders method ends here

 public static void printLeadersSameOrder(int arr[],int size)
 {
  /*Here output returned will be in the same order as the elements that appear in our input array*/
  int i;

  //create stack to store leaders
  Stack<Integer> st=new Stack<Integer>();
  st.push(arr[size-1]);
  for(i=size-2;i>=0;i--)
  {
    if(arr[i]>=st.peek())
    {
      st.push(arr[i]);
    } 
  }
  
  System.out.println("\nLeaders elements in the array in the same order are:");
  //print stack elements 
  //run loop till stack is not empty
  while(!st.empty())
  {
   System.out.print(st.pop()+" ");
  }
 }

 public static void main(String [] args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the size of array:");
  int n=Integer.parseInt(br.readLine());
  
  int a[]=new int[n];
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++)
  {
   a[i]=Integer.parseInt(br.readLine());
  } 
  printLeaders(a,n);
  printLeadersSameOrder(a,n);
 }
}