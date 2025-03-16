import java.util.Arrays;
import java.util.Scanner;

public class SearchAlgorithms {
    // Hàm tìm kiếm tuần tự
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i; // Trả về vị trí tìm thấy
        }
        return -1; // Không tìm thấy
    }

    // Hàm tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid; // Trả về vị trí tìm thấy
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // Không tìm thấy
    }
}
