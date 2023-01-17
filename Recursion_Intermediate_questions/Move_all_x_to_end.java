package Recursion_Intermediate_questions;

public class Move_all_x_to_end {
    public static void moveAll(String str,int idx,int count,String newString){
       if(idx==str.length()){
           for(int i=0;i<count;i++)
               newString= newString+'x';
           System.out.println(newString);
           return;
       }

        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAll(str,idx+1,count,newString);
        }
        else {
            newString+=currChar;
            moveAll(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAll(str,0,0,"");

    }
}
