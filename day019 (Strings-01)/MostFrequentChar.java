// find the most occuring character if more than one occurs the same then return the lexographically smaller

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s= in.next();

    }
        // method 1: brute force TC: O(n^2)
    public static char mostFrequent(String s){
        int maxCount=-1;
        char maxChar=s.charAt(0);
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int count=1;                  
            for(int j=i+1;j<s.length();j++){
                if(ch==s.charAt(j))
                    count++;
            }
            if(count>maxCount){
                maxCount=count;
                maxChar= ch;
            }
            else if(count==maxCount && ch<maxChar)
                maxChar = s.charAt(i);
        }
        return maxChar;
    }
}
