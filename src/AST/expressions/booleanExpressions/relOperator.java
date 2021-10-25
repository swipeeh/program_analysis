package AST.expressions.booleanExpressions;

import AST.expressions.arrayExpressions.aExpressions;

public class relOperator extends bExpressions{

    private aExpressions aExpressions1;
    private aExpressions aExpressions2;
    private String relOpr;

    public relOperator(aExpressions aExpr1,aExpressions aExpr2,String rOp){
        this.aExpressions1=aExpr1;
        this.aExpressions2=aExpr2;
        this.relOpr=rOp;
    }

    public aExpressions getaExpressions1(){
        return this.aExpressions1;
    }
    public aExpressions getaExpressions2(){
        return  this.aExpressions2;
    }

    public String getRelOpr(){
        return this.relOpr;
    }
}
