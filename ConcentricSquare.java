public class ConcentricSquare {
    public static void main(String[] args) {
        int n = 5 ;
        int min,limit,flag,num;
        for(int i=1;i<2*n;i++){
            if(i<=n){
                min = n-i+1;
            }else{
                min = i-n+1;
            }
            limit = 2*min-1;
            flag = 0;
            num = n;
            for(int j=1;j<2*n;j++){
                if(num==min && limit>=1){
                    System.out.print(num +" ");
                    limit--;
                }else if(num>min && num>=1 && flag==0){
                    System.out.print(num-- +" ");
                }else {
                    System.out.print(++num +" ");
                    flag++;
                }
            }
            System.out.println(" ");
        }
    }
}

/*
Output:
5 5 5 5 5 5 5 5 5  
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
*/