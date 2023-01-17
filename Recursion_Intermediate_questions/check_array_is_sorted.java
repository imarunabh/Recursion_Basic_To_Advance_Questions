package Recursion_Intermediate_questions;

public class check_array_is_sorted {
//    public static void  check(int[] arr,int greater,int index){
//        if(index==-1){
//            System.out.println("Array is sorted ");
//            return;
//        }
//        if(greater>arr[index]){
//            greater=arr[index];
//            check(arr,greater,index-1);
//        }
//        else
//            System.out.println("Array is not sorted");
//
//    }
//    public static void main(String[] args) {
//        int[]arr={12,43,45,56,78,89,95};
//        int greater=arr[arr.length-1];
//        check(arr,greater,arr.length-1);
//
//    }

public static boolean isSorted(int[] arr,int idx){
    if(idx==arr.length-1){
        return true;
    }
    if(arr[idx]<arr[idx+1]){
        // array is sorted till now
       return  isSorted(arr,idx+1);
    }else{
        return false;
    }
}

    public static void main(String[] args) {
  int[] arr={1,2,3};
        System.out.println(isSorted(arr,0));
}
}
