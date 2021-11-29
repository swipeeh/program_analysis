package AbstractSyntaxTree.expressions.arrayExpressions;

public class aArithOperator extends aExpressions {

    private aExpressions aExpressions1;
    private aExpressions aExpressions2;
    private String arithOperator;

    public aArithOperator(aExpressions aExpr1, aExpressions aExpr2, String arithOpr){
        this.aExpressions1 = aExpr1;
        this.aExpressions2 = aExpr2;
        this.arithOperator = arithOpr;
    }

    public aExpressions getaExpression1(){
        return this.aExpressions1;
    }
    public aExpressions getaExpression2(){
        return this.aExpressions2;
    }
    public String getArithOperator() {
        return this.arithOperator;
    }
}
