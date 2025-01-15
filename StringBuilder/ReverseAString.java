
package StringBuilder;

public class ReverseAString {

    public static void main(String[] args) {

        // Two ways - one is this
        StringBuilder strb1 = new StringBuilder("Athar");

        for (int i = strb1.length() - 1; i >= 0; i--) {
            System.out.println(strb1.charAt(i));
        }

        // Another is this
        StringBuilder strb2 = new StringBuilder("Parvez");
        for (int i = 0; i <= strb1.length() / 2; i++) {
            int front = i;
            int back = strb2.length() - i - 1;

            char frontchar = strb2.charAt(front);
            char backchar = strb2.charAt(back);

            strb2.setCharAt(front, backchar);
            strb2.setCharAt(back, frontchar);

        }
        System.out.println(strb2);
    }
}