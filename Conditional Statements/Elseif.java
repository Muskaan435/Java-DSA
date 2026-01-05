public class Elseif {
    public static void main(String[] args) {
        int age = 22;

        if(age >= 18){
            System.out.println("Adult : can vote and drive");
        }
        else if(age <= 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
