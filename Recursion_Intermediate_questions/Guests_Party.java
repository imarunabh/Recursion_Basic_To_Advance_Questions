package Recursion_Intermediate_questions;

public class Guests_Party {
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        //single
        int way1=callGuest(n-1);

        //pair
        int way2=(n-1)*callGuest(n-2);

        return way1+way2;

    }
    public static void main(String[] args) {
        int n=4;
        callGuest(n);
        System.out.println(callGuest(n));

    }
}
