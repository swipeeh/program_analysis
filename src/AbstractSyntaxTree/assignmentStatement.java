package AbstractSyntaxTree;

import AbstractSyntaxTree.expressions.Expressions;
import AbstractSyntaxTree.expressions.booleanExpressions.bExpressions;

public class assignmentStatement extends statementInterface {

        Expressions first;
        Expressions second;

        public assignmentStatement(Expressions first, Expressions second) {
            this.first = first;
            this.second = second;
        }

    @Override
    public statementInterface statementOne() {
        return null;
    }

    @Override
    public statementInterface statementTwo() {
        return null;
    }

    @Override
    public bExpressions getBoolExpression() {
        return null;
    }
}
