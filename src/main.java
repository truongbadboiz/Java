import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Nhập số lượng phần tử
    System.out.print("Nhập số lượng phần tử trong mảng: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];

    // Nhập mảng
    System.out.println("Nhập các phần tử của mảng:");
    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }

    // Nhập phần tử cần tìm
    System.out.print("Nhập số cần tìm: ");
    int target = scanner.nextInt();

    // Hiển thị menu lựa chọn phương pháp tìm kiếm
    System.out.println("\nChọn phương pháp tìm kiếm:");
    System.out.println("1. Tìm kiếm tuần tự");
    System.out.println("2. Tìm kiếm nhị phân");
    System.out.print("Nhập lựa chọn của bạn: ");
    int choice = scanner.nextInt();

    int result = -1;

    switch (choice) {
        case 1:
            // Gọi tìm kiếm tuần tự
            result = SearchAlgorithms.linearSearch(arr, target);
            break;
        case 2:
            // Sắp xếp mảng trước khi dùng tìm kiếm nhị phân
            Arrays.sort(arr);
            System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
            result = binarySearch(arr, target);
            break;
        default:
            System.out.println("Lựa chọn không hợp lệ.");
            return;
    }

    // Hiển thị kết quả tìm kiếm
    if (result != -1)
        System.out.println("Phần tử " + target + " được tìm thấy tại vị trí: " + result);
    else
        System.out.println("Không tìm thấy phần tử " + target + " trong mảng.");

    scanner.close();
}
