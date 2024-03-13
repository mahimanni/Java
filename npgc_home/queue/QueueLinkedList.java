//Implementation of Queue using Linked List
public class QueueLinkedList
{
 static class Node
 {
  int data;
  Node next;
  Node(int data)
  {
   this.data=data;
   next=null;
  }
 }

 static class Queue
 {
  static Node head=null;
  static Node tail=null;
  
  public static boolean isEmpty()
  {
   return head==null && tail==null;
  }

  //no need of isFull
  //ll:variable size data structure(full when prog memory fills)

  //enqueue
  public static void add(int data)
  {
   Node newNode=new Node(data);

   //if ll empty both tail head null
   if(tail==null)
   {
    tail=head=newNode;
    return;
   }

   tail.next=newNode;
   tail=newNode;
  }

  //dequeue
  public static int remove()
  {
   if(isEmpty()) 
   {
    System.out.println("Queue is empty");
    return -1;
   }
   int front=head.data;
   
   //if only one element
   if(head==tail)
    tail=null;

   head=head.next;
   return front;
  }
  
  //peek
  public static int peek()
  {
   if(isEmpty())
   {
    System.out.println("Queue is empty");
    return -1;
   }
   return head.data;
  }
 }

 public static void main(String [] args)
 {
  Queue q=new Queue();
  q.add(1);
  q.add(2);
  q.add(3);
  q.add(4);
  q.add(5);

  while(!q.isEmpty())
  {
   System.out.println(q.peek());
   q.remove();
  }
 }
}