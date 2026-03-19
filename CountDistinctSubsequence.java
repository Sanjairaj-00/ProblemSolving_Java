public class CountDistinctSubsequence {
    public static void main(String[] args){
        String s = "gfg";
        int len = s.length();
        int count = 1;
        for(int i=0 ; i<len ; i++){
            count *= 2;
            for(int j=i-1 ; j>=0 ;j--){
                if(s.charAt(i)==s.charAt(j)){
                    count -= (1<<j);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

/*
Ouput:7
 */
