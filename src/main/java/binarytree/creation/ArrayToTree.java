package binarytree.creation;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public final class ArrayToTree {


    public Node toTree(int[] array) {

        if (array == null || array.length <=0) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        Node node = new Node(array[0]);
        Node root = node;
        queue.add(node);
        int index = 1;
        while (index < array.length) {

            node = queue.poll();

            int value = array[index];
            if (index < array.length) {
                if (value == -1) {
                    node.left = null;
                } else {
                    node.left = new Node(array[index]);
                    queue.add(node.left);
                }
                index++;
            }


            if (index < array.length) {
                value = array[index];
                if (value == -1) {
                    node.right = null;
                } else {
                    node.right = new Node(array[index]);
                    queue.add(node.right);
                }
                index++;
            }
        }
        return root;
    }
}
