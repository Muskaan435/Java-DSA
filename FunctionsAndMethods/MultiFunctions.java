package FunctionsAndMethods;
import java.util.*;
public class MultiFunctions {
    // function to calculate product of two numbers
    public static int product(int a, int b){
        return a*b;
    }
    // function to calculate factorial of a number
    public static int factorial(int a){
        int fact = 1;
        for(int i =2;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    // function to calculate nCr
    public static int coofficient(int n,int r){
        int nuem = factorial(n);
        int denm = factorial(r) * factorial(n-r);
        int coef = nuem/denm;
        return coef;
    }
    // function to calculate sum of two numbers
    public static int sum(int a,int b){
        return a+b;    
    }

    //function to calculate sum of three numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first element : ");
        int a = sc.nextInt();
        System.out.print("Enter second element : ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("product is : " +product(a,b));
        System.out.print(factorial(5));
        System.out.print(coofficient(7, 3));
        System.out.println(sum(10,25));
        System.out.println(sum(10,25,30));
    }
}
