package Arrays;
public class Arrayprob{
    // Get the average from the array
    static int average(int [] arr){
        int sum = 0;
        int diviser = arr.length;
        for(int i : arr){
            sum = sum + i ;
        }
        return sum/diviser;
    }
    // multiply each element of array with 10
    static int[] multiplyTen(int[] arr){
        for(int i = 0; i< arr.length; i++){
            arr[i] = arr[i] * 10;
        }
        return arr;
    }

    // search an element in an array

    static int linearSearch(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    // find maximum in an array
    static int maximum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    // calculate sum of positive and negative numbers
    static int[] negpossum(int arr[]){
        int posSum = 0;
        int negSum = 0;
        for(int i : arr){
            if(i > 0){
                posSum +=i;
            }else{
                negSum +=i;
            }
        }
        return new int[]{negSum,posSum};
    }

    static int unsorted(int arr[]){
        for(int i = 0; i<arr.length;i++) {
            if(arr[i] < arr[i+1]){
            }
            else{
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arrs[] = {10,20,30,40,50,-25,60,-10,70,80,90,100};
        System.out.println(unsorted(arrs));
        
    }
}
