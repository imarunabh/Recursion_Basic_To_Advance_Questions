package Recursion;

public class x_power_n {
    static int calpower(int x,int n,int ans){
        if(x==0){
          return 0;
      }
      if(n==0) {
          return 1;
      }
      ans=x*calpower(x,n-1,ans);

      return x*ans;
    }


    public static void main(String[] args) {
        int x=2;
        int n=12;

        int ans=1;
        System.out.println(calpower(x,n,ans));

    }
}
