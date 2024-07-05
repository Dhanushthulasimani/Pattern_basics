public class array {
    public static void disp(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println(arr[index]);
            disp(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        disp(arr, 0);
    }
}
