import java.util.Stack;
// This is actaully Pre order
public class DFS {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.leftNode = new Node(2);
        node.rightNode = new Node(3);
        node.leftNode.leftNode = new Node(4);
        node.leftNode.rightNode = new Node(5);
        node.rightNode.leftNode = new Node(6);
        node.rightNode.rightNode = new Node(7);
        
        DepthFirstSearch(node);
    }

    static void DepthFirstSearch(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            node = stack.pop();

            if(node.rightNode != null){
                stack.push(node.rightNode);
            }

            if(node.leftNode != null){
                stack.push(node.leftNode);
            }
            
            System.out.println(node.val);
        }
    }
}
