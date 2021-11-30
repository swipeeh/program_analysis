package AbstractSyntaxTree;

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
    public boolExpression getBoolExpression() {
        return null;
    }
}
