import java.util.List;

/**
 * Created by ferenc on 2017.07.04..
 */
public class Node {

    public int data;
    public List nodeList;

    public Node(int data) {
        this.data = data;
    }

    public Node next() {
        return null;
    }

    public boolean hasLoop() {
        return true;
    }

    public List<Node> listNodes() {
        return nodeList;
    }
}
