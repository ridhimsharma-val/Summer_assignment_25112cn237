// leetcode 54

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result= new ArrayList<>();
        result = spiral(arr);
        System.out.println(result);
    }
    public static List<Integer> spiral(int[][] arr){
        List<Integer> res= new ArrayList<>();
        int fr=0 , fc=0 , lr=arr.length-1 , lc=arr[0].length -1;   // first,last row,column
        while(fr<=lr && fc<=lc){
            for(int j=fc;j<=lc;j++)     // add first rows
                res.add(arr[fr][j]);
            
            fr++;                     // move first row down
            if(fr>lr)                // adding can get complete before also so loop breaks to avoid repitions
                break;

            for(int i=fr;i<=lr;i++)   // add last columns
                res.add(arr[i][lc]);

            lc--;                 // move last column back
            if(fc>lc)
                break;

            for(int j=lc;j>=fc;j--)   // add last row
                res.add(arr[lr][j]);

            lr--;                       // move last row up 
            if(fr>lr)
                break;
            
            for(int i=lr;i>=fr;i--)   // add first columns
                res.add(arr[i][fc]);

            fc++;                // move first column ahead
            
        }
        return res;
    }
}
