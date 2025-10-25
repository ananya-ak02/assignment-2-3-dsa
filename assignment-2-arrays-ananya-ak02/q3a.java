import java.util.*;
class MissingLinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++) arr[i]=sc.nextInt();
        int sum=n*(n+1)/2,s=0;
        for(int x:arr) s+=x;
        System.out.println(sum-s);
        sc.close();
    }
}

