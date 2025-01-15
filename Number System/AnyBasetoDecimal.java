import java.util.*;
public class AnyBasetoDecimal
{
    public static int baseCon(int n, int b)
    {
        int rv=0;
        int p=1;
        while(n>0)
        {
            int digit=n%10;
            n=n/10;
            rv+=digit*p;
            p=p*b;
        }
        return rv;
    }
      
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int b=sc.nextInt();
        int result=baseCon(n,b);
        System.out.println(n+" In "+ b + " = "+result);
    }
}
         