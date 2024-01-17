import java.util.*;
public class RandomNo
{
  public static void main(String args[])
  {
    int d;
    for(int i=1;i<=5;i++)
    {
      d=(int)(Math.random()*10);//Math.random()->provides fractional no btw 0 and 1.If value obtained multiplied by 10 gives integer no btw 1-10
      System.out.println(d);
    }
  }
} 