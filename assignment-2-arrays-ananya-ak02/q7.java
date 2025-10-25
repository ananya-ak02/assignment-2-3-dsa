import java.util.*;
class Inversions {
    static int merge(int[] arr,int l,int m,int r){
        int[] L=new int[m-l+1],R=new int[r-m];
        for(int i=0;i<L.length;i++)L[i]=arr[l+i];
        for(int j=0;j<R.length;j++)R[j]=arr[m+1+j];
        int i=0,j=0,k=l,inv=0;
        while(i<L.length&&j<R.length){
            if(L[i]<=R[j])arr[k++]=L[i++];
            else{arr[k++]=R[j++];inv+=L.length-i;}
        }
        while(i<L.length)arr[k++]=L[i++];
        while(j<R.length)arr[k++]=R[j++];
        return inv;
    }
    static int mergesort(int[] arr,int l,int r){
        if(l>=r)return 0;
        int m=(l+r)/2;
        int inv=mergesort(arr,l,m)+mergesort(arr,m+1,r);
        inv+=merge(arr,l,m,r);
        return inv;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(mergesort(arr,0,n-1));
    }
}

