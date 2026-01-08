import java.util.*;
//Write a Java program to get a number from the user and print whether it is positive or negative
public class CS_Q1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    sc.close();
    if(num >= 0){
        System.out.println("positive number");
    }else{
        System.out.println("Negative number");
    }
   } 
}
