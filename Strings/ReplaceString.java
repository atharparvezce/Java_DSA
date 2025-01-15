package Strings;

import java.util.*;

public class ReplaceString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) == 'e') {
                str2 += 'i';
            } else if (str1.charAt(i) == 'E') {
                str2 += 'I';
            } else {
                str2 += str1.charAt(i);
            }

        }
        System.out.println(str2);
    }
}
