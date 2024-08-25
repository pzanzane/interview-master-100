import binarytree.creation.ArrayToTree;
import binarytree.creation.Node;
import binarytree.problems.CountOfNodes;
import binarytree.problems.DiameterOfTree;
import binarytree.problems.HeightOfTree;
import binarytree.traversal.InOrder;
import binarytree.traversal.LevelOrder;
import binarytree.traversal.PostOrder;
import binarytree.traversal.PreOrder;

public class Main {

    // https://www.youtube.com/watch?v=-DzowlcaUmE&t=1118s
    public static void main2(String[] args) {

        ArrayToTree arrayToTree = new ArrayToTree();
        Node node = arrayToTree.toTree(new int[] {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1});

        PreOrder preOrder = new PreOrder();
        System.out.print("PreOrder: ");
        preOrder.print(node);

        InOrder inOrder = new InOrder();
        System.out.print("\n");
        System.out.print("InOrder: ");
        inOrder.print(node);


        PostOrder postOrder = new PostOrder();
        System.out.print("\n");
        System.out.print("postOrder: ");
        postOrder.print(node);

        LevelOrder levelOrder = new LevelOrder();
        System.out.print("\n");
        System.out.print("levelOrder: ");
        levelOrder.print(node);
    }

    public static void main(String[] args) {

        ArrayToTree arrayToTree = new ArrayToTree();
        Node node = arrayToTree.toTree(new int[] {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1});

        CountOfNodes countOfNodes = new CountOfNodes();
        int count = countOfNodes.count(node);

        System.out.print("\n");
        System.out.print("count: " + count);


        HeightOfTree heightOfTree = new HeightOfTree();
        int height = heightOfTree.height(node);

        System.out.print("\n");
        System.out.print("height: " + height);


        DiameterOfTree diameterOfTree = new DiameterOfTree(heightOfTree);
        int diameter = diameterOfTree.diameterN2(node);

        System.out.print("\n");
        System.out.print("diameterN2: " + diameter);


        DiameterOfTree.DiameterAndHeight diameterN = diameterOfTree.diameterN(node);

        System.out.print("\n");
        System.out.print("diameterN2: " + diameterN);
    }
}