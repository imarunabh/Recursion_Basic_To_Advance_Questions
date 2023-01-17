package Recursion;

public class printing_numbers_series {
    static void print(int a){
        System.out.println(a);
        a--;
       if(a==0)
           return;
        print(a);
    }

    static void prints(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
       int a=5;
       print(a);
       prints(a);


    }

}
