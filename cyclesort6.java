public class cyclesort6 {
    public static int cyclesort6(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[correct] != arr[i]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, -1, 1 };
        System.out.println(cyclesort6(arr));
    }
}
