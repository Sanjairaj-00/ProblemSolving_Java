public class DiamondPattern {
    public static void main (String[] args){
        int space,star;
        int n = 5;
        for(int i=1;i<=n*2-1;i++) {
            if(i<=n) {
                space = n-i;
                star = 2*i-1;
            }else {
                space = i-n;
                star = 4*n-2*i-1;
            }
            while(space!=0){
                if(star>0) {
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
 *******
  *****
   ***
    *
*/