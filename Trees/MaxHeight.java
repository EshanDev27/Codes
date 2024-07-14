public class MaxHeight {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.leftNode = new Node(2);
        node.rightNode = new Node(3);
        node.leftNode.leftNode = new Node(4);
        node.leftNode.rightNode = new Node(5);
        node.rightNode.leftNode = new Node(6);
        node.rightNode.rightNode = new Node(7);
        
        System.out.println(Maxheight(node));
    }

    static int Maxheight(Node node){
        if(node == null){
            return 0;
        }

        int lh = Maxheight(node.leftNode);
        int rh = Maxheight(node.rightNode);

        return 1 + Math.max(lh, rh);
    }
}
