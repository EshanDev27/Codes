import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.leftNode = new Node(2);
        node.rightNode = new Node(3);
        node.leftNode.leftNode = new Node(4);
        node.leftNode.rightNode = new Node(5);
        node.rightNode.leftNode = new Node(6);
        node.rightNode.rightNode = new Node(7);

        BreadthFirstSearch(node);
    }

    static void BreadthFirstSearch(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while (!queue.isEmpty()) {
            if(queue.peek().leftNode != null){
                queue.add(queue.peek().leftNode);
            }

            if(queue.peek().rightNode != null){
                queue.add(queue.peek().rightNode);
            }

            System.out.print(queue.poll().val);
        }

    }
}
