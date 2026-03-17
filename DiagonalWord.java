public class DiagonalWord {
    public static void main(String[] args){
        String str = "Welcome";
        int n = str.length();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i || j==n-i+1 ){
                    System.out.print(str.charAt(j-1));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        } 
    }
}

/*
Output:
W     e
 e   m
  l o
   c
  l o
 e   m
W     e
*/


