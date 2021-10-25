package AST.expressions.arrayExpressions;

public class aArrOperator  extends aExpressions{
    private String identifier;
    private aExpressions aExpressions1;

    public aArrOperator(String id, aExpressions aExpr1){
        this.identifier = id;
        this.aExpressions1  = aExpr1;
    }
    public String getIdentifier(){
        return this.identifier;
    }
    public aExpressions getaExpressions1(){
        return this.aExpressions1;
    }
}
