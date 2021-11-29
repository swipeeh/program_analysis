package graphConstruction;


import AbstractSyntaxTree.tracerInterface;
import AbstractSyntaxTree.declarationInterface;
import AbstractSyntaxTree.expressions.booleanExpressions.bExpressions;
import AbstractSyntaxTree.statementInterface;
public class Edges {

    private Nodes beginNode;
    private tracerInterface tracer;
    private Nodes endNode;
    private int position;


    public Edges(Nodes beginNode, Nodes endNode, tracerInterface tracer, int position) {
        this.beginNode = beginNode;
        this.endNode = endNode;
        this.tracer = tracer;
        this.position = position;}

    public Edges(declarationInterface decl, Nodes fNode, Nodes lNode) {}

    public Edges(Nodes fNode, Nodes tNode, bExpressions boolExpression) {}

    public Edges(statementInterface stat, Nodes fNode, Nodes lNode) {}

    public Nodes getBeginNode() {return beginNode;}

    public Nodes getEndNode() {return endNode;}

    public void setBeginNode(Nodes beginNode) {this.beginNode = beginNode;}

    public tracerInterface getTracer(){
        return this.tracer;
    }

    public void setEndNode(Nodes endNode) {this.endNode = endNode;}

}
