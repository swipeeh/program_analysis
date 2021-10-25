package AST.statements;

import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.booleanExpressions.bExpressions;
import AST.expressions.lexpressions.lExpressions;

public class DoubleStatements extends Statements {

    private Statements statementOne;
    private Statements statementTwo;

    public DoubleStatements(Statements one, Statements two) {
        this.statementOne = one;
        this.statementTwo = two;
    }

    public Statements getFirstStatement() {
        return this.statementOne;
    }

    public Statements getSecondStatement() {
        return this.statementTwo;
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
