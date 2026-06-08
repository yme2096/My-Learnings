
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    //creating an arraylist
    public static void createarraylist()
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        //using the add element to add the numbers
        list1.add(1);
        list2.add("subbu");
        list2.add("siva");
        list1.add(2);
        list2.add("dad");
       list3.add(true);
        list3.add(false);
        //printing the list
        System.out.print(list1);
System.out.print(list2);
System.out.print(list3);
System.out.println("by using get we print elements");
//using the get element
System.out.println(list1.get(0));
System.out.println(list1.get(1));
System.out.println(list2.get(0));
System.out.println(list2.get(1));
System.out.println(list2.get(2));
System.out.println(list3.get(0));
System.out.println(list3.get(1));
//using the remove element 
list1.remove(1);
list2.remove(2);
list3.remove(1);
System.out.print(list1);
System.out.print(list2);
System.out.print(list3);
//set element at index
list1.set(0,1);
list2.set(1,"dad");
list3.set(0,false);
//after setting the elements
System.out.println("after setting the elements");
System.out.print(list1);
System.out.print(list2);
System.out.print(list3);
System.out.println();
//contains in this we verify that element is there or not
System.out.println(list1.contains(1));
System.out.println(list2.contains("dad"));
System.out.println(list3.contains(false));
    }
    //to know the size of the arraylist we use the .size()
    public static void sizeofarraylist()
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
    }
//print reverse of an arraylist
public static void reverseanarraylist()
{ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("original arraylist");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println("reverse an arraylist");
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i));
        }

}
//finding the maximum element in arraylist
public static void maxelement()
{
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++)
    {
        if(max<list.get(i))
        {
            max=list.get(i);
        }
    }
    System.out.println(max);
}
//swap two numbers
public static void swapnumbers()
{
    ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int idx1=0;
        int idx2=1;
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);

}
//sorting an arraylist
public static void sortingarraylist()
{
     ArrayList<Integer> height = new ArrayList<>();

        // adding elements
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        //it will sort in ascending order
        Collections.sort(height);
        System.out.println(height);
        //it will sort in descending order
        Collections.sort(height,Collections.reverseOrder());
        System.out.println(height);

}
//container with maximum water
public static void containermaximumwater()
{
     ArrayList<Integer> height = new ArrayList<>();

        // adding elements
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int currsum=0;
        int maxwater=0;
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int h=Math.min(height.get(i),height.get(j));
                int w=j-i;
                currsum=h*w;
                maxwater=Math.max(currsum,maxwater);
            }
        }
        System.out.println(maxwater);
}
//using two pointer approach for container with maxwater()
public static void twopointer()
{
    ArrayList<Integer> height = new ArrayList<>();

        // adding elements
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int currsum=0;
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp)
        {
            int h=Math.min(height.get(lp), height.get(rp));
            int w=rp-lp;
            currsum=h*w;
           maxwater= Math.max(currsum,maxwater);
            if(height.get(lp)<height.get(rp))
                lp++;
            else
                rp--;
        }
        System.out.println(maxwater);
}
//pairsum
public static boolean pairsum()
{
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    int target=5;
    for(int i=0;i<list.size();i++)
    {
        for(int j=i+1;j<list.size();j++)
        {
           if((list.get(i)+list.get(j)==target))
           {
            return true;
           }
          
        }
    }
    return false;
}
//pairsum using the two pointer approach
public static boolean pairsum1()
{
 ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    int target=5;
    int lp=0;
    int rp=list.size()-1;
    while(lp<rp)
    {
        if(list.get(lp)+list.get(rp)==target)
        {
            return true;
        }
        else if(list.get(lp)+list.get(rp)<target)
            lp++;
        else
            rp--;
    }
    return false;
}
//multidimensional arraylist
public static void multidimensionalarraylist()
{
    ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
    ArrayList<Integer> list1=new ArrayList<>();
    list1.add(1);
    list1.add(2);
    System.out.println(list1);
    ArrayList<Integer> list2=new ArrayList<>();
    list2.add(2);
    list2.add(4);
    System.out.println(list2);
    mainlist.add(list1);
    mainlist.add(list2);
      for(int i = 0; i < mainlist.size(); i++) {

            ArrayList<Integer> curr = mainlist.get(i);

            for(int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }

            System.out.println();
        }
    System.out.println(mainlist);



}
    public static void main(String args[])
    {
     //createarraylist();
     //sizeofarraylist();
     //reverseanarraylist();
     //maxelement();
    // containermaximumwater();
     //twopointer();
    // System.out.println(pairsum());
    //System.out.println(pairsum1());
    //swapnumbers();
    //sortingarraylist();
    multidimensionalarraylist();
    }
}
