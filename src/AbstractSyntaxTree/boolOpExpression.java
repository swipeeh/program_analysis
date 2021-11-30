package AbstractSyntaxTree;

public class boolOpExpression extends boolExpression {
    private arrExpression aExpression1;
    private arrExpression arrExpression2;
    private String blnOperator;

    public boolOpExpression(arrExpression aExpr1, arrExpression aExpr2, String blnOP){
        this.aExpression1=aExpr1;
        this.arrExpression2 =aExpr2;
        this.blnOperator=blnOP;
    }
}
