import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        System.out.println("give string input: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("length: " + s.length());
        System.out.println("first character: " + s.charAt(0));
        System.out.println("last character: " + s.charAt(s.length()-1));
        System.out.println("uppercase version: " + s.toUpperCase());
        System.out.println("does it contain 'a': " + s.contains("a"));
    }
}
