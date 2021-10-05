package programG;

import javax.xml.soap.Node;

public class Edges {

    private Node beginNode;
    private Node endNode;

    public Edges(Node beginNode, Node endNode) {
        this.beginNode = beginNode;
        this.endNode = endNode;
    }

    public Node getBeginNode() {
        return beginNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setBeginNode(Node beginNode) {
        this.beginNode = beginNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }
}
