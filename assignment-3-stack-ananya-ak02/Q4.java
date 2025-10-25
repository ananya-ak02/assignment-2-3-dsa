import java.util.Scanner;

class CharStack3 {
    char arr[];
    int top, size;

    CharStack3(int n) {
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

    char peek() {
        if (top == -1) return '\0';
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Q4 {
    static int prec(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        if (c == '^') return 3;
        return -1;
    }

    static String infixToPostfix(String exp) {
        CharStack3 s = new CharStack3(exp.length());
        String res = "";
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                res += c;
            } else if (c == '(') {
                s.push(c);
            } else if (c == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    res += s.pop();
                }
                if (!s.isEmpty() && s.peek() == '(') s.pop();
            } else {
                while (!s.isEmpty() && prec(c) <= prec(s.peek())) {
                    res += s.pop();
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()) res += s.pop();
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println(infixToPostfix(exp));
        sc.close();
    }
}
