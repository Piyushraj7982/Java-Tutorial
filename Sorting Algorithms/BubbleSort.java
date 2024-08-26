// public class BubbleSort {
//     public static void main(String[] args) {
//         int[] arr = { 36, 19, 29, 12, 5 };
//         int temp = 0;

//         for (int i = 0; i < arr.length; i++) { // no of round
//             int flag = 0;
//             for (int j = 0; j < arr.length - 1 - i; j++) { // no of swap
//                 if (arr[j] > arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     flag = 1;
//                 }

//             }
//             if (flag == 0) {
//                 break;
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }
// }

public class BubbleSort {
    public static void main(String[] args) {
        String[] arr = { "pk", "ck", "dk", "kk", "rk" };
        String temp;

        for (int i = 0; i < arr.length; i++) { // no of round
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) { // no of swap
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }

            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
