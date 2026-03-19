public class ReverseSentence {
    public static void main(String[] args){
        String str = "I Love India";
        String[] arr = str.split(" ");
        String result="";
        for(String i : arr ){
                result = i + " " + result;
        }
        System.out.println(result);
    }
}

/*
Output:India Love I 
 */