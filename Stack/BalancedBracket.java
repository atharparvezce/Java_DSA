import java.util.*;

public class BalancedBracket
{
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        Stack<Character> st = new Stack<Character>();
        
        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            
                else if(ch == ')')
                {
                    boolean rs = handlingClosing(st , '(');
                    if(rs == false)
                    {
                        System.out.println(false);
                        return;
                    }
               
                }
                else if(ch == '}')
                {
                    boolean rs = handlingClosing(st , '{');
                    if(rs == false)
                    {
                        System.out.println(false);
                         return;
                    }
                }
                else if(ch == ']')
                {
                    boolean rs = handlingClosing(st , '['); 
                    if(rs == false)
                    {    
                        System.out.println(false);
                        return;
                    }
                }
        }
        if(st.size() == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        
    }
   public static boolean handlingClosing(Stack<Character> st , char chr)
   {
        if(st.size()==0)
        {
            return false ;
        }
            else if(st.peek() != chr)
            {
                return false; 
            }
        else
        {
            st.pop();
            return true;
        }
    }
}