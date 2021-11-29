package AbstractSyntaxTree;
import AbstractSyntaxTree.expressions.arrayExpressions.aExpressions;
import AbstractSyntaxTree.expressions.lexpressions.lExpressions;

public class doubleDeclaration extends declarationInterface {
    private declarationInterface firstDec;
    private declarationInterface secondDec;

    public doubleDeclaration(declarationInterface firstDec, declarationInterface secondDec) {
        this.firstDec = firstDec;
        this.secondDec = secondDec;
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
