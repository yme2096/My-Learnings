import java.util.Scanner;

public class Arrays {
    //creating an array
    int n=5;
    int arr[]=new int[5];
    int a[]={1,2,3,45,6};


    //input and output
   public static void charArray()
   {
    Scanner sc=new Scanner(System.in);
    char arr[]=new char[5];
    for(int i=0;i<5;i++)
    {
        arr[i]=sc.next().charAt(0);
    }
    for(int i=0;i<5;i++)
    {
        System.out.print(arr[i]);
    }
   }
   //size of an array
   public static void sizeofanarray()
   {
    Scanner sc=new Scanner(System.in);
    
    int a[]=new int[5];
    System.out.println(a.length);
   }
   //linear search code
   public static void linearsearch()
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        if(a[i]==key)
        {
            System.out.println("found");
            return;
        }
    
    }
    System.out.println("not found");
   }
   //largest in array
   public static void largestinarray()
   {
    int arr[]={1,2,4,6,7,8};
    int n=arr.length;
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<n;i++)
    {
       if(max<arr[i])
       {
        max=arr[i];
       }
       if(min>arr[i])
       {
         min=arr[i];

       }
    }
    System.out.println(max+" "+min);
   }
   //binary search
   public static int binarysearch()
   {
    int arr[]={2,6,7,8,10,12};
    int low=0;
    int high=arr.length-1;
    int key=2;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]<key)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
    return -1;
   }
   //reverse an array
   public static void reverseanarray()
   {
    int a[]={1,2,3,4};
    int left=0;
    int right=a.length-1;
    while(left<right)
    {
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
        left++;
        right--;
    }
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
   }
   //pairs in an array
   public static void pairsinanarray()
   {
    int a[]={2,4,5,6,7,7,8};
    int n=a.length;
    for(int i=0;i<n;i++)
    {
        int curr=a[i];
        for(int j=i+1;j<n;j++)
        {
            System.out.print("("+curr+","+a[j]+")");
        }
        System.out.println();
    }
   }
   //print subarrays
   public static void subarrays()
   {
    int a[]={2,4,5,6,7,7,8};
    int n=a.length;
    for(int i=0;i<n;i++)
    {
        
        for(int j=i;j<n;j++)
        {
            
            for(int k=i;k<=j;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
       
    }
   }
   //max subarraysum
   public static void maxsum()
   {
    int arr[]={1,2,4,5,6,7,8};
    int n=arr.length;
    int maxsum=0;
    for(int i=0;i<n;i++)
    {
        
        for(int j=i;j<n;j++)
        {
            int sum=0;
            for(int k=i;k<=j;k++)
            {
                sum+=arr[k];
            }
            if(sum>maxsum)
            {
                maxsum=sum;
            }
        }
    }
    System.out.println(maxsum);
   }
   //prefix sum
   public static void prefixsum()
   {
    int a[]={2,3,4,5,6,7,8};
    int maxsum=Integer.MIN_VALUE;
    int prefix[]=new int[a.length];
    int n=a.length;
    prefix[0]=a[0];
    for(int i=1;i<n;i++)
    {
        prefix[i]=prefix[i-1]+a[i];
    }
    for(int i=0;i<n;i++)
    {
        int start=i;
        for(int j=i;j<n;j++)
        {
            int end=j;
            int currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
        if(maxsum<currsum)
        {
            maxsum=currsum;
        }
        }
       
    }
    System.out.println(maxsum);
   }
   //kadanes algorithm
   public static void kadanes()
   {
    int a[]={2,5,6,8,9,10};
    int currsum=Integer.MIN_VALUE;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++)
    {
        currsum=Math.max(a[i],currsum+a[i]);
        maxsum=Math.max(maxsum, currsum);
    }
    System.out.println(maxsum);

   }
    public static void main(String[] args) {
        //charArray();
        //sizeofanarray();
       // linearsearch();
       //largestinarray();
       //System.out.println(binarysearch());
       //reverseanarray();
       //pairsinanarray();
       //subarrays();
       //maxsum();
       //prefixsum();
       kadanes();
    }
}
