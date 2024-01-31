class Time
{
 int a,b,c;
 public Time()
 {
  a=0;
  b=0;
  c=0;
 }
 public Time(int x,int y,int z)
 {
  a=x;
  b=y;
  c=z;
 }
 public void sum(Time M,Time N)
 {
  a=M.a+N.a;
  b=M.b+N.b;
  c=M.c+N.c;
  
  //Method-1
  /*while(c>=60)
  {
   c-=60;
   b+=1;
  }
  while(b>=60)
  {
   b-=60;
   a+=1;
  }*/

  //Method-2
  b+=c/60;
  c=c%60;
  
  a+=b/60;
  b=b%60;

  System.out.print("Time- "+a+":"+b+":"+c);
 }
}//class Time ends here

class ExecuteTime
 {
  public ExecuteTime()
  {
   System.out.println("Executing...");
  }

  public static void main(final String [] args)
  {
   ExecuteTime s=new ExecuteTime();

   Time r=new Time();
   Time p=new Time(10,20,30);
   Time q=new Time(20,10,40);
   
   r.sum(p,q);
  }
 }

 