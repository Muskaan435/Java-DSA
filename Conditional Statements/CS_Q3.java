import java.util.*;
public class CS_Q3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to find day : ");
    int number = sc.nextInt();
    sc.close();
    int day = number%7;
    switch (day) {
        case 1:
            System.out.print("Sunday");
            break;
        case 2:
            System.out.print("Monday");
            break;
        case 3:
            System.out.print("Tuesday");
            break;
        case 4:
            System.out.print("Wednesday");
            break;
        case 5:
            System.out.print("Thursday");
            break;
        case 6:
            System.out.print("Friday");
            break;
        default:
            System.out.println("Saturday");
            break;
        }
    } 
}
