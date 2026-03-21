class Solution {
    public int maxArea(int[] height){
        int left =0;
        int right =height.length-1;
        int area =0;

        while(left<right){
            area= Math.max(area,(right-left)*Math.min(height[left], height[right]));
            if (height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = solution.maxArea(height);
        System.out.println("The maximum area of water that can be contained is: " + result);
        
    }
    
}
