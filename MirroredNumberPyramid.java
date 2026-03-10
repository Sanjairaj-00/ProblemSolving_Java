public class MirroredNumberPyramid {
    public static void main(String[]args){
        int n = 5;
        int max,space;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                max = i;
                space=2*n-2*i;
            }else{
                max =2*n-i;
                space = 2*i-2*n;
            }
            for(int j=1;j<=max;j++){
                System.out.print(j);
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int h=max;h>=1;h--){
                System.out.print(h);
            }
            System.out.println("");

        }
    }
}


/*
Output:
1        1
12      21
123    321
1234  4321
1234554321
1234  4321
123    321
12      21
1        1

*/