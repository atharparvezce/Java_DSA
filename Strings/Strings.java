package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // String str3 = str1 + " " + str2;
        System.out.println(str1 + " " + str2);
        System.out.println((str1 + " " + str2).length());

        // Access the character of a string

        for (int i = 0; i < (str1 + " " + str2).length(); i++) {
            System.out.println((str1 + " " + str2).charAt(i));
        }

        // Substring

        System.out.println(str1.substring(1, 2));

        // Parsing
        // int to string
        int a1 = 123;
        String str4 = Integer.toString(a1);
        System.out.println(str4);

        // string to int
        String str5 = "1235678";
        int a2 = Integer.parseInt(str5);
        System.out.println(a2);

        // compare two strings

        // Always consider this approach
        // always gives you correct result
        if (str1.equals(str2)) {
            System.out.println("Equals");

        } else {
            System.out.println("Not Equals");
        }

        // You can use below way also but it is not recommended
        // == Not giving correct result here
        if (str1 == str2) {
            System.out.println("Equals");

        } else {
            System.out.println("Not Equals");
        }

        // == Not giving correct result here also
        if (new String("Hello") == new String("Hello")) {
            System.out.println("Equals");

        } else {
            System.out.println("Not Equals");
        }
    }
}
