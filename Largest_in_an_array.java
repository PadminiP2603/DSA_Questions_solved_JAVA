package Basics;

public class Largest_in_an_array {
    public static int largest(int[] arr) {
        int n= arr.length;
        int max= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int result = largest(arr);

        System.out.println("Largest element is: " + result);
    }
}

