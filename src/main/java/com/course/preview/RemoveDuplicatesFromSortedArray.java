package com.course.preview;

/*
* 数组
* 双指针
*
* */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        if (nums == null) return  0;
        if (nums.length<=1) return nums.length;

        int b=0;
        int i=0;
        for (i=0; i<nums.length; i++){
            if (b > nums.length - 1)
                break;
            else
                nums[i] = nums[b];

            while (b < nums.length && nums[i] == nums[b]) {
                b++;
            }
        }
        return i;
    }


    public static void main (String args[]) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }
}


/*
思路：用2个指针，A指向当前，B指向后面一个
当B不为空 && B和A的值一样，B++
最好把A的后面置为NULL？如何结束数组？不需要结束数组，
O(1)的意思是一个变量？几个变量也可以

输入：nums = [1,1,2]
输出：2, nums = [1,2]
解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/

 */
