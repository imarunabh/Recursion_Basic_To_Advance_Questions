package Recursion_Intermediate_questions;

public class Tile_Problem_Count_Path_Maze_using_Dynamic_Programming {
    public static int PlaceTiles(int n,int m ){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }


        // vertically
        int vertPlacement=PlaceTiles(n-m,m);

        //horizontally
        int horiPlacement=PlaceTiles(n-1,m);

        return vertPlacement+horiPlacement;
    }
    public static void main(String[] args) {
    int n=4,m=2;
        System.out.println(PlaceTiles(n,m));
    }
}
