package algorithms;

/**
 * Created by Lily on 2016/12/25.
 * Email: yifengtang@hustunique.com
 */
public class IslandPerimeter {

    public static void main(String args[]){
        System.out.println(new IslandPerimeter().islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
    }

    private int islandPerimeter(int[][] grid) {
        int islands = 0;
        int neighbors = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    islands++;
                    if(i + 1 < grid.length && grid[i + 1][j] == 1) neighbors++;
                    if(j + 1 < grid[i].length && grid[i][j + 1] == 1) neighbors++;
                }
            }
        }
        return islands * 4 - neighbors * 2;
    }
}
