import java.util.Scanner;

class Stack {
    int arr[];
    int top;
    int size;

    Stack(int n) {
        size = n;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack is Full");
        } else {
            arr[++top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack(5);
        while (true) {
            System.out.println("1.Push 2.Pop 3.Peek 4.Display 5.isEmpty 6.isFull 7.Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                int x = sc.nextInt();
                s.push(x);
            } else if (ch == 2) {
                System.out.println("Popped: " + s.pop());
            } else if (ch == 3) {
                System.out.println("Top: " + s.peek());
            } else if (ch == 4) {
                s.display();
            } else if (ch == 5) {
                System.out.println(s.isEmpty());
            } else if (ch == 6) {
                System.out.println(s.isFull());
            } else {
                break;
            }
        }
    }
}
