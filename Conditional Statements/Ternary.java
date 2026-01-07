import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.close();
        String type = (num%2==0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
