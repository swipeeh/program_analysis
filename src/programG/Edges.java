package programG;


import AST.Tracer;
import AST.declaration.Declaration;
import AST.expressions.booleanExpressions.bExpressions;
import AST.statements.Statements;
import org.w3c.dom.Node;

public class Edges {

    private Node beginNode;
    private Tracer tracer;
    private Node endNode;
    private int position;


    public Edges(Node beginNode, Node endNode, Tracer tracer,int position) {
        this.beginNode = beginNode;
        this.endNode = endNode;
        this.tracer = tracer;
        this.position = position;
    }

    public int getId(){
        return this.position;
    }

    public Edges(Declaration decl, Nodes fNode, Nodes lNode) {
    }

    public Edges(Nodes fNode, Nodes tNode, bExpressions boolExpression) {
    }

    public Edges(Statements stat, Nodes fNode, Nodes lNode) {
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
