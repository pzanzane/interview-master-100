package prefixsum3;

import invertbinarytree.TreeNode;
import org.junit.jupiter.api.Test;

public class PrefixSumTest {

    @Test
    public void pathSum() {

        TreeNode root = TreeNode.buildTree(new int[]{1, -2, -3});
        PrefixSum prefixSum = new PrefixSum();
        prefixSum.pathSum(root, -1);

    }
}