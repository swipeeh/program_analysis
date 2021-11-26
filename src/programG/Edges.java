package programG;


import AST.Tracer;
import AST.declaration.Declaration;
import AST.expressions.booleanExpressions.bExpressions;
import AST.statements.Statements;
public class Edges {

    private Nodes beginNode;
    private Tracer tracer;
    private Nodes endNode;
    private int position;


    public Edges(Nodes beginNode, Nodes endNode, Tracer tracer,int position) {
        this.beginNode = beginNode;
        this.endNode = endNode;
        this.tracer = tracer;
        this.position = position;}

    public Edges(Declaration decl, Nodes fNode, Nodes lNode) {}

    public Edges(Nodes fNode, Nodes tNode, bExpressions boolExpression) {}

    public Edges(Statements stat, Nodes fNode, Nodes lNode) {}

    public Nodes getBeginNode() {return beginNode;}

    public Nodes getEndNode() {return endNode;}

    public void setBeginNode(Nodes beginNode) {this.beginNode = beginNode;}

    public Tracer getTracer(){
        return this.tracer;
    }

    public void setEndNode(Nodes endNode) {this.endNode = endNode;}

}
