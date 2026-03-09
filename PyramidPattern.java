public class PyramidPattern {
    public static void main (String[] args){
        int n = 8;
        for(int i=1; i<=n; i++) {
            int space = n-i;
            int star = 2*i-1;
            while(star!=0){
                if(space>0) {
                    System.out.print(" ");
                    space--;
                }else {
                    System.out.print("*");
                    star--;
                }
            }
            System.out.println("");
        }
    }
}

/*
Output:
                   *
                  ***
                 *****
                *******
               *********
              ***********
             *************
            ***************
           
*/