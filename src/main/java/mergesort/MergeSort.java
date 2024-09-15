package mergesort;

public class MergeSort {

    public int[] sort(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        return divide(nums, left, right);
    }

    private int[] divide(int[] nums, int left, int right) {

        if (left > right) {
            return nums;
        }
        int middle = left + right / 2;
        divide(nums, left, middle);
        divide(nums, middle + 1, right);
        return mergeTwoSortedList(nums, left, middle, right);
    }

    private int[] mergeTwoSortedList(int[] nums, int left, int middle, int right) {

        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
        int[] sortedArr = new int[leftSize + rightSize];

        for(int index = 0; index < leftSize; index++) {
            leftArr[index] = nums[index + left];
        }

        for(int index = 0; index < leftSize; index++) {
            rightArr[index] = nums[index + middle + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int newIndex = left;

        while (leftIndex < leftSize && rightIndex < rightSize) {

            if (leftArr[leftIndex] < rightArr[rightIndex]) {

                sortedArr[newIndex] = leftArr[leftIndex];
                leftIndex ++;
            } else {

                sortedArr[newIndex] = leftArr[rightIndex];
                rightIndex ++;
            }

            newIndex ++;
        }

        if (leftIndex < leftSize) {

            while (leftIndex < leftSize) {
                sortedArr[newIndex] = leftArr[leftIndex];
                leftIndex ++;
                newIndex ++;
            }
        }

        if (rightIndex < rightSize) {

            while (rightIndex < rightSize) {
                sortedArr[newIndex] = leftArr[rightIndex];
                rightIndex ++;
                newIndex ++;
            }
        }

        return sortedArr;
    }
}
