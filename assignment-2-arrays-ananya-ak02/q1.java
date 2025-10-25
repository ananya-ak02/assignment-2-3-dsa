import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int x=sc.nextInt();
        int l=0,r=n-1,ans=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==x){ ans=m; break; }
            else if(arr[m]<x) l=m+1;
            else r=m-1;
        }
        System.out.println(ans);
    }
}
