public class Linkedlist1 {
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
    /*add first add last */ //O(1)-constant
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
    //add in the middle
    public void addmiddle(int idx,int data)
    {
        if(idx==0)
        {
            addFirst(data);
            return;
        }
     Node newnNode=new Node(data);
     size++;
     Node temp=head;
     int i=0;
     while(i<idx-1)
     {
        temp=temp.next;
        i++;
     }
     newnNode.next=temp.next;
     temp.next=newnNode;
    }
    //remove first
    public int removefirst()
    {
        if(size==0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
        
    }
    //remove last
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++)
        {
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;

    }
    //search for an element using the iterative process
   public int iterativesearch(int key)
   {
    Node temp=head;
    int idx=0;
    while(temp!=null)
    {
        if(temp.data==key)
        {
          return idx;
        }
        temp=temp.next;
        idx++;
    }
    return -1;
   }
   //recursive search of an element
   public int recsearch(int key)
   {
    return helper(head,key);
   }
   //helper function
   public int helper(Node head,int key)
   {
    if(head==null)
    {
        return -1;
    }
    if(head.data==key)
    {
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1)
    {
        return -1;
    }
    return idx+1;
   }
   //reverse an linkedlist
   public void reverselinkedlist()
   {
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
   }
   //remove the nth from the end
   public void deletenthnode(int n)
   {
    //calculate size
    int sz=0;
    Node temp=head;
    while(temp!=null)
    {
        temp=temp.next;
        sz++;
    }
    // to remove first
    if(n==sz)
    {
        head=head.next;
        return;
    }
    //sz-n
    int i=1;
    int itoFind=sz-n;
    Node prev=head;
    while(i<itoFind)
    {
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;

   }
   //check if ll is palindrome or not
   public Node findMid(Node head)
   {
    Node slow=head;
    Node fast=head;
    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next; //+1
        fast=fast.next.next; //+2
    }
    return slow;//slow is my midnode
   }
   public boolean checkpalindrome()
   {
    //if there is only one ll or no ll is there then it is palindrome
    if(head==null||head.next==null)
    {
      return true;
    }
     //step1-find mid
     Node miNode=findMid(head);

     //step2: reverse 2nd half
     Node prev=null;
     Node curr=miNode;
     Node next;
     while(curr!=null)
     {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
     }
     Node right=prev;//right half head
     Node left=head;

     //step3::check left half and right half equal
     while(right!=null)
     {
        if(left.data!=right.data)
        {
            return false;
        }
        left=left.next;
        right=right.next;
     }
     return true;
   }
    
public static void main(String args[])
{
Linkedlist1 ll=new Linkedlist1();
/* 
ll.addLast(1);
ll.addLast(2);
ll.addLast(2);
ll.addLast(1);
ll.print();
*/
//System.out.println(ll.checkpalindrome());
/* 
ll.addFirst(4);
ll.addFirst(2);
ll.addFirst(4);
ll.addFirst(45);
ll.addLast(6);
//ll.print();
ll.addmiddle(1, 52);
*/
//ll.print();
System.out.println(size);
//System.out.println(ll.removefirst());
//System.out.println(ll.removeLast());
//ll.print();
//System.out.println(ll.iterativesearch(52));
//System.out.println(ll.recsearch(52));
//ll.print();
//ll.reverselinkedlist();
//ll.print();
//ll.print();
//ll.deletenthnode(3);
//ll.print();


}
}
