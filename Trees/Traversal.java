class Node{
    int val;
    Node leftNode;
    Node rightNode;

    Node(int val){
        this.val = val;
    }
}

public class Traversal {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.leftNode = new Node(2);
        node.rightNode = new Node(3);
        node.leftNode.leftNode = new Node(4);
        node.leftNode.rightNode = new Node(5);
        node.rightNode.leftNode = new Node(6);
        node.rightNode.rightNode = new Node(7);

        postorder(node);
    }

    static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.val);

        preorder(root.leftNode);
        preorder(root.rightNode);
    }

    static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.leftNode);
        System.out.print(root.val);
        inorder(root.rightNode);
    }

    static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.leftNode);
        postorder(root.rightNode);
        System.out.print(root.val);
    }
}