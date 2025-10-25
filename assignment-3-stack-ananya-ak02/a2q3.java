import java.util.Scanner;

public class a2q3 {
    static int missingLinear(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) 
            return i + 1;
        }
        return n + 1;
    }

    static int missingBinary(int arr[], int n) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == mid + 1) l = mid + 1;
            else r = mid - 1;
        }
        return l + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(missingLinear(arr, n));
        System.out.println(missingBinary(arr, n));
    }
}

