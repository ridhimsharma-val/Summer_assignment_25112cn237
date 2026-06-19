// Leetcode-766

public class ToeplitzMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        if(toeplitz(arr))
            System.out.print("It is a toeplitz matrix");
        else
            System.out.print("Not a toeplitz matrix");
    }
    public static boolean toeplitz(int[][] arr){
        for(int i = arr.length-1;i>0;i--){           // traversed from bottom left to avoid idx out of bound(no need to go till first row and column as nothing will be before dat)
            for(int j=arr[i].length-1;j>0;j--){
                if(arr[i][j]!=arr[i-1][j-1])        // checked every ele with upper left
                    return false;
            }
        }
        return true;
    }
}
