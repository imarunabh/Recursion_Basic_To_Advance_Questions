package Recursion;

public class x_power_n_for_nlogn {

        static int calpower(int x,int n){
            if(x==0){
                return 0;
            }
            if(n==0) {
                return 1;
            }
            if(n%2==0){
                return calpower(x,n/2)*calpower(x,n/2);
            }
            else
                return calpower(x,n/2)*calpower(x,n/2)*x;

        }
    public static void main(String[] args) {
        int x=2;
        int n=4;
        System.out.println(calpower(x,n));

    }

}
