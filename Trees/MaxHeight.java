public class MaxHeight {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.leftNode = new Node(2);
        node.rightNode = new Node(3);
        node.leftNode.leftNode = new Node(4);
        node.leftNode.rightNode = new Node(5);
        node.rightNode.leftNode = new Node(6);
        node.rightNode.rightNode = new Node(7);
        node.rightNode.rightNode.rightNode = new Node(7);
        
        System.out.println(diameter(node));
    }

    static int Maxheight(Node node){
        if(node == null){
            return 0;
        }

        int lh = 0, rh = 0;
        lh = Maxheight(node.leftNode);
        rh = Maxheight(node.rightNode);

        return 1 + Math.max(lh, rh);
    }

    static int diameter(Node node){
        if(node == null){
            return 0;
        }

        int op1 = diameter(node.leftNode);
        int op2 = diameter(node.rightNode);
        int op3 = Maxheight(node.leftNode) + Maxheight(node.rightNode) + 1;

        int ans  = Math.max(op1, Math.max(op2, op3));
        return ans;
    }
}
