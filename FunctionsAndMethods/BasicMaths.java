package FunctionsAndMethods;
import java.util.*;

public class BasicMaths {
    // Function to print the digits of a number in reverse order
    public static void printNumbers(int num){
        int n = num;

        while (n > 0){
            System.out.print(n % 10 + " ");
            n = n / 10;
        }
    }
    //Function to count the number of digits in a number
    public static int countNumbers(int num){
        int n = num;
        int count = 0;

        while (n > 0){
            n = n / 10;
            count++;
        }
        
        return count;
    }

    //Function to add the digits in number
    public static int sumOfNumbers(int num){
        int n = num;
        int sum = 0;

        while (n > 0){
            int add = n % 10;
            sum+=add;
            n = n / 10;
        }        
        return sum;
    }

    // Function to reverse a number
    public static int reverseNumbers(int num){
        int n = num;
        int reverse = 0;

        while (n > 0){
            int add = n % 10;
            reverse = (reverse*10) + add;
            n = n / 10;
        }        
        return reverse;
    }

    //Function to check number is palindrome or not
    public static boolean isPalindrome(int num){
        int n = num;
        int reverse = 0;

        while (n > 0){
            int add = n % 10;
            reverse = (reverse*10) + add;
            n = n / 10;
        }        
        return reverse == num;
    }

    // Function to check number is prime or not
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number of digits are : " +countNumbers(num));
        System.out.println("Sum of digits are : " +sumOfNumbers(num));
        System.out.println("Reverse is : " +reverseNumbers(num));
        System.out.println("Number is palindeome ? : " +isPalindrome(num));
        System.out.println("Number is prime ? : " +isPrime(num));
        printNumbers(num);
        System.out.println(num);
        sc.close();
    }
}