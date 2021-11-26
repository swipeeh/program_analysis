package programG;

import AST.declaration.Declaration;
import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.lexpressions.lExpressions;

public class Nodes {

    public int position;

    public Nodes(Integer position){
        this.position = position;
    }

    public Nodes(Declaration decl, Nodes fNode, Nodes lNode) {}

    public Integer getId(){return this.position;}

    public void setId(int position){
        this.position = position;
    }


    public String getidentifier() {
        return null;
    }


    public aExpressions getAExpression1() {
        return null;
    }


    public aExpressions getAExpression2() {
        return null;
    }


    public lExpressions getLExpression() {
        return null;
    }


    public Integer getSize() {
        return null;
    }

    public Declaration getFirstDec() {
        return null;
    }

    public Declaration getSecondDec() {
        return null;
    }
}
