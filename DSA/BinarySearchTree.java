import java.util.*;
public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }

    //insert
    public static Node insert(Node root,int val){
        if(root==null)
        {
          root=new Node(val);
          return root;
        }

        if(root.data>val)
        {
            //left subtree
           root.left= insert(root.left,val);
        }else{
            //right subtree
           root.right= insert(root.right,val);
        }
        return root;

    }
    //inorder
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    //search function
    public static boolean search(Node root, int key) {

    if(root == null) {
        return false;
    }

    if(root.data == key) {
        return true;
    }

    if(root.data > key) {
        return search(root.left, key);
    } else {
        return search(root.right, key);
    }
}
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
         for(int i=0;i<values.length;i++)
         {
            root=insert(root, values[i]);
         }
         inorder(root);
         System.out.println();

          int key = 6;

        if (search(root, key)) {
            System.out.println(key + " Found");
        } else {
            System.out.println(key + " Not Found");
        }


    }
}