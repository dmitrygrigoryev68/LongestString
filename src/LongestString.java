public class LongestString {

    public static void main (String [] args){

        String string = "adddkkkkjjjjjjjjjj      yyyyyy";
        System.out.println(longestString(string));
    }

    public static int longestString(String string){
        int maxSize = 1;
        int currSize = 1;
        char charArr [] = string.toCharArray();
        for (int i = 1; i < charArr.length; i++) {
            if(charArr[i-1] == charArr[i]){
                currSize ++;
                if (currSize > maxSize){
                    maxSize = currSize;
                }
            }
            else currSize = 1;
        }
        return maxSize;
    }
}
