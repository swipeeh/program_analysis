package AbstractSyntaxTree;

public class boolRelationsExpression extends boolExpression {

    private arrExpression arrExpression1;
    private arrExpression arrExpression2;
    private String relOpr;

    public boolRelationsExpression(arrExpression aExpr1, arrExpression aExpr2, String rOp){
        this.arrExpression1 =aExpr1;
        this.arrExpression2 =aExpr2;
        this.relOpr=rOp;
    }

    public arrExpression getaExpressions1(){
        return this.arrExpression1;
    }
    public arrExpression getaExpressions2(){
        return  this.arrExpression2;
    }

    public String getRelOpr(){
        return this.relOpr;
    }
}
