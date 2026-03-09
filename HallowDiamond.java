public class HallowDiamond {
    public static void main (String[] args){
        int n = 5;
        int space, rgt_star, lft_star;
        for(int i=1; i<=n*2; i++) {
            if(i<n) {
                lft_star = n-i+1;
                space = 2*i-1;
            }else if(i==n){
                lft_star = i-n+1;
                space = 2*n-1;
            }else{
                lft_star = i-n;
                space = 4*n-2*i+1;
            }
            rgt_star = lft_star;
            while(rgt_star>0){
                if(lft_star>0) {
                    System.out.print("*");
                    lft_star--;
                }else {
                    if(space>0) {
                        System.out.print(" ");
                        space--;
                    }else {
                        System.out.print("*");
                        rgt_star--;
                    }
                }
            }
            System.out.println("");
        }
    }
}

/*
Output:
***** *****
****   ****
***     ***
**       **
*         *
*         *
**       **
***     ***
****   ****
***** *****
 */