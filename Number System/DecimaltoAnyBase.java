import java.util.*;
public class DecimaltoAnyBase
{
    public static int baseCon(int n, int b)
    {
        int rv=0;
        int p=1;
        while(n>0)
        {
            int dig=n%b;
            n=n/b;
            
            rv+=dig*p;
            p=p*10;
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
         