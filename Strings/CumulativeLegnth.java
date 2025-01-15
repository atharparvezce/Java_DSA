package Strings;

import java.util.*;

public class CumulativeLegnth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        int result = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.next();

            result += arr[i].length();

        }

        System.out.println(result);
    }
}