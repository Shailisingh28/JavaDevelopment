public class sortedarrayusingrecur {
    public static boolean sortedarrayusingrecur(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1])
            return false;
        return arr[i] < arr[i + 1] && sortedarrayusingrecur(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 8, 6 };
        System.out.println(sortedarrayusingrecur(arr, 0));
    }
}
