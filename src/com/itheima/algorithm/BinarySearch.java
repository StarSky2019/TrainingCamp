package com.itheima.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 6, 7, 8};
        int left = 0;
        int right = array.length - 1;
        int target = 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(array[mid] < target)
            {
                left = mid + 1;
            }
            else if(array[mid] >target)
            {
                right = mid - 1;
            }
            else
            {
                System.out.println(mid);
                return;
            }
        }
    }

}
