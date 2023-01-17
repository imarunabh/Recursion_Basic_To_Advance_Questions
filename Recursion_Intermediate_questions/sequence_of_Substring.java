package Recursion_Intermediate_questions;


public class sequence_of_Substring {
    public static void subsequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char current=str.charAt(idx);
        // to be added
        subsequence(str,idx+1,newString+current);
        // to be not added
        subsequence(str,idx+1,newString+"_");
    }
    public static void main(String[] args) {
        String str="abc";
        subsequence(str,0,"");
    }
}
