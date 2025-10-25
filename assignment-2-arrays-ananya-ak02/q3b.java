import java.util.*;
class MissingBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++) arr[i]=sc.nextInt();
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==m+1) l=m+1;
            else r=m-1;
        }
        System.out.println(l+1);
        sc.close();
    }
}

