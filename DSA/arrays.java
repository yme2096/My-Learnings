public class arrays
{
    //1
    public static boolean array(int a[])
    {
        int n=a.length;
       
        for(int i=0;i<n;i++)
            {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                  return true;
                }
            }

            }
            return false; 
    }
    //buy and sell stocks
    public static int buyandsell()
    {
        int prices[]={7,6,4,3,1};
        int n=prices.length;
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++)
        {
            if(buyprice<prices[i])
            {
                  int profit=prices[i]-buyprice;
                  maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=prices[i];
            }
        }
          return maxprofit;
    }
    //trapped rainwater
    public static void trappedrainwater()
    {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
    
    }
    public static void main(String args[])
    {
//int a[]={1,1,1,3,3,4,3,2,4,2};
//System.out.println(array(a));
//buyandsell();
System.out.println(buyandsell());
    }
}