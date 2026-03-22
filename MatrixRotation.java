public class MatrixRotation {
    public static void main(String[] args){
        int row = 3;
        int col = 3;
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotate = new int[col][row];
        for(int i=0; i<row; i++){
            int k = row-1-i;
            for(int j=0; j<col; j++){
                rotate[j][k] = matrix[i][j];
            }
        }
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(rotate[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
Output:
7 4 1 
8 5 2
9 6 3
 */