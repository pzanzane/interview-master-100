package prefixsum3;

import invertbinarytree.TreeNode;

import java.util.HashMap;

public class PrefixSum {

    HashMap<Long, Integer> sumCount = new HashMap<>();
    int result = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return 0;
        }
        sumCount.put(0L, 1);
        countPaths(root, 0L, targetSum);
        return result;
    }

    public void countPaths(TreeNode root, Long sum, int target) {
        if(root == null) {
            return;
        }

        sum += root.val;
        result += sumCount.getOrDefault(sum - target, 0);

        sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);

        countPaths(root.left, sum, target);
        countPaths(root.right, sum, target);

         sumCount.put(sum, sumCount.get(sum) - 1);
    }
}
