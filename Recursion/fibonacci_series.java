package Recursion;

public class fibonacci_series {
    static void fibonacci_series(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci_series(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        System.out.println(a);
        System.out.println(b);
        fibonacci_series(a,b,n-2);

    }
}
