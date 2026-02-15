public class Issorted {
    public static boolean Issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] <= arr[i + 1] && Issorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        System.out.println(Issorted(arr, 0));
    }
}
