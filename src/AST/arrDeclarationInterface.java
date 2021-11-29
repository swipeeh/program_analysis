package AST;

import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.lexpressions.lExpressions;

public class arrDeclarationInterface extends declarationInterface {

    private String ident;
    private Integer size;

    public arrDeclarationInterface(String ident, Integer size){
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
    public declarationInterface getFirstDec() {
        return null;
    }

    @Override
    public declarationInterface getSecondDec() {
        return null;
    }
}
