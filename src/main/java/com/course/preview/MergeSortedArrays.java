package com.course.preview;

public class MergeSortedArrays {
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
         //特殊情况判断
         if (n<=0) return;
        if (m<=0 )  {
            for (int i=0;i<n;i++)
                nums1[i] = nums2[i];
            return;
        }
        int mi=0;
         int ni=0;
         int temp = -99;
         while ( mi< nums1.length && ni< nums2.length && mi < m) {
             if (nums1[mi]<nums2[ni]) {
                 mi++;
             }
             else {
                 //交换
                 //把nums1[mi]改成放在合适的位置
                 int data = nums1[mi];
                 nums1[mi] = nums2[ni];
                 insertIntoSortedArray(nums2, n, data);
                 mi++;
             }
         }

         if (mi==m) {
             for (;mi<m+n;mi++) {
                 nums1[mi] = nums2[ni++];
             }
         }

    }

    private  void insertIntoSortedArray(int[] nums2, int n, int data) {
        int i = 1;
        while (i < n && nums2[i] < data) {
            nums2[i-1]=nums2[i];
            i++;
        }
        nums2[i-1] = data;
    }

    public static void main(String[] args) {
        MergeSortedArrays m= new MergeSortedArrays();
        int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};
        m.merge(nums1, 1, nums2, 5);
        System.out.println(nums1);

       // nums1 = new int[]{0};
       // nums2 = new int[]{1};
        //merge(nums1, 0, nums2, 1);
        //System.out.println(nums1);
 /*
 3 5 6 1 2 4
 1 5 6 3 2 4
 1 3 6 5 2 4
 1 3 5 6 2 4
 1 2 5 6 3 4



  */
    }
}


/*
思路
2个指针mi和ni，如果ni<=mi，就把ni和mi的交换，然后mi++
循环结束
一开始的想法错误，交换一次之后nums2可能就乱序了，所以需要插入到合适的位置。
怎么确定合适的位置？从后向前循环，遇到大的停住。




 */