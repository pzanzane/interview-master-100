package binarytree.creation;

/**
 * This class servers as a Node of a Tree.
 */
public class Node {

    public Node(int value) {
        this.value = value;
    }

    public final int value;
    public Node left;
    public Node right;
}
