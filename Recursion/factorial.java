package Recursion;

public class factorial {
    static void calcfactorial(int num,int fact){
        if(num==0) {
            System.out.println(fact);
            return;
        }
        fact=fact*num;
        num--;
        calcfactorial(num,fact);


    }
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        calcfactorial(num,fact);
    }
}
