import java.util.*;
public class NumHalfDiamond
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt();
        int space=2*n-3;
        int star=1;
        for(int i =1;i<=n; i++)
        {   int val=1;
            for(int j=1; j<=star; j++)
            {
                System.out.print(val+ "\t");
                val++;
            }
           
            for(int k=1; k<=space; k++)
            {
                System.out.print("\t");
            }
            if(i==n)
            {
                star--;
                val--;
            }
            for(int j=1; j<=star; j++)
            {   val--;
                System.out.print(val+ "\t");
            }
            star++;
            space-=2;
            System.out.println();
        }
        
    
        
    }
}
         