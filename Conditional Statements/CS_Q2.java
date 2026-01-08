import java.util.*;
public class CS_Q2{
    //Write a Java program so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your body temprature : "); 
       float temp = sc.nextFloat();
       sc.close();
       if(temp > 100){
        System.out.println("You have fever");
       }else{
        System.out.println("you are compleately fine");
       }
    }
}