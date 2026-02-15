public class insta2 {
    public static int remove(int arr[]) {
        if (arr.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 4, 7 };
        System.out.println(remove(arr));
    }
}
