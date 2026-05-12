package FunctionsAndMethods;

public class primefunc {
    public static boolean prime(int n){

        if(n ==2){
            return true;
        }

        for(int i = 2; i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    } 

    public static boolean prime2(int n){
        if(n == 2){
            return false;
        }

        for(int i = 2; i< Math.sqrt(n);i++){
            if( n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean primeinRange(int n){
        for(int i =2; i<n; i++){
            if(prime(i)){
                System.out.print(i + "  ");
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primeinRange(37));

    }
} 
