public class ZigZagNumberTriangle {
    public static void main(String[] args){
        int N = 5;
        int num = 1;
        for(int i = 1 ; i<=N ; i++){
            int space = N-i;
            space *= 3;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            if(i%2!=0){
                for(int j=1;j<=N;j++){
                    if (num<10)  System.out.print(" ");
                    System.out.print(num+" ");
                    num++;
                }
            }else{
                num = N*i;
                for(int j=1;j<=N;j++){
                    if (num<10)  System.out.print(" ");
                    System.out.print(num+" ");
                    num--;
                }
                num=N*i+1;
            }
            System.out.println();
        }
    }
}

/*
Output:
             1  2  3  4  5 
         10  9  8  7  6
      11 12 13 14 15
   20 19 18 17 16
21 22 23 24 25

 */