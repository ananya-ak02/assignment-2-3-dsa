import java.util.*;
class SortStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++) arr[i]=sc.next();
        Arrays.sort(arr);
        for(String x:arr) System.out.print(x+" ");
    }
}

