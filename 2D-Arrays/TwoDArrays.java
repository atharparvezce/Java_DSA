import java.util.*;

public class TwoDArrays {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] two2arr = new int[rows][cols];

        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                two2arr[i][j] = sc.nextInt();
            
            }

        }

        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                System.out.print(two2arr[i][j] + " ");
            
            }
            System.out.println();

        }
    }
}