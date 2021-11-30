package AbstractSyntaxTree;

public class aArrExpression extends arrExpression {
    private String identifier;
    private arrExpression arrExpression1;

    public aArrExpression(String id, arrExpression aExpr1){
        this.identifier = id;
        this.arrExpression1 = aExpr1;
    }
    public String getIdentifier(){
        return this.identifier;
    }
    public arrExpression getaExpressions1(){
        return this.arrExpression1;
    }
}
