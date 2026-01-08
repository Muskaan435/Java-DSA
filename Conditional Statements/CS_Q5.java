import java.util.*;
public class CS_Q5 {
    //Write a Java program to input total amount and print:
        //1. "20% discount" if amount ≥ 5000
        //2. "10% discount" if amount ≥ 2000
        //3. "No discount" otherwise
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount : ");
        int amount = sc.nextInt();
        sc.close();
        if(amount >=5000){
            System.out.println("Total discount is : " +(0.20*amount));
        }else if(amount >=2000){
            System.out.println("Total discount is : "+(0.10*amount));
        }else{
            System.out.println("No Discount");
        }
    }
}
