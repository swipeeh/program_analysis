package graphConstruction;

import java.util.ArrayList;
import AbstractSyntaxTree.Tracer;
import AbstractSyntaxTree.declarationInterface;
import AbstractSyntaxTree.statementInterface;
import java.util.List;


public class controlFlow {
    public List<Edges> edgesList;
    public List<Nodes> nodesList;
    public List<String> varList;

    public controlFlow(List<Edges> edgesList, List<Nodes> nodesList, List<String> varList) {
        this.edgesList = new ArrayList<>();
        this.nodesList = new ArrayList<>();
        this.varList = new ArrayList<>();
    }

    public void setVarList(List<String> varList) {
        this.varList = varList;
    }

    public int getLastPosition(){
        int last = 0;
        for(Nodes nodes : nodesList){
            if(nodes.getId() > last){
                last = nodes.getId();
            }
        }
        return last;
    }

    public int getTop() {
        int top = 0;
        for (Nodes node : nodesList) {
            if (node.getId() > top) {
                top = node.getId();
            }
        }
        return top;
    }

    public Nodes edgeDec(declarationInterface decl, Nodes fNode, Nodes lNode) {
        Edges tEdge = new Edges(decl, fNode, lNode);
        Nodes tNode = new Nodes(decl, fNode, lNode);
        Nodes nNode = new Nodes(decl, fNode, lNode);

        if (decl.getClass().getName().equals("AbstractSyntaxTree.Declaration.intDeclaration")) {
            this.edgesList.add(tEdge);
        } else if (decl.getClass().getName().equals("AbstractSyntaxTree.Declaration.rDeclaration")) {
            this.edgesList.add(tEdge);
        } else if (decl.getClass().getName().equals("AbstractSyntaxTree.Declaration.arrDeclaration")) {
            this.edgesList.add(tEdge);
        } else if (decl.getSecondDec().getClass().equals("AbstractSyntaxTree.Declaration.doubleDeclaration")) {
            this.nodesList.add(tNode);
            {
                edgeDec(decl.getFirstDec(), fNode, tNode);
                if (decl.getSecondDec().getClass().getName().equals("AbstractSyntaxTree.doubleDeclaration")) {
                    edgeDec(decl.getSecondDec(), tNode, nNode);
                    return nNode;
                }
                if (!decl.getSecondDec().getClass().getName().equals("AbstractSyntaxTree.Declataion.doubleDeclaration")) {
                    edgeDec(decl.getSecondDec(), tNode, nNode);
                    return lNode;
                }
            }
            if (decl.getClass().getName().equals("AbstractSyntaxTree.eDeclaration")) {/*should not retrieve anything*/}
            }
        return null;
    }


    public void edgesStatement(statementInterface stat, Nodes fNode, Nodes lNode){
        if(stat.getClass().getName().equals("AbstractSyntaxTree.statementInterface.assignmentStatement")){
            Edges tEdge = new Edges(stat, fNode, lNode);
            this.edgesList.add(tEdge);
        }
        else if(stat.getClass().getName().equals("AbstractSyntaxTree.statementInterface.eStatement")){/*should not retrieve anything*/}
        else if(stat.getClass().getName().equals("AbstractSyntaxTree.statementInterface.ifStatement")){
            Nodes tNode = new Nodes(fNode.getId()+1);
            this.nodesList.add(tNode);
            Edges tEdge = new Edges(fNode,tNode, stat.getBoolExpression());
            this.edgesList.add(tEdge);
            edgesStatement(stat.statementOne(),tNode,lNode);
        }
        else if(stat.getClass().getName().equals("AbstractSyntaxTree.statementInterface.whileStatement")){
            Nodes tNode = new Nodes(fNode.getSize()+1);
            this.nodesList.add(tNode);
            Edges tEdge = new Edges(fNode,tNode,stat.getBoolExpression());
            this.edgesList.add(tEdge);
            edgesStatement(stat.statementOne(),tNode,fNode);
        }
    }



    public void newProgramGraph(Tracer program) {
        Nodes fNode = new Nodes(0);
        Nodes lNode = new Nodes(2);
        this.nodesList.add(fNode);
        lNode = edgeDec(program.getDeclaration(), fNode, lNode);
        this.nodesList.add(lNode);
        Nodes tNode = new Nodes(-1);
        edgesStatement(program.getStatement(), lNode, tNode);
        this.nodesList.add(tNode);
    }

    public void print(){
        for(Edges edges : this.edgesList){
            System.out.println(edges.getBeginNode() + edges.getTracer().getClass().getName() + edges.getEndNode());
        }
    }
}