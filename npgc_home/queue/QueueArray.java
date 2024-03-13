//Implementation of Queue using Array
public class QueueArray
{
 static class Queue
 {
  //static type so that we can access it in other funcs as well
  static int arr[];
  static int size;
  static int rear=-1;
  //front always 0 when we implement from array
  
  Queue(int n)
  {
   arr=new int[n];
   this.size=n;
  }

  public static boolean isEmpty()
  {
   return rear==-1;//no ele stored in queue/array
  }

  //enqueue
  public static void add(int data)
  {
   if(rear==size-1)//if index is on last ele,i.e. stored n ele
   {
    System.out.println("Full queue");
    return; 
   } 
   rear++;
   arr[rear]=data;
  }

  //dequeue
  public static int remove()
  {
   if(rear==-1)//if(isEmpty())
   {
    System.out.println("Empty queue");
    return -1;
   }

   int front=arr[0];
   for(int i=0;i<rear;i++)
    arr[i]=arr[i+1];

   //we shifted all element to previous place so now our rear should also shift to its previous place
   rear--;
   return front;
  }

  //peek
  public static int peek()
  {
   if(rear==-1)
   {
    System.out.println("Empty queue");
    return -1;
   }
   return arr[0];
  }
 }

 public static void main(String [] args)
 {
  Queue q=new Queue(5);
  q.add(1);
  q.add(2);
  q.add(3);

  while(!q.isEmpty())
  {
   System.out.println(q.peek());
   q.remove();
  }
 }
}