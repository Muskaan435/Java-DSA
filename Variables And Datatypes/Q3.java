import java.util.*;
// Question: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();
        float total = pen + pencil + eraser;
        System.out.println("Total is :"+total);
        float gst = total + (total * 0.18f);
        System.out.println("total with GST is " +gst);
    }
}
