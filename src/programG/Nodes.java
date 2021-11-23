package programG;

import AST.declaration.Declaration;
import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.lexpressions.lExpressions;

public class Nodes extends Declaration {

    public int position;

    public Nodes(int position){
        this.position = position;
    }

    public Nodes(Declaration decl, Nodes fNode, Nodes lNode) {}

    public int getId(){
        return this.position;
    }

    public void setId(int position){
        this.position = position;
    }

    @Override
    public String getidentifier() {
        return null;
    }

    @Override
    public aExpressions getAExpression1() {
        return null;
    }

    @Override
    public aExpressions getAExpression2() {
        return null;
    }

    @Override
    public lExpressions getLExpression() {
        return null;
    }

    @Override
    public Integer getSize() {
        return null;
    }

    @Override
    public Declaration getFirstDec() {
        return null;
    }

    @Override
    public Declaration getSecondDec() {
        return null;
    }
}
