public class Solution {
    public int canCompleteCircuit(final int[] A, final int[] B) {
        int totalSurplus = 0;
       int currentTank = 0;
       int startIndex = 0;
       
       for (int i = 0; i < A.length; i++){
           int netGas = A[i] - B[i];
           currentTank += netGas;
           totalSurplus += netGas;
           
           if(currentTank < 0){
               startIndex = i+1;
               currentTank = 0;
           }
       }
       
       return totalSurplus < 0 ? -1 : startIndex;
    }
}
