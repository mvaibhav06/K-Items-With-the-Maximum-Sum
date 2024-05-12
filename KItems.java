public class KItems {
    public int kItemsWithMaximumSum(int numOnes, int numZeroes, int numNegOnes, int k) {
        int count = 0;
        int out = 0;

        if(k < numOnes){
            return k;
        }else{
            count += numOnes;
            out = numOnes;
            while(count<k && numZeroes>0){
                count++;
                numZeroes--;
            }
            while(count<k && numNegOnes>0){
                count++;
                numNegOnes--;
                out--;
            }
        }
        return out;
    }
}
