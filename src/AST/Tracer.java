package AST;

import AST.expressions.aexpressions.aExpressions;
import AST.expressions.lexpressions.lExpressions;

public interface Tracer {
    String getidentifier();
    aExpression getAExpression1();
    aExpression getAExpression2();
    lExpression getLExpression();
    Integer getSize();
}
