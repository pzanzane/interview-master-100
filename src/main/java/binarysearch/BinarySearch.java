package binarysearch;

public class BinarySearch {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int middle = right / 2;
        return search(nums, target, left, right, middle);
    }

    private int search(int[] nums, int target, int left, int right, int middle) {

        if (left > right) {
            return -1;
        }

        if (nums[middle] == target) {
            return middle;
        }

        if (nums[middle] > target) {
            right = middle - 1;
            middle = left + (right - left)/2;
            return search(nums, target, left, right, middle);
        }

        if (nums[middle] < target) {
            left = middle + 1;
            middle = left + (right - left)/2;
            return search(nums, target, left, right, middle);
        }
        return -1;
    }
}
