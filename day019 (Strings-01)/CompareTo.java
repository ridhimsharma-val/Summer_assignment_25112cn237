public class CompareTo {
    public static void main(String[] args) {
        String a="Harshita";
        String b="Harsh";
        System.out.println(compareTo(a,b));

    }
    public static int compareTo(String a,String b){
        int m=a.length();
        int n=b.length();
        int cond=Math.min(m, n);
        int res=0;
        int i=0;
        while(i<cond){
            if(a.charAt(i) != b.charAt(i)){
                res=a.charAt(i) - b.charAt(i);
                return res;
            }
            i++;
        }
        if(m>cond || n>cond)
            res=m-n;
        return res;
    }
}
