package AST;

import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.booleanExpressions.bExpressions;
import AST.expressions.lexpressions.lExpressions;

public class whileStatement extends statementInterface {

    private bExpressions boolExpression;
    private statementInterface statement;

    public whileStatement(bExpressions boolExp, statementInterface sta) {
        this.boolExpression = boolExp;
        this.statement = sta;
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
        return this.boolExpression;
    }

    public statementInterface getFirstStatement() {
        return this.statement;
    }

    public statementInterface getSecondStatement() {
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

    @Override
    public Integer getSize() {
        return null;
    }
}

