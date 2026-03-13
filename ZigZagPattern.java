public class ZigZagPattern {
    public static void main(String[] args){
        int n = 13;
        int r1,r2,r3;
        r1 = n/4;
        if(n%4!=0){
            r1++;
        }
        r2 = n/2;
        r3 = n-r1-r2;

        while(r1>0){
                System.out.print("*   ");
                r1--;
            }
            System.out.println("");
            while(r2>0){
                System.out.print(" *");
                r2--;
            }
            System.out.println("  ");
            System.out.print("  ");
            while(r3>0){
                System.out.print("*   ");
                r3--;
            }
    }
}

/*
Output:
*   *   *   *   
 * * * * * *
  *   *   *
*/