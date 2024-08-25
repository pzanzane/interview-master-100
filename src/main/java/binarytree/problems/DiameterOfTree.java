package binarytree.problems;

import binarytree.creation.Node;

/**
 * Maximum distance between two nodes.
 */
public class DiameterOfTree {

    private final HeightOfTree heightOfTree;

    public DiameterOfTree(HeightOfTree heightOfTree) {
        this.heightOfTree = heightOfTree;
    }

    public int diameterN2(Node root) {

        if (root == null) {
            return 0;
        }

        int diameterOfLeftNode = diameterN2(root.left);
        int diameterOfRightNode = diameterN2(root.right);
        int diameterOfCurrentNode = heightOfTree.height(root.left) + heightOfTree.height(root.right) + 1;
        return Math.max(diameterOfCurrentNode, Math.max(diameterOfLeftNode, diameterOfRightNode));
    }

    public DiameterAndHeight diameterN(Node root) {

        if (root == null) {
            return null;
        }

        DiameterAndHeight diameterOfLeftNode = diameterN(root.left);
        DiameterAndHeight diameterOfRightNode = diameterN(root.right);
        int leftHeight = diameterOfLeftNode == null ? 0 : diameterOfLeftNode.height;
        int rightHeight = diameterOfRightNode == null ? 0 : diameterOfRightNode.height;
        int leftDiameter = diameterOfLeftNode == null ? 0 : diameterOfLeftNode.diameter;
        int rightDiameter = diameterOfRightNode == null ? 0 : diameterOfRightNode.diameter;
        int currentHeight = Math.max(leftHeight, rightHeight) + 1;
        int diameterOfCurrentNode = leftHeight + rightHeight + 1;

        int maxDiameter = Math.max(diameterOfCurrentNode, Math.max(leftDiameter, rightDiameter));

        return new DiameterAndHeight(maxDiameter, currentHeight);
    }

    public final class DiameterAndHeight {
        private final int diameter;
        private final int height;
        public DiameterAndHeight(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }

        @Override
        public String toString() {
            return "diameter: " + diameter + " height: "+ height;
        }
    }
}
