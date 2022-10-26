import javax.swing.plaf.metal.MetalBorders.InternalFrameBorder;

public class BinaryTree {

    public static void preOrderPrinter(BinaryTreeNode node){
        if (node == null){
            return;
        }
        System.out.print("[" + node.data + "] ");
        preOrderPrinter(node.getChild("L"));
        preOrderPrinter(node.getChild("R"));
    }

    public static void postOrderPrinter(BinaryTreeNode node){
        if(node == null){
            return;
        }
        postOrderPrinter(node.getChild("L"));
        postOrderPrinter(node.getChild("R"));
        System.out.print("[" + node.data + "] ");
    }

    public static void inOrderPrinter(BinaryTreeNode node){
        if (node == null){
            return;
        }
        inOrderPrinter(node.getChild("L"));
        System.out.print("[" + node.data + "] ");
        inOrderPrinter(node.getChild("R"));
    }

    public static void main(String[] args){

        BinaryTreeNode root = new BinaryTreeNode(0);
        root.add(1, "L");
        root.add(2, "R");
        BinaryTreeNode one = root.getChild("L");
        BinaryTreeNode two = root.getChild("R");
        one.add(3, "L");
        one.add(4, "R");
        two.add(5, "L");
        two.add(6, "R");
        BinaryTreeNode six = two.getChild("R");
        six.add(7, "L");
        six.add(8, "R");

        System.out.print("Pre Order Traversal: ");
        preOrderPrinter(root);
        System.out.println();
        System.out.print("Post Order Traversal: ");
        postOrderPrinter(root);
        System.out.println();
        System.out.print("In Order Traversal: ");
        inOrderPrinter(root);
        System.out.println();
        System.out.println("\n");


        BinaryTreeNode root1 = new BinaryTreeNode(0.0);
        root1.add("bruh", "L");
        root1.add(true, "R");
        BinaryTreeNode one1 = root1.getChild("L");
        BinaryTreeNode two2 = root1.getChild("R");
        one1.add(3, "L");
        one1.add(4000000, "R");
        two2.add("cool", "L");
        BinaryTreeNode three = two2.getChild("L");
        three.add("finish", "R");

        System.out.print("Pre Order Traversal: ");
        preOrderPrinter(root1);
        System.out.println();
        System.out.print("Post Order Traversal: ");
        postOrderPrinter(root1);
        System.out.println();
        System.out.print("In Order Traversal: ");
        inOrderPrinter(root1);
        System.out.println("\n");
    }
}