package AbstractSyntaxTree;

public abstract class statementInterface implements tracerInterface {
    public abstract statementInterface statementOne();

    public abstract statementInterface statementTwo();

    public abstract boolExpression getBoolExpression();

    public boolExpression booleanExpression() {
        return null;
    }

    public String getidentifier() {
        return null;
    }

    public arrExpression getAExpression1() {
        return null;
    }

    public arrExpression getAExpression2() {
        return null;
    }

    public lstExpression getLExpression() {
        return null;
    }

    public Integer getSize() {
        return null;
    }
    //implementation for boolean expressions;


}