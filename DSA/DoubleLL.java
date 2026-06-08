public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        //add
        public void addFirst(int data)
        {
            Node newnode=new Node(data);
            size++;
            if(head==null)
            {
                head=tail=newnode;
                return;

            }
            newnode.next=head;
            head.prev=newnode;
            head=newnode;

        }
        //print
       public void print()
       {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
       } 
       //addLast
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
        newnode.prev=tail;
        tail=newnode;
       }
       //remove first
       public int removefirst()
       {
        if(head==null)
        {
            System.out.println("dll is empty");
        return-1;
        }
       else if(size==1)
        {
            int temp=head.data;
            head=tail=null;
            size=0;
            return temp;
        }
        int temp=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return temp;
       }
       //remove last
       public int removeLast()
       {
        if(head==null)
        {
            System.out.println("dll is empty");
        
        }
       else if(size==1)
        {
            int temp=head.data;
            head=tail=null;
            size=0;
            return temp;
        }
        int temp=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return temp;
       }
    
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
         dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);
        
        dll.print();
        System.out.println(dll.removefirst());
        dll.print();
       System.out.println(dll.removeLast());
        dll.print();
        System.out.println(dll.size);
    }
}