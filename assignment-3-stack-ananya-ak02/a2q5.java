import java.util.Scanner;

public class a2q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Diagonal 2. Tri-diagonal 3. Lower Triangular 4. Upper Triangular 5. Symmetric");
        int ch = sc.nextInt();
        int n = sc.nextInt();

        if (ch == 1) {
            int[] d = new int[n];
            for (int i=0;i<n;i++) d[i]=sc.nextInt();
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (i==j) System.out.print(d[i]+" ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }

        else if (ch == 2) {
            int[] t = new int[3*n-2];
            for (int i=0;i<3*n-2;i++) t[i]=sc.nextInt();
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (i==j) System.out.print(t[i]+" ");
                    else if (i-j==1) System.out.print(t[n+j]+" ");
                    else if (j-i==1) System.out.print(t[2*n-1+i]+" ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }

        else if (ch == 3) {
            int[] l = new int[n*(n+1)/2];
            for (int i=0;i<l.length;i++) l[i]=sc.nextInt();
            int idx=0;
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (i>=j) System.out.print(l[i*(i+1)/2+j]+" ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }

        else if (ch == 4) {
            int[] u = new int[n*(n+1)/2];
            for (int i=0;i<u.length;i++) u[i]=sc.nextInt();
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (i<=j) System.out.print(u[j*(j+1)/2+i]+" ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }

        else if (ch == 5) {
            int[] s = new int[n*(n+1)/2];
            for (int i=0;i<s.length;i++) s[i]=sc.nextInt();
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    if (i>=j) System.out.print(s[i*(i+1)/2+j]+" ");
                    else System.out.print(s[j*(j+1)/2+i]+" ");
                }
                System.out.println();
            }
        }
    }
}


