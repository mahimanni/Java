import java.io.*;
import java.lang.Math;
public class Array1
{
 public static void main(String [] args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the array elements:");
  int a[]=new int[10];
  for(int i=0;i<10;i++)
  {
   a[i]=Integer.parseInt(br.readLine());
  }
  
  
  int sum=0,sumEven=0,sumOdd=0,countEven=0,countOdd=0,countPos=0,countNeg=0,sumPos=0,sumNeg=0,count2Digit=0,count3Digit=0;
  for(int i=0;i<10;i++)
  {
   //a)Sum of each element
   sum+=a[i];

   //bi)Sum of even number
   if(a[i]%2==0)
   {
    sumEven+=a[i];
    countEven++;//ci)Count even number
   }
   else
   {
    sumOdd+=a[i];//bii)Sum of odd number
    countOdd++;//cii)Count odd number
   }

   
   if(a[i]>0)//0 is neither positive nor negative number
   {
    sumPos+=a[i];//di)Sum of positive number
    countPos++;//ei)Count positive number
   }
   else
   {
    sumNeg+=a[i];//dii)Sum of negative number
    countNeg++;//eii)Count negative number
   }

  
   int absoluteNumber=Math.abs(a[i]);//so that -minus will be removed if a[i] is a negative number
   String number=Integer.toString(absoluteNumber);
   int numberLength=number.length();
   if(numberLength==2)
     count2Digit++;//count 2-digit numbers
   if(numberLength==3)
     count3Digit++;//count 3-digit numbers
  }
  
  //Printing the results
  System.out.println("Sum of each element:"+sum);
  System.out.println("Sum of even numbers:"+sumEven+" and odd numbers:"+sumOdd);
  System.out.println("Count of even numbers:"+countEven+" and odd numbers:"+countOdd);
  System.out.println("Sum of positive numbers:"+sumPos+" and negative numbers:"+sumNeg);
  System.out.println("Count of positive numbers:"+countPos+" and negative numbers:"+countNeg);
  System.out.println("Count of 2-Digits numbers:"+count2Digit+" and 3-Digits numbers:"+count3Digit);
 }
}