import java.util.*;
class SparseMatrix {
    static int[][] readTriplet(Scanner sc,int nz){
        int[][] t=new int[nz][3];
        for(int i=0;i<nz;i++){
            t[i][0]=sc.nextInt();
            t[i][1]=sc.nextInt();
            t[i][2]=sc.nextInt();
        }
        return t;
    }
    static void print(int[][] t){
        for(int[] row:t) System.out.println(row[0]+" "+row[1]+" "+row[2]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){ 
            int nz=sc.nextInt();
            int[][] t=readTriplet(sc,nz);
            int[][] tr=new int[nz][3];
            for(int i=0;i<nz;i++){
                tr[i][0]=t[i][1];
                tr[i][1]=t[i][0];
                tr[i][2]=t[i][2];
            }
            print(tr);
        }
        else if(choice==2){ 
            int nz1=sc.nextInt();
            int[][] A=readTriplet(sc,nz1);
            int nz2=sc.nextInt();
            int[][] B=readTriplet(sc,nz2);
            List<int[]> res=new ArrayList<>();
            for(int[] a:A) res.add(a);
            for(int[] b:B) res.add(b);
            print(res.toArray(new int[0][]));
        }
        else if(choice==3){ 
            int nz1=sc.nextInt();
            int[][] A=readTriplet(sc,nz1);
            int nz2=sc.nextInt();
            int[][] B=readTriplet(sc,nz2);
            List<int[]> res=new ArrayList<>();
            for(int[] a:A){
                for(int[] b:B){
                    if(a[1]==b[0]) res.add(new int[]{a[0],b[1],a[2]*b[2]});
                }
            }
            print(res.toArray(new int[0][]));
        }
    }
}
