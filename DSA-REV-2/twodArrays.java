import java.util.*;

public class twodArrays {

 static class Info
    {
      int ind;
      int jnd;
      
      Info(int ind,int jnd)
      {
       this.ind=ind;
       this.jnd=jnd;
      }
    }

    //linear seach in 2d arrays
    public static Info linearsearch()
    {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(key==a[i][j])
                {
                    return new Info(i,j);
                }
            }
        }
        return null;
    }

    //print spiral matrix
    public static void spiralmatrix(int a[][])
    {
        int n=a.length;
        int m=a[0].length;
       int startrow=0;
       int startcol=0;
       int endcol=m-1;
       int endrow=n-1;
       while(startrow<=endrow&&startcol<=endcol)
       {
        for(int i=0;i<=endcol;i++)
        {
            System.out.print(a[startrow][i]+" ");
        }
        for(int j=startrow+1;j<=endrow;j++)
        {
            System.out.println(a[j][endcol]);
        }
        for(int i=endcol-1;i>=0;i--)
        {
            System.out.println(a[endrow][i]);
        }
        for(int j=endrow-1;j>=0;j--)
        {
            System.out.println(a[j][startcol]);
        }
        startrow++;
        startcol++;
        endrow--;
        endcol--;
       }
    }
    public static void main(String args[])
    {
    int[][] a = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12},
    {13, 14, 15, 16}
};
    spiralmatrix(a);
    }
}
