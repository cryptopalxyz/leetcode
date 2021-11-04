package com.course.preview;

import java.util.HashMap;

public class TwoSumAgain {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <=1) return null;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]), i};
            else
                map.put(nums[i], i);
        }


        return null;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(twoSum(nums, 6));
    }

}


/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

0->7
1->2
2->-2
3->-6

1 ms, 在所有 Java 提交中击败了99.57%的用户
*/