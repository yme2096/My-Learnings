import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class Binarytree1 {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree
    {
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
          idx++;
          if(nodes[idx]==-1)
          {
            return null;
          }
          Node newnode=new Node(nodes[idx]);
          newnode.left=buildTree(nodes);
          newnode.right=buildTree(nodes);
          return newnode;

        }
    }
    //preorder Traversal
  public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    //Inorder Traversal
public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }
    //postorder Traversal
 public static void postorder(Node root) {
    if (root == null) {
        return;
    }

    postorder(root.left);   // Left
    postorder(root.right);  // Right
    System.out.print(root.data + " "); // Root
}
//level order Traversal
public static void levelOrder(Node root) {
    if (root == null) {
        return;
    }

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
        Node currNode = q.remove();

        if (currNode == null) {
            System.out.println();

            if (q.isEmpty()) {
                break;
            } else {
                q.add(null);
            }
        } else {
            System.out.print(currNode.data + " ");

            if (currNode.left != null) {
                q.add(currNode.left);
            }

            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
    }
}
//height of a tree
public static int height(Node root) {
    if (root == null) {
        return 0;
    }

    int lh = height(root.left);
    int rh = height(root.right);

    return Math.max(lh, rh) + 1;
}
//count of Nodes
public static int count(Node root) {
    if (root == null) {
        return 0;
    }

    int leftCount = count(root.left);
    int rightCount = count(root.right);

    return leftCount + rightCount + 1;
}
//sum of nodes
public static int sum(Node root) {
    if (root == null) {
        return 0;
    }

    int leftSum = sum(root.left);
    int rightSum = sum(root.right);

    return leftSum + rightSum + root.data;
}
/* 
// Diameter of tree
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);

        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }
        */
//Approach-2
 static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(
                        Math.max(leftInfo.diam, rightInfo.diam),
                        leftInfo.ht + rightInfo.ht + 1
                    );

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }
    //Subtree of another tree


    // Check if two trees are identical
    public static boolean isIdentical(Node node, Node subRoot) {

        if (node == null && subRoot == null) {
            return true;
        }

        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }

        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    // Check if subRoot is subtree of root
    public static boolean isSubtree(Node root, Node subRoot) {

        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }
    //Top view of a Tree
    public static void topview(Node root)
    {
        //Level order
         
    }
public static void main(String[] args)
     {
        //subtree of another tree
         // Main Tree
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    // Subtree
    Node subRoot = new Node(2);
    subRoot.left = new Node(4);
    subRoot.right = new Node(5);

    System.out.println(isSubtree(root, subRoot));
        /* 
       //Diameter of a node approach-2
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter = " + diameter(root).diam);
        System.out.println("Height = " + diameter(root).ht);
        */
        /* 
        //Diameter of a node
         Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
        System.out.println("Diameter of tree = " + diameter(root));
        */
        /* 
//sum of nodes
        Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.println("Sum = " + sum(root));
    */
    /* 
     //count no of nodes   
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

        System.out.println("Total Nodes = " + count(root));
        */
        
        /* 
        //height of a tree

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println("Height = " + height(root));
    */
    /* 
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
    
        //level order traversal
        Binarytree1.levelOrder(root);
        //Binarytree1.preorder(root);
       // Binarytree1.Inorder(root);
        //System.out.println(root.data);
        */
    }
}