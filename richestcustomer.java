public class richestcustomer {
    public static int richestcustomer(int arr[][]) {
        int rich = 0;
        for (int i[] : arr) {
            int sum = 0;
            for (int j : i) {
                sum += j;
                rich = Math.max(rich, sum);
            }
        }
        return rich;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2 }, { 3, 8, 1 }, { 78, 9 }
        };
        System.out.println(richestcustomer(arr));
    }
}
