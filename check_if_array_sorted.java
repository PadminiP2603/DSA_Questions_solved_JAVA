package Basics;

public class check_if_array_sorted {

    public boolean isSorted(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        check_if_array_sorted obj = new check_if_array_sorted();

        boolean result = obj.isSorted(arr);

        if (result) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}