package AST.statements;

import AST.expressions.Expressions;

public class AssignmentEvent extends Statements {

        Expressions first;
        Expressions second;

        public AssignmentEvent(Expressions first, Expressions second) {
            this.first = first;
            this.second = second;
        }
}
