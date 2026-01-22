package FunctionsAndMethods;
import java.util.*;
public class MultiFunctions {
    public static int product(int a, int b){
        return a*b;
    }

    public static int factorial(int a){
        int fact = 1;
        for(int i =2;i<=a;i++){
            fact*=i;
        }
        return fact;
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
    }
}
