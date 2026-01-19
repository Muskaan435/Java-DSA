package Patterns;
import java.util.*;
//inverted star pattern

public class Inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int rows = sc.nextInt();
        sc.close();
        for(int i = rows; i>=0;i--){
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
