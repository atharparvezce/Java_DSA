import java.util.*;
public class ReverseANumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
           int result=n%10;
           n=n/10;
           System.out.println(result);
        }
      
    }
    
     
    
}
         