import java.util.*;
public class L_Que2 {
    //Write a program to find the factorial of any number entered by the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to find factorial : ");
        int num = sc.nextInt();
        sc.close();
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact *= i;
        }
        System.out.println("Factorial of "+num+ " is : "+fact);
    }
}
