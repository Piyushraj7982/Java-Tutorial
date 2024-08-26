public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int num = 7;
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        // int mid = (low + high) / 2;
        while (low <= high) {
            if (arr[mid] == num) {
                System.out.println(num + " at " + mid + " index");
                break;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            // mid = (low + high) / 2;
            mid = low + (high - low) / 2;
        }
        if (low > high) {
            System.out.println("element not found");
        }

    }
}
