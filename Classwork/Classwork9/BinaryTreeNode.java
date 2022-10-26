import java.util.ArrayList;

public class BinaryTreeNode{
    
    Object data;
    BinaryTreeNode left, right;

    BinaryTreeNode(Object d){
        data = d;
        left = null;
        right = null;
    }

    public void add(Object s, String child){
        child = child.toUpperCase();
        if(child.equals("L")){
            left = new BinaryTreeNode(s);
        } else if (child.equals("R")){
            right = new BinaryTreeNode(s);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public BinaryTreeNode getChild (String child){
        child = child.toUpperCase();
        if (child.equals("L") || child.equals("R")){
            return (child.equals("L") ? left : right);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void invertTree(BinaryTreeNode root){
        if(root==null){
            return;
        }

        invertTree(root.left);
        invertTree(root.right);

        BinaryTreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
    }

    /*public int sumEven(BinaryTreeNode root){
        if (root == null){
            return 0;
        }

        int currentSum = 0;
        if (root.data % 2 == 0){
            currentSum += root.data;
        }

        currentSum += sumEven(root.left);
        currentSum += sumEven(root.right);

        return currentSum;
    }*/

    /*public int sumEvenOneLine(BinaryTreeNode root){
        return (root.data % 2 == 0 ? root.data : 0) + sumEvenOneLine(root.left) + sumEvenOneLine(root.right);
    }*/


    /*public boolean isBinarySearchTree(BinaryTreeNode root){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        makeList(root, arr);
        for(int i=1; i < arr.size(); i++){
            if (arr.get(i) <= arr.get(i-1)){
                return false;
            }
        }
        return true;
    }*/

    /*private void makeList(BinaryTreeNode root, ArrayList<Integer> arr){
        if (root == null){
            return;
        }
        makeList(root.left, arr);
        arr.add(root.data);
        makeList(root.right, arr);
    }*/

    public Object getValue(){
        return data;
    }

}