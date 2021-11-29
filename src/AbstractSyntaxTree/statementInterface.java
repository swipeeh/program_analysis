package AbstractSyntaxTree;

import AbstractSyntaxTree.expressions.arrayExpressions.aExpressions;
import AbstractSyntaxTree.expressions.booleanExpressions.bExpressions;
import AbstractSyntaxTree.expressions.lexpressions.lExpressions;

public abstract class statementInterface implements tracerInterface {
    public abstract statementInterface statementOne();

    public abstract statementInterface statementTwo();

    public abstract bExpressions getBoolExpression();

    public bExpressions booleanExpression() {
        return null;
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
    //implementation for boolean expressions;


}