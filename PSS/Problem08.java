package PSS;
public class Problem08 {
    public static boolean binarySearch(int[] arr, int n) {
        return binarySearch(arr, n, 0, arr.length - 1);
    }

    private static boolean binarySearch(int[] arr, int n, int low, int high) {
        if (low > high) {
            return false;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == n) {
            return true;
        } else if (arr[mid] < n) {
            return binarySearch(arr, n, mid + 1, high);
        } else {
            return binarySearch(arr, n, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;

        if (binarySearch(sortedArray, target)) {
            System.out.println("Number " + target + " exists in the array.");
        } else {
            System.out.println("Number " + target + " does not exist in the array.");
        }
    }
}
