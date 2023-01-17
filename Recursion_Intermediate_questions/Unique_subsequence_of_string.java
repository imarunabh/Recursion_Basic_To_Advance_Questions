package Recursion_Intermediate_questions;

import java.util.HashSet;

public class Unique_subsequence_of_string {
    public static void subsequence2(String str,int idx,String newString,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char current=str.charAt(idx);
        // to be added
        subsequence2(str,idx+1,newString+current,set);
        // to be not added
        subsequence2(str,idx+1,newString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String>set=new HashSet<>();
        subsequence2(str,0,"",set);


    }
}
