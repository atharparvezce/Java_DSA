import java.util.*;
public class NumDiamond
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        
        int n =sc.nextInt();
        int space=n/2;
        int star=1;
        int val=1;
       
        for(int i =1;i<=n; i++)
        {
            for(int k=1; k<=space; k++)
            {
                System.out.print("\t");
            }
            int cval=val;
            for(int j=1; j<=star; j++)
            {
                System.out.print(cval+"\t");
                if(j<=star/2)
                {
                    cval++;
                }
                else
                {
                    cval--;
                }
        
                
            }
            if(i<=n/2)
            {
                space--;
                star+=2;
                val++;
            }
            else
            {
                space++;
                star-=2;
                val--;
            }
            System.out.println();
        }
        
    
        
    }
}
         