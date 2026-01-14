import java.util.*;
public class L_Que1 {
    //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int num;
        int oddSum = 0;
        int evenSum = 0;

        do{
            System.out.print("Enter Number : ");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }

            System.out.print("enter 1 to continue and 0 to exit : ");
            choice = sc.nextInt();
                        
        }while(choice == 1);
        sc.close();

        System.out.println("Sum of Even numbers are :  "+evenSum);
        System.out.println("Sum of Odd numbers are :  "+oddSum);
    }
}
