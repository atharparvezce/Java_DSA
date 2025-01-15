
package StringBuilder;
import java.util.*;


public class StringsBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaration of StringBuilder - Three ways

        StringBuilder strb1 = new StringBuilder(sc.nextLine());

        StringBuilder strb2 = new StringBuilder("Athar Parvez");

        String str = sc.nextLine();
        StringBuilder strb3 = new StringBuilder(str);

        System.out.println(strb1);
        System.out.println(strb2);
        System.out.println(strb3);

        // Get a character from a index

        System.out.println(strb2.charAt(3));

        // Set or replace a character

        strb2.setCharAt(5, '@');
        System.out.println(strb2);

        // insert or add a character

        strb2.insert(0, 'M');
        System.out.println(strb2);

        // delete a character

        strb2.delete(6, 13);
        System.out.println(strb2);

        // Appaend a character - Append means to add something at the end

        strb2.append(" Amrohavi");
        System.out.println(strb2);

        // print length of StringBuilder

        System.out.println(strb2.length());

    }

}
