package AbstractSyntaxTree;

public class boolNegativeExpression extends boolExpression {
    private boolExpression blnExpressions;

    public boolNegativeExpression(boolExpression blnExpr){
        this.blnExpressions= blnExpr;
    }

    public boolExpression getBlnExpressions(){
        return this.blnExpressions;
    }
}
