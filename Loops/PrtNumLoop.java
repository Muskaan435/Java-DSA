import java.util.*;
//print number till n
public class PrtNumLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int number = sc.nextInt();
        sc.close();
        int i = 1;
        while (i <=number) {
            System.out.println(i);
            i++;
        }
    }
}
