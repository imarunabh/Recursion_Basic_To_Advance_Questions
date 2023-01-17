package Recursion_Intermediate_questions;

public class Count_Path_Maze_using_backtracking {
    public static int CountPaths(int i,int j,int n,int m){
       if(i==n|| j==m){
           return 0;
       }
       if(i==n-1&&j==m-1){
           return 1;
       }


        //move downwards
        int downPaths=CountPaths(i+1,j,n,m);

        //move right
        int rightPaths=CountPaths(i,j+1,n,m);
        return downPaths+rightPaths;

    }

    public static void main(String[] args) {
        int n=3,m=3;
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               int totalPaths=CountPaths(i,j,n,m);
               System.out.println(totalPaths);
           }
       }






    }
}
