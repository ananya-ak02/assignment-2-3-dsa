import java.util.Scanner;

public class a2q6 {
    static void print(int[][] tr, int n) {
        for (int i = 0; i <= n; i++) //metadata
            System.out.println(tr[i][0] + " " + tr[i][1] + " " + tr[i][2]);
    }

    static int[][] transpose(int[][] tr) {
        int r = tr[0][0], c = tr[0][1], n = tr[0][2];
        int[][] t = new int[n+1][3];
        t[0][0] = c; t[0][1] = r; t[0][2] = n; //interchanging rwo col
        int k = 1; //1 as metadata is 0
        for (int col = 0; col < c; col++) {
            for (int i = 1; i <= n; i++) {
                if (tr[i][1] == col) {
                    t[k][0] = tr[i][1];
                    t[k][1] = tr[i][0];
                    t[k][2] = tr[i][2];
                    k++;
                }
            }
        }
        return t;
    }

    static int[][] add(int[][] a, int[][] b) {
        if (a[0][0] != b[0][0] || a[0][1] != b[0][1]) return null;
        int n1 = a[0][2], n2 = b[0][2]; //non 0 count
        int[][] res = new int[n1+n2+1][3];
        res[0][0] = a[0][0]; res[0][1] = a[0][1];
        int i=1,j=1,k=1;
        while(i<=n1 && j<=n2) {
            if (a[i][0] < b[j][0] || (a[i][0]==b[j][0] && a[i][1] < b[j][1])) res[k++] = a[i++];
            else if (b[j][0] < a[i][0] || (a[i][0]==b[j][0] && b[j][1] < a[i][1])) res[k++] = b[j++];
            else {
                res[k][0]=a[i][0]; res[k][1]=a[i][1]; res[k][2]=a[i][2]+b[j][2];
                i++; j++; k++;
            }
        }
        while(i<=n1) res[k++] = a[i++];
        while(j<=n2) res[k++] = b[j++];
        res[0][2]=k-1;
        return res;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        if (a[0][1] != b[0][0]) return null;
        int r = a[0][0], c = b[0][1];
        int[][] temp = new int[1000][3];
        int k=1;
        for (int i=1;i<=a[0][2];i++) {
            for (int j=1;j<=b[0][2];j++) {
                if (a[i][1]==b[j][0]) {
                    int row=a[i][0], col=b[j][1], val=a[i][2]*b[j][2];
                    boolean found=false;
                    for (int x=1;x<k;x++) {
                        if (temp[x][0]==row && temp[x][1]==col) { //check ki row col wala path pehle se to ni h
                            temp[x][2]+=val; //duplicate h toh just add the value
                            found=true; break;
                        }
                    }
                    if (!found) {
                        temp[k][0]=row; temp[k][1]=col; temp[k][2]=val;
                        k++;
                    }
                }
            }
        }
        temp[0][0]=r; temp[0][1]=c; temp[0][2]=k-1;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
        int[][] a = new int[n+1][3];
        a[0][0]=r; a[0][1]=c; a[0][2]=n;
        for (int i=1;i<=n;i++) { a[i][0]=sc.nextInt(); a[i][1]=sc.nextInt(); a[i][2]=sc.nextInt(); }
        int r2 = sc.nextInt(), c2 = sc.nextInt(), n2 = sc.nextInt();
        int[][] b = new int[n2+1][3];
        b[0][0]=r2; b[0][1]=c2; b[0][2]=n2;
        for (int i=1;i<=n2;i++) { b[i][0]=sc.nextInt(); b[i][1]=sc.nextInt(); b[i][2]=sc.nextInt(); }

        System.out.println("Transpose of A:");
        print(transpose(a), a[0][2]);
        System.out.println("Addition:");
        int[][] sum = add(a,b);
        if(sum!=null) print(sum, sum[0][2]); else System.out.println("Not possible");
        System.out.println("Multiplication:");
        int[][] prod = multiply(a,b);
        if(prod!=null) print(prod, prod[0][2]); else System.out.println("Not possible");
    }
}

