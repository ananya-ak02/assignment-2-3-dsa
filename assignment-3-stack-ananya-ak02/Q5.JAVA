import java.util.Scanner;

class IntStack {
    int arr[];
    int top, size;

    IntStack(int n) {
        size = n;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top < size - 1) arr[++top] = x;
    }

    int pop() {
        if (top == -1) return -1;
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Q5 {
    static int evalPostfix(String exp) {
        IntStack s = new IntStack(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                s.push(c - '0');
            } else {
                int val2 = s.pop();
                int val1 = s.pop();
                switch (c) {
                    case '+': s.push(val1 + val2); break;
                    case '-': s.push(val1 - val2); break;
                    case '*': s.push(val1 * val2); break;
                    case '/': s.push(val1 / val2); break;
                }
            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println(evalPostfix(exp));
    }
}
