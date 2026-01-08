import java.util.*;
public class CS_Q4 {
    //Write a Java program to input battery percentage and print:
        //1."Battery full" if percentage ≥ 80
        //2."Battery okay" if percentage is between 30 and 79
        //3."Low battery" if percentage < 30
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mobile battery percentage : ");
        int battery = sc.nextInt();
        sc.close();
        if(battery >= 80){
            System.out.println("Battery full");
        }else if(battery >=30 ) {
            System.out.println("Battery is Okay");
        }else{
            System.out.println("Low Battery");
        }
    }
}
