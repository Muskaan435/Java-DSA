package Patterns;
import java.util.*;
//Character half pyramid  pattern
public class Charptrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of lines : ");
        int n = sc.nextInt();
        char ch = 'A';
        sc.close();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}
