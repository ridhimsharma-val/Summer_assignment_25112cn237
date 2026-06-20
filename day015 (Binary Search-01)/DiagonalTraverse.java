// Leetcode-498

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[] res=diagonalTraverse(arr);
        for(int ele:res)
            System.out.print(ele+" ");
    }
    public static int[] diagonalTraverse(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int[] res= new int[m*n];
        int d= m+n-1;          // number of diagonals
        int k=0;
        for(int i=0;i<d;i++){

            if(i%2==0){       // for even diagonal
                // even digaonal ka first ele ke liye arr ka index ye rhega
                int x= Math.min(i,m-1);   // jab i large ho jaega then m-1 lenge , like for i=4, we will take 3-1=2
                int y=i-x;
                while(x>=0 && y<n){
                    res[k]=arr[x][y];
                    k++;
                    x--;
                    y++;
                }        
            }
            
            else{       // for odd diagonal
                int y=Math.min(i,n-1);
                int x= i-y;
                while(y>=0 && x<m){
                    res[k]=arr[x][y];
                    k++;
                    x++;
                    y--;
                }   
            }
        }
        return res;
    }
}
