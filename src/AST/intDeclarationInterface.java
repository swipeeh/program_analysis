package AST;

import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.lexpressions.lExpressions;

public class intDeclarationInterface extends declarationInterface {

    private String id;

    public intDeclarationInterface(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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
    public declarationInterface getFirstDec() {
        return null;
    }

    @Override
    public declarationInterface getSecondDec() {
        return null;
    }
}
