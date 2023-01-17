package Recursion;

public class sum_of_n_natural_numbers {
    static void print(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        print(i+1,n,sum);
    }
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        print(n,5,sum);
    }
}
