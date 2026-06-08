import java.util.*;
public class Stacks 
{


//stack is implemented using the linkedlist
/* 
static class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
static class Stack
{
    static Node head=null;
    public static boolean isEmpty()
    {
        return head==null;
    }
    //push
    public static void push(int data)
    {
        Node newnode =new Node(data);
        if(isEmpty())
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    //pop
    public static int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    //peek
    public static int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return head.data;
    }
} 

*/



    //implementation of stack using the arrayList
    /* 
    static class Stack
    {
        static ArrayList<Integer> list =new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        //push
        public static void push(int data)
        {
            list.add(data);
        }
        //pop
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek()
        {
             if(isEmpty())
            {
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
    } */
   public static void pushatbottom(Stack<Integer> s,int data)
   {
    if(s.isEmpty())
    {
        s.push(data);
        return;
    }
    int top=s.pop();
    pushatbottom(s, data);
    s.push(top);
   }
   //reverse a string using a stack
   public static String reverseastring(String str)
   {
    Stack<Character> s=new Stack<>();
    int idx=0;
    while(idx<str.length())
    {
    s.push(str.charAt(idx));
    idx++;
    }
    StringBuilder sb=new StringBuilder("");
     while(!s.isEmpty())
     {
        char curr=s.pop();
        sb.append(curr);
     }
     str=sb.toString();
     return str;
   }
   //reverse a stack
   public static void reverseastack(Stack<Integer> s)
   {
    if(s.isEmpty())
    {
        return;
    }
     int top=s.pop();
     reverseastack(s);
     pushatbottom(s, top);
   }
   //print stack
   public static void printstack(Stack<Integer> s)
   {
    while(!s.isEmpty())
    {
        System.out.println(s.pop());
    }
   }
   //Stock span problem
   public static void stockSpan(int stocks[], int span[]) {

        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {

            int currPrice = stocks[i];

            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }
   
    public static void main(String args[])
    {

     //stock span problem
      int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }





        //next greater element
        /* 
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // 1️⃣ while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2️⃣ if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // 3️⃣ push in stack
            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }

        System.out.println();
*/


      /* 
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        reverseastack(s);
        printstack(s);
          */
       /*  
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty())
        {
        System.out.println(s.peek());
        s.pop();
        }  
        */
       //implemented using the java collection framework
       /* 
       Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!s.isEmpty())
        {
        System.out.println(s.peek());
        s.pop();
*/
// to push data at the bottom of the stack
/* 
Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushatbottom(s,5);
        while(!s.isEmpty())
        {
        System.out.println(s.peek());
        s.pop();
    }
*/
/* 
String str="hi dad";
String result=reverseastring(str);
System.out.println(result);
      */  
    }
}
