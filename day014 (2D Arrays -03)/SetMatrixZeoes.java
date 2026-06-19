//Leetcode-73 (if an element is zero set its entire row and column to zero)

public class SetMatrixZeoes {
    public static void main(String[] args) {
        int [][] arr={{0,1,2,0},{3,4,5,2},{1,3,1,2}};
        setZeroes(arr);
        for(int[] row:arr){
            for(int ele:row)
                System.out.print(ele+" ");
            System.out.println();
        }
    }
    // method 1 (brute force)
    // complexity: (for copying to brr O(m*n), for zero traversing O(m+n))
    // worst case complexity O(m*n*(m+n))
    // space O(m*n)

/*    public static int[][] setZeroes(int[][] arr){
        int m=arr.length;
        int n= arr[0].length;
        int[][] brr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                brr[i][j]=arr[i][j];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    for(int x=0;x<m;x++)
                        brr[x][j]=0;
                    for(int y=0;y<n;y++)
                        brr[i][y]=0;
                }
            }
        }
        return brr;
        }
*/

    // method 2 (row column approach)
    // complexity: O(m*n)
    //space:O(m+n) 

/*    public static void setZeroes(int[][] arr){
        int m= arr.length;
        int n= arr[0].length;
        boolean[] rows = new boolean[m];   // made boolean array for rows
        boolean[] columns = new boolean[n]; // for cols
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){     // if zero found
                    rows[i]=true;    // set that rowth idx to true in bool array(by default all ele in boolean are false)
                    columns[j]=true;  // set that col idx to true 
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i] || columns[j])
                    arr[i][j]=0;
            }
        }
    }
*/

    //method 3 (optimal solution)
    //complexity :  O(m*n)
    //space: O(1)

    public static void setZeroes(int[][] arr){
        int m= arr.length;
        int n= arr[0].length;
        boolean firstrow=false;
        boolean firstcol=false;
        
        for(int j=0;j<n;j++){    // first row me check kiya koi zero ele(row me traverse ke liye row const)
            if(arr[0][j]==0){
                firstrow=true;
                break;
            }
        }
        for(int i=0;i<m;i++){   // first column me check kiya koi zero ele (column me traverse ke liye col const)
            if(arr[i][0]==0){
                firstcol=true;
                break;
            }
        }

        for(int i=1;i<m;i++){     // first row and column chhod kr inner matrix pr check kiye zero ele
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){   // if zero found
                    arr[i][0]=0;   // uss row ka first ele zero mark krdo
                    arr[0][j]=0;  // uss col ka first element zero mark krdo
                }
            }
        }
        for(int i=1;i<m;i++){     // inner matrix me row and col zero kiye
            for(int j=1;j<n;j++){
                if(arr[i][0]==0 || arr[0][j]==0)
                    arr[i][j]=0;
            }
        }
        if(firstrow){         // if first row me zero ele mila tha then make complete row zero
            for(int j=0;j<n;j++)
                arr[0][j]=0;
        }
        if(firstcol){       // if first column me zero mila tha then make complete col zero
            for(int i=0;i<m;i++)
                arr[i][0]=0;
        }
    }
}
