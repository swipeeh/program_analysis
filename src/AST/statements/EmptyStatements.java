package AST.statements;

import AST.expressions.arrayExpressions.aExpressions;
import AST.expressions.booleanExpressions.bExpressions;
import AST.expressions.lexpressions.lExpressions;

public class EmptyStatements extends Statements {
    public Statements getFirstStatement() {
        return null;
    }

    public Statements getSecondStatement() {
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

