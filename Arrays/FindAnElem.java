import java.util.*;

public class FindAnElem {
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter size of arrays");
       int n = sc.nextInt();
       int [] arr = new int[n];
       System.err.println("Now enter elements of arrays:");
       
       for(int i=0; i<arr.length; i++){
           arr[i]=sc.nextInt();
       }
       System.out.println("Enter element which you have to find:");
       int key = sc.nextInt();
       int idx=-1;
       
       for(int i=0; i<arr.length; i++){
           
           if(arr[i]==key){
               idx=i;
               System.out.println(key + " is present at " + idx + " position.");
            }
        }
        
       
   }
}