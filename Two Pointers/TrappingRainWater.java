class Solution{
    public int trap(int[] height){

        int left =0, right =height.length-1;
        int ml= 0, mr=0;
        int water =0;

        while(left<right){
            if (height[left]< height[right]){
                ml=Math.max(ml,height[left]);
                water += ml-height[left];
                left++;
            }else{
                mr= Math.max(mr,height[right]);
                water += mr-height[right];
                right--;
            }
        }
        return water;

    }
}


class TrappingRainWater { 
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution.trap(height));

    }
}