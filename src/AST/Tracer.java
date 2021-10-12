package AST;

import AST.expressions.aexpressions.aExpressions;
import AST.expressions.lexpressions.lExpressions;

public interface Tracer {
    String getidentifier();
    aExpressions getAExpression1();
    aExpressions getAExpression2();
    lExpressions getLExpression();
    Integer getSize();
}
