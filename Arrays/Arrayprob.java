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
    static void reversearr(int arr[]){
        int i = 0;
        int n = arr.length;
        int j = n - 1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for(int k : arr){
            System.out.print(k +" ");
        }
    }
    static void shiftBy1(int[] arr){
        int temp = arr[arr.length -1];
        for(int i = arr.length-1; i > 0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for(int k: arr){
            System.out.print(k +" ");
        }

    }
    public static void main(String[] args) {
        int arrs[] = {1,2,3,4,5};
        shiftBy1(arrs);
        
    }

}
