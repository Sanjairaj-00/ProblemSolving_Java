public class TransposeMatrix {
    public static void main (String[] args){
        int row = 3;
        int col = 4;
        int[][] matrix = {{1,4,8,0},{2,5,7,0},{3,6,9,0}};
        int[][] trans = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                trans[j][i] = matrix[i][j];
            }
        }
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++ ){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
Output:
1 2 3 
4 5 6 
8 7 9 
0 0 0
*/
