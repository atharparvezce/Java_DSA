import java.util.*;
public class FibonacciNumber
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     int first=0;
     int second=1;
     
     for(int i=0;i<=t;i++)
     {
        System.out.println(first);
        int third=first+second;
        first=second;
        second=third;
    
     }
    
     
    
    }
}
         