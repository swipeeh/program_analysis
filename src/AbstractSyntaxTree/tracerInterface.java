package AbstractSyntaxTree;

import AbstractSyntaxTree.expressions.arrayExpressions.aExpressions;
import AbstractSyntaxTree.expressions.lexpressions.lExpressions;

public interface tracerInterface {
    String getidentifier();
    aExpressions getAExpression1();
    aExpressions getAExpression2();
    lExpressions getLExpression();
    Integer getSize();
}
