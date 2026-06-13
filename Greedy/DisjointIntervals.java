public class Solution {
    public int solve(int[][] A) {
        Arrays.sort(A, (a,b) -> Integer.compare(a[1], b[1]));
        
        int count = 0;
        int lastEnd=-1;
        
        for (int[] smallArray: A){
            int start = smallArray[0];
            int end = smallArray[1];
            
            if(start > lastEnd){
                count ++;
                lastEnd = end;
            }
        }
        return count;
    }
}
