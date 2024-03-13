import java.util.Stack;
public class QueueUsingTwoStacks
{
 static class Queue
 {
  static Stack<Integer> s1=new Stack<>();
  static Stack<Integer> s2=new Stack<>();
  
  public static boolean isEmpty()
  {
   return s1.isEmpty();
  }

  public static void add(int data)
  {
   //move all ele from stack 1 to stack 2
   while(!s1.isEmpty())
   {
    s2.push(s1.pop());
   }

   //add the element in stack 1
   s1.push(data);

   //now move back all ele from stack 2 to stack 1
   //so basically current ele(data) added will be at the end(pushbottom)
   //so in removing the ele which is last added is removed at last
   while(!s2.isEmpty())
   {
    s1.push(s2.pop());
   }
  }

  public static int remove()
  {
   if(isEmpty())
   {
    System.out.println("Queue is empty");
    return -1;
   }
   return s1.pop();
  }
  
  public static int peek()
  {
   if(isEmpty())
   {
    System.out.println("Queue is empty");
    return -1;
   }
   return s1.peek();
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