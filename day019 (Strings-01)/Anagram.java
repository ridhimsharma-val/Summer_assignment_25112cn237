//Leetcode: 242

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="talent";
        String s2="latent";
        boolean check= anagram(s1,s2);
        if(check)
            System.out.println("Given strings are an anargram");
        else 
            System.out.println("Given strings are not an anargram");
    }
    public static boolean anagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        char[] arr1= s1.toCharArray();   // cant do sort on string or string builder so converted to char arr
        char[] arr2 =s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}
