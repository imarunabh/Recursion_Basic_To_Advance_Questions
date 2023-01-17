package Recursion_Intermediate_questions;

public class Tower_Of_Hanio {
 public static void toweOfHanio(int n,String src,String helper,String dest){
     if(n==1){
         System.out.println("Transfer of Disk "+n+" from "+src +"to"+dest);
         return;

     }
     toweOfHanio(n-1,src,dest,helper);
     System.out.println("Transfer of Disk "+n+" from "+src +" to "+dest);
     toweOfHanio(n-1,helper,src,dest);

 }

    public static void main(String[] args) {
     int n=2;
      toweOfHanio(n,"S","H","D");
        
    }
}
