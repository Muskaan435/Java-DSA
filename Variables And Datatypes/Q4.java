import java.util.*;
//Question 4: Rectangle Perimeter
public class Q4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length : ");
    int length = sc.nextInt();
    System.out.print("Enter Breath : ");
    int breath = sc.nextInt();
    int perimeter = 2 * (length + breath);
    System.out.println("Perimeter is : "+perimeter);
    sc.close();
    }
}
