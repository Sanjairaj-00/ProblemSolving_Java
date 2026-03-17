public class InverseRightAngledTriangle {
    public static void main(String[] args){
        int n = 7;
        for(int i=1 ; i<=n ; i++){
            int num = i;
            System.out.print(i+" ");
            for(int j=n ; j>i ; j--){
                num = num+j;
                System.out.print(num+" ");
            }
            System.out.println("");
        }
    }
}

/*

Output:
1 8 14 19 23 26 28 
2 9 15 20 24 27
3 10 16 21 25
4 11 17 22
5 12 18
6 13
7

*/