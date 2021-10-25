package AST.expressions.booleanExpressions;
import AST.expressions.arrayExpressions.aExpressions;

public class bOperator extends bExpressions{
    private aExpressions aExpression1;
    private aExpressions aExpressions2;
    private String blnOperator;

    public bOperator(aExpressions aExpr1,aExpressions aExpr2,String blnOP){
        this.aExpression1=aExpr1;
        this.aExpressions2=aExpr2;
        this.blnOperator=blnOP;
    }
}
