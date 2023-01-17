package Recursion_Intermediate_questions;

public class Printing_string_reverse {
    static void print(String str,int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        print(str,index-1);

    }
    public static void main(String[] args) {
        String str="abcd";
        print(str,str.length()-1);
    }
}
