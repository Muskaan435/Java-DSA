import java.util.*;;
public class rev {
    //print reverse of number given by user(i.e. generalize code)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to reverse : ");
        int n = sc.nextInt();
        sc.close();
        int reverse = 0;
        while (n>0) {
            int lastdigit = n%10;
            reverse = (reverse*10)+lastdigit;
            n=n/10;            
        }

        System.out.println("Reverse is : "+reverse);
        
        //print directly
        // while(n>0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit +" ");
        //     n=n/10;
        // }
    }
}
