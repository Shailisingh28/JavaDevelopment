public class SubarraysWithSum {
    public static int SubarraysWithSum(int arr[], int goal) {
        int ans = 0;
        ans = SubarraysWithgoal(arr, goal) - SubarraysWithgoal(arr, goal - 1);
        return ans;
    }

    public static int SubarraysWithgoal(int arr[], int goal) {
        int left = 0;
        int count = 0;
        int sum = 0;
        if (goal < 0)
            return 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > goal) {
                sum = sum - arr[left];
                left++;
            }
            count += i - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 0 };
        int goal = 0;
        System.out.println(SubarraysWithSum(arr, goal));
    }
}
