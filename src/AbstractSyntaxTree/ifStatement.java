package AbstractSyntaxTree;


public class ifStatement extends statementInterface {

    private AbstractSyntaxTree.boolExpression boolExpression;
    private statementInterface statement;

    public ifStatement(AbstractSyntaxTree.boolExpression boolExp, statementInterface sta) {
        this.boolExpression = boolExp;
        this.statement = sta;
    }


    @Override
    public statementInterface statementOne() {return this.statement;}

    @Override
    public statementInterface statementTwo() {return this.statement;}

    public AbstractSyntaxTree.boolExpression getBoolExpression() {
        return this.boolExpression;
    }


    public statementInterface getFirstStatement() {
        return this.statement;
    }


    public statementInterface getSecondStatement() {
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

    @Override
    public Integer getSize() {
        return null;
    }
}
