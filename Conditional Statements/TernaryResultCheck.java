import java.util.*;
public class TernaryResultCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your marks : ");
        int marks = sc.nextInt();
        sc.close();
        String result = (marks >=33) ? "Pass" : "Fail";
        System.out.println("You are : "+result);
    }
}
