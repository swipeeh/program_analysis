package AbstractSyntaxTree;

import AbstractSyntaxTree.expressions.arrayExpressions.aExpressions;
import AbstractSyntaxTree.expressions.booleanExpressions.bExpressions;
import AbstractSyntaxTree.expressions.lexpressions.lExpressions;

public class doubleStatement extends statementInterface {

    private statementInterface statementOne;
    private statementInterface statementTwo;

    public doubleStatement(statementInterface one, statementInterface two) {
        this.statementOne = one;
        this.statementTwo = two;
    }

    public statementInterface getFirstStatement() {
        return this.statementOne;
    }

    public statementInterface getSecondStatement() {
        return this.statementTwo;
    }

    @Override
    public statementInterface statementOne() {
        return null;
    }

    @Override
    public statementInterface statementTwo() {
        return null;
    }

    public bExpressions getBoolExpression() {
        return null;
    }

    public String getIdentifier() {
        return null;
    }

    public lExpressions getlExpression() {
        return null;
    }

    public aExpressions getaExpression() {
        return null;
    }

    public aExpressions getaExpression2() {
        return null;
    }

    public Integer getSize() {
        return null;
    }
}
