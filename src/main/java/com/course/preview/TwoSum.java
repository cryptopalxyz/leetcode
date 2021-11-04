package com.course.preview;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <=1) return null;

        int i=0;
        int k=0;
        for (i=0; i<nums.length-1; i++)
            for (k=i+1;k<nums.length;k++) {

                if (nums[i] + nums[k] == target)
                    return new int[] {i,k};;
            }

        return null;

    }

    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        System.out.println(twoSum(nums, 10));
    }

}


/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

双重循环，简单搞定
执行用时：
67 ms, 在所有 Java 提交中击败了7.93%的用户
内存消耗：
38.6 MB, 在所有 Java 提交中击败了48.72%的用户

*/