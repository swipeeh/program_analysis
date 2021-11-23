package programG;


import AST.Tracer;
import AST.declaration.Declaration;
import org.w3c.dom.Node;

public class Edges {

    private Node beginNode;
    private Tracer tracer;
    private Node endNode;


    public Edges(Node beginNode, Node endNode) {
        this.beginNode = beginNode;
        this.endNode = endNode;
        this.tracer = tracer;
    }

    public Edges(Declaration decl, Nodes fNode, Nodes lNode) {

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

    public Tracer getTracer(){
        return this.tracer;
    }

    public void setEndNode(Node endNode) {

        this.endNode = endNode;
    }

}
