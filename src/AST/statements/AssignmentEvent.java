package AST.statements;

import AST.expressions.Expressions;
import AST.expressions.booleanExpressions.bExpressions;

public class AssignmentEvent extends Statements {

        Expressions first;
        Expressions second;

        public AssignmentEvent(Expressions first, Expressions second) {
            this.first = first;
            this.second = second;
        }

    @Override
    public Statements statementOne() {
        return null;
    }

    @Override
    public Statements statementTwo() {
        return null;
    }

    @Override
    public bExpressions getBoolExpression() {
        return null;
    }
}
