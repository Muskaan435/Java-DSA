import java.util.*;
public class L_Que3 {
    //Write a program to print the multiplication table of a number N, entered by the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find table : ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1 ; i<=10;i++){
            System.out.println(n +" x " +i+ " = " +n*i);
        }
    }
}
