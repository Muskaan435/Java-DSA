import java.util.*;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter Operator : ");
        char c = sc.next().charAt(0);
        sc.close();
        System.out.print("Answer is : ");
        switch (c) {
            case '+':
                System.out.print(a + b);
                break;
            case '-':
                System.out.print(a - b);
                break;
            case '*':
                System.out.print(a * b);
                break;
            case '/':
                System.out.print(a / b);
                break;
            case '%':
                System.out.print(a % b);
                break;
            default:
                System.out.println("Wrong Operator");
                break;
        }
    }
}
