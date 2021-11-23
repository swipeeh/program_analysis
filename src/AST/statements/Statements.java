package AST.statements;

import AST.Tracer;
import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.booleanExpressions.bExpressions;
import AST.expressions.lexpressions.lExpressions;

public abstract class Statements implements Tracer {
    public abstract Statements statementOne();

    public abstract Statements statementTwo();

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