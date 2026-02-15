public class findnowithevennodigits {
    public static int findnowithevennodigits(int arr[]) {
        int count = 0;
        for (int i : arr) {
            int digits = (int) Math.log10(i) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 355, 2, 6, 7896 };
        System.out.println(findnowithevennodigits(arr));
    }
}
