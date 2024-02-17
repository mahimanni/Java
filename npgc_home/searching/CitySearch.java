import java.io.*;
public class CitySearch
{
 public static int linearSearch(String arr[],String s,int n)//arr[] is city 
 {
   if(n<=0)
    return -1;
   if(arr[n-1].equals(s))
     return n-1;
   return linearSearch(arr,s,n-1);
   
   //2nd way but in this way pass (pos=linearSearch(city,s,10-1	q);) in main method
   /*if(n<0)
    return -1;
   if(arr[n].equals(s))
     return n;
   return linearSearch(arr,s,n-1);*/
 }

 public static void main(String [] args)throws IOException
 {
  String city[]=new String[10];
  int min[]=new int[10];
  int max[]=new int[10];
  String s;
  int pos;

  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  System.out.println("Enter name of cities:");
  for(int i=0;i<10;i++)
  {
   city[i]=br.readLine();
  }

  System.out.println("Enter the temperatures:");
  for(int i=0;i<10;i++)
  {
   System.out.println("Enter min temperature for city "+city[i]+":");
   min[i]=Integer.parseInt(br.readLine());
   System.out.println("Enter max temperature for city "+city[i]+":");
   max[i]=Integer.parseInt(br.readLine());
  }
  
  System.out.println("Enter the city name to search for it's temperature:");
  s=br.readLine();

  pos=linearSearch(city,s,10);
  if(pos==-1)
    System.out.println("No such city found");
  else
    System.out.println(s+" city min temperature is "+min[pos]+" and max temperature is "+max[pos]);
 }
}
  