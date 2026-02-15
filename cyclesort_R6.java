public class cyclesort_R6 {
    public static int positive(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return arr.length + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 9, 11, 12 };
        System.out.println(positive(arr));
    }
}
