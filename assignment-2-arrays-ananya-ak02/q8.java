import java.util.*;
class DistinctElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        for(int x:arr) s.add(x);
        System.out.println(s.size());
    }
}

