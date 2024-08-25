package binarytree.creation;

public final class ArrayToTree {

    int index = 0;
    public Node toTree(int[] array) {
        int size = array.length;
        index = 0;
        return traverse(array);
    }

    private Node traverse(int[] array) {

        if (index == array.length) {
            return null;
        }

        int value = array[index];
        index++;
        if (value == -1) {
            return null;
        }

        Node node = new Node(value);
        node.left = traverse(array);
        node.right = traverse(array);
        return node;
    }
}
