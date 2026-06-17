import java.util.*;

public class StringBuilderDemo {
    public static void main(String[] args) {
        System.out.println("give input string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }
}
