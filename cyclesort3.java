public class cyclesort3 {
    public static int cyclesort3(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }
        return arr[arr.length - 1];
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 3, 3, 3 };
        System.out.println(cyclesort3(arr));
    }
}
