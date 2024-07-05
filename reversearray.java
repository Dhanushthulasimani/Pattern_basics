import java.util.Scanner;

public class reversearray {
    // public static void main(String args[]) {
    // Scanner s = new Scanner(System.in);
    // {
    // int n = s.nextInt();
    // int arr[] = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = s.nextInt();
    // }
    // for (int i = n - 1; i >= 0; i--) {
    // System.out.print(arr[i] + " ");
    // }
    // }
    // }

    // -------------------METHO 2-------------------------------

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        reverse(arr, 0, n - 1);

        System.out.println(arr);

    }

}
