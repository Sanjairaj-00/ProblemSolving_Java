public class NumericalDiamond {
    public static void main (String[] args){
        int n = 7;
        int mid = n/2 + 1;
        int num, space;
        for(int i=1; i<=n; i++) {
            if(i<=mid) {
                num = i;
            }else {
                num = mid*2-i;
            }
            int leftnum = num;
            int flag=0;
            space = mid-num;
            while(num<=leftnum) {
                if(space>0) {
                    System.out.print(" ");
                    space--;
                }else {
                    if(num>1 && flag==0) {
                        System.out.print(num);
                        num--;
                    }else {
                        System.out.print(num);
                        num++;
                        flag++;
                    }
                }
            }
            System.out.println("");
        }
    }
}

/*
Output:
   1
  212
 32123
4321234
 32123
  212
   1
*/