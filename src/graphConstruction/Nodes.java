package graphConstruction;

import AbstractSyntaxTree.declarationInterface;
import AbstractSyntaxTree.arrExpression;
import AbstractSyntaxTree.lstExpression;

public class Nodes {

    public int position;

    public Nodes(Integer position){
        this.position = position;
    }

    public Nodes(declarationInterface decl, Nodes fNode, Nodes lNode) {}

    public Integer getId(){return this.position;}

    public void setId(int position){
        this.position = position;
    }


    public String getidentifier() {
        return null;
    }


    public arrExpression getAExpression1() {
        return null;
    }


    public arrExpression getAExpression2() {
        return null;
    }


    public lstExpression getLExpression() {
        return null;
    }


    public Integer getSize() {
        return null;
    }

    public declarationInterface getFirstDec() {
        return null;
    }

    public declarationInterface getSecondDec() {
        return null;
    }
}
