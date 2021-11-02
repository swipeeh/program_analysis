package AST.statements;

import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.booleanExpressions.bExpressions;
import AST.expressions.lexpressions.lExpressions;

public class WhileStatements extends Statements {

    private bExpressions boolExpression;
    private Statements statement;

    public WhileStatements(bExpressions boolExp, Statements sta) {
        this.boolExpression = boolExp;
        this.statement = sta;
    }


    public bExpressions getBoolExpression() {
        return this.boolExpression;
    }

    public Statements getFirstStatement() {
        return this.statement;
    }

    public Statements getSecondStatement() {
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

