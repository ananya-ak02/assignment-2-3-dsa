import java.util.Scanner;

class CharStack2 {
    char arr[];
    int top, size;

    CharStack2(int n) {
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

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        CharStack2 s = new CharStack2(expr.length());
        boolean ok = true;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (s.isEmpty()) { ok = false; break; }
                char p = s.pop();
                if ((c == ')' && p != '(') || (c == '}' && p != '{') || (c == ']' && p != '[')) {
                    ok = false; break;
                }
            }
        }
        if (!s.isEmpty()) ok = false;
        if (ok) System.out.println("Balanced");
        else System.out.println("Not Balanced");
    }
}

