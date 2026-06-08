import java.util.*;
public class arrays1
{
    public static void arraycreation()
    {
      int a[]=new int[50];
 a[0]=90;
 a[1]=67;
 a[2]=35;
 System.out.println(a[0]);
 System.out.println(a[1]);
 System.out.println(a[2]);
    }
    public static void insertandupdate()
    {
     Scanner sc=new Scanner(System.in);
     int a[]=new int[5];
     for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        } 
        for(int j=0;j<a.length;j++)
        {
         System.out.println(a[j]);
        }
    }
    public static void update()
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        a[2]=a[2]+1;
        System.out.println(a[2]);
    }
    public static int linearsearch()
    {
     int a[]={2,5,6,89,9};
     int key=90;
      for(int i=0;i<a.length;i++)
      {
       if(a[i]==key)
       {
        return 1;
       }
      }
      return -1;
    }
    //binary search code
    public static int binarySearch()
    {
       int a[]={2,4,5,6,7,8};
       int key=4;
       int start=0;
       int last=a.length-1;
       while(start<=last)
       {
     int mid =(start+last)/2;
     if(key==a[mid])
     {
        return mid;
     }
     else if(key>a[mid])
     {
        start=mid+1;
     }
     else
     {
      last=mid-1;
     }
    
       }
       return -1;
    }
    //largest and smallest in array
    public static void larandsmall()
    {
        int a[]={0,4,6,7,58};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
             if(a[i]<smallest)
            {
                smallest=a[i];
            }

           
        }
         
          System.out.println(smallest);
    }
//reverse an array
public static void reverseanarray()
{
    int a[]={2,4,6,6,7,8,9};
     for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]);
    }
    System.out.println();
    int first=0;
    int last=a.length-1;
    int temp;
    while(first<last)
    {
       temp=a[last];
       a[last]=a[first];
       a[first]=temp;
       first++;
    last--;
    }
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]);
    }
    System.out.println();
    
}
//pairs in arrays
public static void pairsinarrays()
{
    int a[]={1,2,4,56,78,97,56};
    int tp=0;
    for(int i=0;i<a.length;i++)
    {
        int curr=a[i];
    
    for(int j=i+1;j<a.length;j++)
    {
      System.out.print("("+curr + ","+a[j]+")");
      tp++;
    }
    System.out.println();
   
}
  System.out.println(tp);
}
//print subarrays
public static void printsubarrays()
{
  int a[]={1,2,4,56,78,97,56};
  for(int i=0;i<a.length;i++)
    {
        int start=i;
    
    for(int j=i;j<a.length;j++)
    {
        int end=j;
        for(int k=start;k<=end;k++)
        {
            System.out.print(a[k]);
        }
        System.out.println();
    }
}

    
}
 public static void main(String args[])
 {
 //arraycreation();
 //insertandupdate();
 //update();
 //System.out.println(linearsearch());
 //System.out.println(binarySearch());
 //larandsmall();
 //reverseanarray();
 //pairsinarrays();
 printsubarrays();
 }
}