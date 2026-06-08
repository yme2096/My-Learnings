import java.util.*;
public class Strings {
    //creation of Strings
    public static void create()
    {
        char a[]={'a','b','c','d'};
        String str="abcd";
        String str1=new String("abcd");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string1");
        String s=sc.next();
        System.out.println(s);
        System.out.println("enter the second string");
        String sa=sc.nextLine();
        System.out.println(sa);

    }
    //to find the length of the string
    public static void lengthofstring()
    {
        String str="abcddaddy";
        System.out.println(str.length());
    }
    //concatenation
    public static void Stringconcatenation()
    {
        String firstname="siva";
        String lastname="kumar";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
    }
    //string charat method
    public static void Stro()
    {
        String str=new String("sivasubbu");
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    //check if palindrome or not O(n)--t.c
    public static boolean palindrome()
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        for(int i=0;i<n/2;i++)
        {
            if(a.charAt(i)!=a.charAt(n-1-i))
                return false;
        }
        return true;
    }
    //if we give an integer to check palindrome--time complexity is O(logn)
    public boolean isPalindrome(int x) {
        int nu=x;
        int rev=0;
        while(x>0)
        {
            int l=x%10;
            rev=(rev*10)+l;
            x=x/10;
            
        }
        if(rev==nu)
        return true;
        else
        return false;
    }
    /* we can covert the integer to the String and can apply the string palindroem method to solve the problem
     its time complexity is O(n)*/
     class Solution {
    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        int n = s.length();

        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i) != s.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
//finding the shortest path to reach destination
public static double shortestpath()
{
    String s="WNEENESENNN";
    int n=s.length();
    int x=0;
    int y=0;
    double path;
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)=='W')
        x--;
    else if(s.charAt(i)=='E')
        x++;
    else if(s.charAt(i)=='N')
        y++;
    else
        y--;
    }
    double x2=x*x;
    double y2=y*y;
   
path=Math.sqrt(x2+y2);
return path;
}
//string functions compare-->here == euals compare the address but .equals compares the content
public static void compare()
{
    String s1="tony";
    String s2="tony";
    String s3=new String("tony");
    if(s1==s2)
        System.out.println("equal");
    else
        System.out.println("not equal");
    if(s1==s3)
        System.out.println("equal");
    else
        System.out.println("not equal");
    if(s1.equals(s3))
        System.out.println("equal");
    else
        System.out.println("not equal");     
    
}
//substring -->manual
public static void substring()
{
    String s="sivasubbu";
    int si=0;
    int ei=7;
    String str="";
    for(int i=si;i<ei;i++)
    {
str+=s.charAt(i);
    }
    System.out.println(str);
}
//substring inbuilt function
public static void substring2()
{
    String s="sivasubbu";
    String st=s.substring(0,5);
    System.out.println(st);
}
//print largest string
public static void largeststring()
{
    String s1="aaabcd";
    String s2="aaabce";
    if(s1.compareTo(s2)<0)
    {
        System.out.println("s1 is smallest");
    }
    else
        System.out.println("s1 is largest");
}
//question on compare function
public static void compare1()
{
  String fruits[]={"apple","mango","banana"};
  String largest=fruits[0];
  int n=fruits.length;
  for(int i=1;i<n;i++)
    {
        if(largest.compareTo(fruits[i])<0)
        {
           largest=fruits[i];
        }
    }  
    System.out.println(largest);
}
//stringbuilder
public static void sbappen()
{
    StringBuilder sb =new StringBuilder("");
    for(char i='a';i<='z';i++)
    {
        sb.append(i);
    }
    System.out.println(sb);
}
//given a sentence int hat sentence convert the first letter to uppercase
public static void converttouppercase()
{
    String s="hi my name is siva";
    StringBuilder sb=new StringBuilder("");
    char ch=Character.toUpperCase(s.charAt(0));
    sb.append(ch);
    int n=s.length();

    for(int i=1;i<n;i++)
    {
    if(s.charAt(i)==' '&&i<n-1)
    {
      sb.append(s.charAt(i));
      i++;
      sb.append(Character.toUpperCase(s.charAt(i)));
    }
    else
        sb.append(s.charAt(i));
    }
    String m=sb.toString();
    System.out.println(m);
}
//string compression
public static void stringcompression()
{
    String s="aaabbcccdd";
    int n=s.length();
    String newstr="";
    
    for(int i=0;i<n;i++)
    {
        Integer count=1;
        while(i<n-1&&s.charAt(i)==s.charAt(i+1))
        {
            count++;
            i++;
        }
newstr+=s.charAt(i);
if(count>1)
    newstr+=count.toString();

    }
    System.out.println(newstr);
}
//practice questions
public static void countlowecase()
{
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            count++;
        }
    }
    System.out.println(count);
}
//what is the output of the following code
public static void compare3() {
String str = "ShradhaDidi";
String str1 = "ApnaCollege";
String str2 = "ShradhaDidi";
System.out.println(str.equals(str1) + " " + str.equals(str2));
}
//what is the output of the following code
public static void replace() {
String str = "ApnaCollege".replace("l", "");
System.out.println(str);
}
//we need to verify whether the two strings are anagrams or not
public static void anagrams()
{
    String str1="earth";
    String str2="heart";
    //convert them to the lowercases
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    //compare the string lengths are equal or not
    if(str1.length()==str2.length())
    {
      //convert them to the char arrays
      char[] c1=str1.toCharArray();
      char[] c2=str2.toCharArray();
      //now sort the both arrays to know whether they both have the same elements or not
      Arrays.sort(c1);
      Arrays.sort(c2);
      //after sorting compare both of them 
      boolean result=Arrays.equals(c1,c2);
      if(result)
        System.out.println("they both are anagrams "+str1+" "+str2);
    else
        System.out.println("they are not anagrams");

    }
    else
    {
        System.out.println("the both strings are not anagrams");
    }
}
   public static void main(String args[])
   {
    //create();
    //lengthofstring();
    //Stringconcatenation();
    //Stro();
    //System.out.println(palindrome());
     //System.out.println(shortestpath());
     //compare();
     //substring();
     //substring2();
     //largeststring();
     //compare1();
     //sbappen();
     //converttouppercase();
     //stringcompression();
     //countlowecase();
     //compare3() ;
     //replace();
     anagrams();
   } 
}
