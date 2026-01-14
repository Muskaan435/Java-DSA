import java.util.*;
public class BreakQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number : ");
            int a = sc.nextInt();
            if((a % 10)== 0){
                break;
            }
        }
        sc.close();
    }
}
