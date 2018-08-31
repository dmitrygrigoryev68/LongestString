public class LongestString {

    public static void main (String [] args){

        String string = "adddkkkkrrrrrrr                bbbbbbbbyyyyyy";
        System.out.println(longestString(string));
    }

    public static int longestString(String string){
        int maxSize = 1;
        int currSize = 1;
        for (int i = 1; i < string.length(); i++) {
            if(string.substring(i-1,i).equals(string.substring(i,i+1))){
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
