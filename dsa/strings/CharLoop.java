import java.util.*;

public class CharLoop {
    public static void main(String[] args) {
        System.out.println("give string input: ");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            System.out.println(i + " " + s.charAt(i));
        }
    }
}
