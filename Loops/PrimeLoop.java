import java.util.*;
public class PrimeLoop {
    //check the givem number is prime or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = true;

        for(int i = 2 ; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                isPrime =false;
                break;
            } 
        }
        if(isPrime == true){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }    
}
