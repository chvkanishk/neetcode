
import java.util.ArrayList;
import java.util.List;

class Solution{
    public int[][] inter(int[][] firstList, int[][] secondList){
        List<int[]> result = new ArrayList<>();

        int i=0, j=0;

        while(i<firstList.length && j<secondList.length){
            int start= Math.max(firstList[i][0],secondList[j][0]);
            int end = Math.min(firstList[i][1],secondList[j][1]);

            if (start<=end){
                result.add(new int[]{start,end});
            }
             if (firstList[i][1] < secondList[j][1]) {
            i++;
            } else {
               j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

public class IntervalListIntersection {
    public static void main(String[] args) {
        int[][] firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1,5},{8,12},{15,24},{25,26}};

        Solution s = new Solution();
        int[][] result = s.inter(firstList, secondList);

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + "," + interval[1] + "]");
        }
        
    }
}
