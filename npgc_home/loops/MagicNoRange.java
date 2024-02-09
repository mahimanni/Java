import java.util.*;
public class MagicNoRange
{
  public static boolean magic(int n)
  {
    int a,s=0;
    while(n>9)
    {
      while(n>0)
      {
        a=n%10;
        s=s+a;
        n=n/10;
      }
      if(s==1)
      {
        return true;
      }
      else
      {
         n=s;
         s=0;
      }
    }
    return false;
  }

  public static void main(String args[])
  {    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter start no");
    int n=sc.nextInt();
    System.out.println("Enter end no:");
    int m=sc.nextInt();
     
    for(int i=n;i<=m;i++)
    {
    if(magic(i)==true)
        System.out.println(i);
    }
  }
}