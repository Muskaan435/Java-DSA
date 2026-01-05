import java.util.*;
public class Itc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your income : ");
        long income = sc.nextLong();
        sc.close();
        if(income < 500000){
            System.out.println("0% tax");
        }
        else if(income > 500000 && income <= 1000000){
            System.out.println("20% tax");
        }
        else{
            System.out.println("30% tax");
        }
    }
}
