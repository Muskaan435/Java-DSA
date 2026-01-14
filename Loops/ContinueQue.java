import java.util.*;
public class ContinueQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int number = sc.nextInt();
            if(number == 0){
                System.out.println("loop exit");
                break;
            }
            if(number % 10 ==0){
                continue;
            }
            System.out.println("Your number was : "+number);
        }while(true);
        sc.close();
    }
}
