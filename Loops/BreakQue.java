import java.util.*;
public class BreakQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //do while logic

        do{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if((num % 10)==0){
                break;
            }
            System.out.println(num);
        }while(true);

        // while logic
        // while (true) {
        //     System.out.print("Enter a number : ");
        //     int a = sc.nextInt();
        //     if((a % 10)== 0){
        //         break;
        //     }
        //     System.out.println(a);
        // }
        sc.close();
    }
}
