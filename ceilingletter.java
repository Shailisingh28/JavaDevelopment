public class ceilingletter {
    public static char ceilingletter(char arr[], char target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        if (arr.length == 1)
            return '#';
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr[left % arr.length];
    }

    public static void main(String[] args) {
        char arr[] = { 'b', 'c', 'c' };
        char target = 'c';
        System.out.println(ceilingletter(arr, target));
    }
}
