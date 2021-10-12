package AST.expressions.bexpressions;

public class norOperator extends bExpressions{
    private bExpressions blnExpressions;

    public norOperator(bExpressions blnExpr){
        this.blnExpressions= blnExpr;
    }

    public bExpressions getBlnExpressions(){
        return this.blnExpressions;
    }
}
