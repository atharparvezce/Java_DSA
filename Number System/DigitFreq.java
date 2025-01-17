import java.util.*;
public class DigitFreq
{
    public static int digitfreq(int n, int d)
    {
        int rv=0;
        int digits=0;
        while(n>0)
        {
            int dig=n%10;
            n=n/10;
            if(dig==d)
            {
                rv++;
            }
        }
        return rv;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int d=sc.nextInt();
        
        int result=digitfreq(n,d);
        System.out.println(d+" Came in "+n+" "+result+"times");
    }
}
         