import java.util.*;
//Question: input the side of a square. You have to output the area of the square
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Arae of square is : "+area);
        sc.close();
    }
}
