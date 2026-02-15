public class cycesort_R1 {
    public static int find(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i];
            if (correct_index != arr.length && arr[i] != arr[correct_index]) {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i)
                return i;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int arr[] = { 0 };
        System.out.println(find(arr));
    }
}
