import java.util.*;
import java.util.LinkedList;
public class linkedlist2 {
     
  //Node class
  public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //methods add in linked list
    //add first add last  //O(1)-constant
    public void addFirst(int data)
    {
        
        //step1:create new node
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //step2:new node->next=head
        newNode.next=head;//link
      //step3:head=newnode
      head=newNode;

    }
    //addLast--O(1)--it is also constant time
    public void addLast(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    } 
    //print an linkedlist
    public void print()
    {
        if(head==null)
        {
            System.out.println("ll is empty");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
System.out.println("null");
    }
    //detect cycle exsist or not in ll
    public boolean detectcycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true; //cycle exsist
            }
        }
        return false; //cycle doesn't exsist
    }
    //remove cycle in a ll
    public static void removeCycle()
    {
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                cycle=true;
                break;
            }
        }
        if(cycle==false)
        {
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle -> last.next=null
        prev.next=null;

    }
    
    //ll in java collections framework
//merge sort on linkedlist
private Node getMid(Node head)
{
    Node slow=head;
    Node fast=head.next;
    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow; //midNode
}
//merge
private Node merge(Node head1,Node head2)
{
    Node mergedLL=new Node(-1);
    Node temp=mergedLL;
    while(head1!=null&&head2!=null)
    {
        if(head1.data<=head2.data)
        {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

    }
    while(head1!=null)
    {
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
    }
    while(head2!=null) {
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
    }
    return mergedLL.next;
}
public Node mergesort(Node head)
{
    if(head==null||head.next==null)
    {
        return head;
    }
//find mid
Node mid=getMid(head);
//left & right MS
Node rightHead=mid.next;
mid.next=null;
Node newLeft=mergesort(head);
Node newRight=mergesort(rightHead);
//merge
return merge(newLeft,newRight);
}
//zig-zag code
public void zigzag()
{
    //find mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    //reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
     Node left=head;
     Node right=prev;
     Node nextL,nextR;
     //alt merge-zig-zad merge
     while(left!=null&&right!=null)
     {
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;

     }
}
    public  static void main(String args[])
    {
       linkedlist2 ll=new linkedlist2();
       //for mergesort
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);
       ll.print();
       ll.zigzag();
      //ll.head= ll.mergesort(ll.head);
       ll.print();
      /* head=new Node(1);
       head.next=new Node(2);
       head.next.next=new Node(3);
       head.next.next.next=head;*/
       //1-2-3-1
      /*  head=new Node(1);
       Node temp=new Node(2);
       head.next=temp;
       head.next.next=new Node(3);
       head.next.next.next=temp;
       System.out.println(ll.detectcycle());
       removeCycle();
       System.out.println(ll.detectcycle());*/
/* 
    LinkedList<Integer> ll=new LinkedList<>();
    ll.add(1);
    ll.addLast(23);
    ll.addLast(24);
    ll.addFirst(0);
    System.out.println(ll);
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
*/


    }
}
