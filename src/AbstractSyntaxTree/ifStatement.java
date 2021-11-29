package AbstractSyntaxTree;


import AbstractSyntaxTree.expressions.arrayExpressions.aExpressions;
import AbstractSyntaxTree.expressions.booleanExpressions.bExpressions;
import AbstractSyntaxTree.expressions.lexpressions.lExpressions;

public class ifStatement extends statementInterface {

    private bExpressions boolExpression;
    private statementInterface statement;

    public ifStatement(bExpressions boolExp, statementInterface sta) {
        this.boolExpression = boolExp;
        this.statement = sta;
    }


    @Override
    public statementInterface statementOne() {return this.statement;}

    @Override
    public statementInterface statementTwo() {return this.statement;}

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
