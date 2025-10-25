import java.util.Scanner;

public class a2q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int distinct = 0;
        for (int i = 0; i < n; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) if (a[j] == a[i]) { seen = true; break; }
            if (!seen) distinct++;
        }
        System.out.println(distinct);
    }
}

