import java.util.Scanner;

class CharStack {
    char arr[];
    int top, size;

    CharStack(int n) {
        size = n;
        arr = new char[size];
        top = -1;
    }

    void push(char c) {
        if (top < size - 1) arr[++top] = c;
    }

    char pop() {
        if (top == -1) return '\0';
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        CharStack s = new CharStack(str.length());
        for (int i = 0; i < str.length(); i++) s.push(str.charAt(i));
        String rev = "";
        while (!s.isEmpty()) rev += s.pop();
        System.out.println(rev);
    }
}

