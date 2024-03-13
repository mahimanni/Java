//Implementation of Circular Queue using Array
public class CircularQueueArray
{
 static class Queue
 {
  static int arr[];
  static int size;
  static int rear=-1;
  static int front=-1;

  Queue(int n)
  {
   arr=new int[n];//imp
   this.size=n;
  }
   
  public static boolean isEmpty()
  {
   return rear==-1 && front==-1;
  }

  public static boolean isFull()
  {
   return (rear+1)%size==front;
  }

  //enqueue
  public static void add(int data)
  {
   if(isFull())
   {
    System.out.println("Queue is full");
    return;
   }

   if(front==-1)//1st element add
    front=0;

   rear=(rear+1)%size;
   arr[rear]=data;
  }

  //dequeue
  public static int remove()
  {
   if(isEmpty())
   {
    System.out.println("Queue is empty");
    return -1;
   } 
   int deleted=arr[front];

   //if there is only one element in queue
   if(rear==front)
    rear=front=-1;
   else
    front=(front+1)%size;

   return deleted;
  }
  
  //peek
  public static int peek()
  {
   if(isEmpty())
   {
    System.out.println("Queue is empty");
    return -1;
   }
   return arr[front];//imp
  }
 }

 public static void main(String [] args)
 {
  Queue q=new Queue(5);
  q.add(1);
  q.add(2);
  q.add(3);
  q.add(4);
  q.add(5);
  
  //System.out.println(q.remove());//1
  q.remove();
  q.add(6);
  
  while(!q.isEmpty())
  {
   System.out.println(q.peek());
   q.remove();
  }
 }
}
/*
O/P-
2
3
4
5
6
*/
