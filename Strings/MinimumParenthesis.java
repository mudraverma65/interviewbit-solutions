public class Solution {
    public int solve(String A) {
        int currentOpen = 0;
        int currentClosed = 0;
        
        for (char c: A.toCharArray()){
            if(c=='('){
                currentOpen += 1;
            } else{
                if(currentOpen > 0){
                    currentOpen -= 1;
                } else {
                    currentClosed +=1;
                }
            }
        }
        return currentOpen + currentClosed;
    }
}
