import java.util.*;
//Question 5: Total Marks & Percentage of 3 sujects
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of all 3 subjects : ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int result = s1 + s2 + s3;
        double total = (result / 300.0)*100;
        System.out.println("your percentage is : " +total +"%");
        sc.close();
    }
}
