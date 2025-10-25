import java.util.*;
class DeleteVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r="";
        for(char c:s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)==-1) r+=c;
        }
        System.out.println(r);
    }
}

