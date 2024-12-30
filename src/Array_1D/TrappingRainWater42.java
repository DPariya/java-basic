public class TrappingRainWater42 {
    public static void main(String[] args) {
        // Two Sum Leetcode#42
        // Input : height = [0,1,0,2,1,0,1,3,2,1,2,1]
        // Output : 9
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        /*
         * Given n non-negative integers representing an
         * elevation map where the width of each bar is 1, compute
         * how much water it can trap after raining.
         */

        int l = 0, r = height.length - 1;
        int ans = 0;
        int leftMax = height[l];
        int rightMax = height[r];

        while (l < r) {
            // check if leftmost is greater or right, go to the direction which is less
            // if left less-> l++
            // if right less-> r--
            if (leftMax < rightMax) {
                l += 1;
                leftMax = Math.max(leftMax, height[l]);
                ans += leftMax - height[l];
            } else {
                r -= 1;
                rightMax = Math.max(rightMax, height[r]);
                ans += rightMax - height[r];
            }
        }
        // print ans
        System.out.println(ans);

    }
}
