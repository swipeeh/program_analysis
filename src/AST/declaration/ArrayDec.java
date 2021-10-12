package AST.declaration;

import AST.expressions.aexpressions.aExpressions;
import AST.expressions.lexpressions.lExpressions;

public class ArrayDec extends  Declaration {

    private String ident;
    private Integer size;

    public ArrayDec(String ident, Integer size){
        this.ident = ident;
        this.size = size;
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

    public Integer getSize() {
        return size;
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
