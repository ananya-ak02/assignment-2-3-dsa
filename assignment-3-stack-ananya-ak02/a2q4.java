import java.util.Scanner;

public class a2q4 {
    static String concat(String a, String b) {
        return a + b;
    }

    static String reverse(String a) {
        char c[] = a.toCharArray();
        int l = 0, r = c.length - 1;
        while (l < r) {
            char t = c[l]; c[l] = c[r]; c[r] = t;
            l++; r--;
        }
        return new String(c);
    }

    static String removeVowels(String a) {
        String res = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ("AEIOUaeiou".indexOf(c) == -1) res += c;
        }
        return res;
    }

    static void sortStrings(String arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') return (char)(c + 32);
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(concat(a, b));
        System.out.println(reverse(a));
        System.out.println(removeVowels(a));
        int n = sc.nextInt(); sc.nextLine();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLine();
        sortStrings(arr, n);
        for (String s : arr) System.out.print(s + " ");
        System.out.println();
        char c = sc.next().charAt(0);
        System.out.println(toLower(c));
    }
}

