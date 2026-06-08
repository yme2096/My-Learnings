import java.util.*;
public class twoDarrays {
   public static void creation()
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int ma[][]=new int [n][m];
    
    System.out.println("enter the 2d array matrix");
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<m;j++)
     {
        ma[i][j]=sc.nextInt();
     }
    }
    System.out.println("the elements of the matrix");
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<m;j++)
     {
       System.out.print(ma[i][j]+" ");
     }
    System.out.println();
    }
   } 
   //searching for an element in a 2d matrix;
   public static boolean search(int a[][])
   {
    Scanner sc=new Scanner(System.in);
    int n=a.length;
    int m=a[0].length;
    System.out.println("enter the key element");
    int key=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(a[i][j]==key)
                return true;
        }
    }
    return false;
   }
   //spiral matrix
   public static void spiralmatrix(int a[][])
{
    int startRow = 0;
    int startCol = 0;
    int endRow = a.length - 1;
    int endCol = a[0].length - 1;

    while(startRow <= endRow && startCol <= endCol) {

        for(int j = startCol; j <= endCol; j++) {
            System.out.print(a[startRow][j] + " ");
        }

        for(int i = startRow + 1; i <= endRow; i++) {
            System.out.print(a[i][endCol] + " ");
        }

        for(int j = endCol - 1; j >= startCol; j--) {
            /*if(startRow == endRow) {
                break;
            }*/
            System.out.print(a[endRow][j] + " ");
        }

        for(int i = endRow - 1; i >= startRow + 1; i--) {
            /*if(startCol == endCol) {
                break;
            }*/
            System.out.print(a[i][startCol] + " ");
        }

        startRow++;
        startCol++;
        endRow--;
        endCol--;
    }
}
//diagonal sum-->o(n^2) code
public static int diagonalsum(int a[][])
{
    int n=a.length;
    int m=a[0].length;
    int sum=0;
 for(int i=0;i<n;i++)
 {
    for(int j=0;j<m;j++)
    {
     if(i==j)
     {
        sum+=a[i][j];
     }
    else if(i+j==n-1)
     {
        sum+=a[i][j];
     }
    }
 }
 return sum;
}
//diagoanl sum -->optimized code
public static int optimizediagonal(int a[][])
{
    int n=a.length;
    int m=a[0].length;
    int sum=0;
    for(int i=0;i<n;i++)
    {
        //primary diagonal
        sum+=a[i][i];
        //secondary diagonal
        if(i!=n-1-i)
            sum+=a[i][n-1-i];

    }
    return sum;
}
//search in sorted matrix
public static boolean sortedmatrix(int a[][],int target)
{
    int n=0;
    int m=a[0].length-1;
while(n<=a.length-1&&m>=0)
{
    if(a[n][m]==target)
    {
        return true;
    }
    else if(a[n][m]>target)
    {
        m--;
    }
    else
    {
        n++;
    }
}
return false;
}
//practice questions 
public static void print7(int a[][])
{
int n=a.length;
int m=a[0].length;
int count=0;
for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
        if(a[i][j]==7)
            count++;
    }
}
System.out.println(count);
}
//to sum the second row of the matrix
public static int sum(int n[][])
{
int a=n[0].length;
int sum=0;
int row=1;
for(int i=0;i<a;i++)
{
    sum+=n[row][i];

}
return sum;
}
//transpose of a matrix
public static void transpose(int a[][])
{
int n=a.length;
int m=a[0].length;
System.out.println("before transpose");
for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
System.out.println("after transpose");
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
System.out.print(a[j][i]+" ");
    }
    System.out.println();
}
}


    public static void main(String args[])
    {
    //creation();
    /*  int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };*/
        //System.out.println(search(a));
        //spiralmatrix(a);
        //System.out.println(diagonalsum(a));
       // System.out.println(optimizediagonal(a));
         /*int a[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target=37;
        System.out.println(sortedmatrix(a, target));*/
        int[][] a = { {4,7,8},{8,8,7} };
      //  print7(a);
        /*  int[][] n = { {1,4,9},{11,4,3},{2,2,3} };
         System.out.println(sum(n));*/
         transpose(a);

    }
}
