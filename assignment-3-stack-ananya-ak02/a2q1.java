import java.util.Scanner;

public class a2q1
 {
    static int binarySearch(int arr[], int n, int key) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int key = sc.nextInt();
        int res = binarySearch(arr, n, key);
        if (res == -1) 
        System.out.println("Not Found");
        else System.out.println
        ("Found at index " + res);
    }
}

