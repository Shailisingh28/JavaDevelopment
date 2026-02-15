public class findDuplicate {
    public static int findDuplicate(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 3, 3 };
        System.out.println(findDuplicate(arr));
    }
}
