import java.util.*;
//print sum of natural number till n
public class SumLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int counter = 1;
        while(counter <=n){
            sum += counter;
            counter++;
        }
        System.out.println("sum is "+sum);
    }
}
