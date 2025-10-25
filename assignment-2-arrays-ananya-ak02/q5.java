import java.util.*;
class SpecialMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int choice=sc.nextInt();
        if(choice==1){ 
            int[] diag=new int[n];
            for(int i=0;i<n;i++) diag[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j) System.out.print(diag[i]+" ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }
        else if(choice==2){ 
            int size=3*n-2;
            int[] tri=new int[size];
            for(int i=0;i<size;i++) tri[i]=sc.nextInt();
            int k=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(Math.abs(i-j)<=1) System.out.print(tri[k++]+" ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }
        else if(choice==3){ 
            int size=n*(n+1)/2;
            int[] lower=new int[size];
            for(int i=0;i<size;i++) lower[i]=sc.nextInt();
            int k=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i>=j) System.out.print(lower[k++]+" ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }
        else if(choice==4){ 
            int size=n*(n+1)/2;
            int[] upper=new int[size];
            for(int i=0;i<size;i++) upper[i]=sc.nextInt();
            int k=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i<=j) System.out.print(upper[k++]+" ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }
        else if(choice==5){ 
            int size=n*(n+1)/2;
            int[] sym=new int[size];
            for(int i=0;i<size;i++) sym[i]=sc.nextInt();
            int k=0;
            int[][] mat=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++) mat[i][j]=mat[j][i]=sym[k++];
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) System.out.print(mat[i][j]+" ");
                System.out.println();
            }
        }
    }
}
