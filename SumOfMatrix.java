public class SumOfMatrix {
    public static void main(String[] args){
        int n = 3;
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{10,11,12},{13,14,15},{16,17,18}};
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr1[i][j] + arr2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

/*
Output:
11 13 15 
17 19 21
23 25 27
*/