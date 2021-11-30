package AbstractSyntaxTree;

public class doubleStatement extends statementInterface {

    private statementInterface statementOne;
    private statementInterface statementTwo;

    public doubleStatement(statementInterface one, statementInterface two) {
        this.statementOne = one;
        this.statementTwo = two;
    }

    public statementInterface getFirstStatement() {
        return this.statementOne;
    }

    public statementInterface getSecondStatement() {
        return this.statementTwo;
    }

    @Override
    public statementInterface statementOne() {
        return null;
    }

    @Override
    public statementInterface statementTwo() {
        return null;
    }

    public boolExpression getBoolExpression() {
        return null;
    }

    public String getIdentifier() {
        return null;
    }

    public lstExpression getlExpression() {
        return null;
    }

    public arrExpression getaExpression() {
        return null;
    }

    public arrExpression getaExpression2() {
        return null;
    }

    public Integer getSize() {
        return null;
    }
}
