package Recursion_Intermediate_questions;

public class Remove_duplicates {
    public static boolean[] map=new boolean[26];

    public static void removeDuplicates(String str,int idx,String newString){
        if(idx== str.length()){
            System.out.println(newString);
            return;
        }
        char current=str.charAt(idx);
        if(map[current-'a']==true){
            removeDuplicates(str,idx+1,newString);
        }
        else{
            map[current-'a']=true;
            newString=newString+current;
            removeDuplicates(str,idx+1,newString);
        }

    }
    public static void main(String[] args) {
        String str="abbaccdd";
        int idx;
        removeDuplicates(str, 0,"");

    }
}
