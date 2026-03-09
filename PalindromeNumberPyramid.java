public class PalindromeNumberPyramid {
    public static void main (String[] args){
        int n = 5;
        for(int i=1;i<=n;i++) {
            int max = 2*i-1;
            int space = n-i;
            int star = i;
            int flag = 0;
            while(star>=i){
                if(space>0) {
                    System.out.print(" ");
                    space--;
                }else {
                    if(star<max&&flag==0) {
                        System.out.print(star);
                        star++;
                    }else {
                        System.out.print(star);
                        star--;
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
   232
  34543
 4567654
567898765
*/