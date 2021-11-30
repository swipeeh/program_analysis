package AbstractSyntaxTree;

public class arrArithExpression extends arrExpression {

    private arrExpression arrExpression1;
    private arrExpression arrExpression2;
    private String arithOperator;

    public arrArithExpression(arrExpression aExpr1, arrExpression aExpr2, String arithOpr){
        this.arrExpression1 = aExpr1;
        this.arrExpression2 = aExpr2;
        this.arithOperator = arithOpr;
    }

    public arrExpression getaExpression1(){
        return this.arrExpression1;
    }
    public arrExpression getaExpression2(){
        return this.arrExpression2;
    }
    public String getArithOperator() {
        return this.arithOperator;
    }
}
