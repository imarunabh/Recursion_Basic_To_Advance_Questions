package Recursion_Intermediate_questions;

public class Occurrence {
    public static int first=-1;
    public static int last=-1;
    public static void occurrence(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current=str.charAt(idx);
        if(current==element){
            if(first==-1){
                first=idx;
            }
            else
                last=idx;
        }
        occurrence(str,idx+1,element);
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        char element='a';
        System.out.println(str.length());
        occurrence(str,0,element);

    }
}
