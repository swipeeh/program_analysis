package AST.expressions.arrayExpressions;

public class aFirstOperator  extends aExpressions{
    private String identifier;

    public aFirstOperator(String id){
        this.identifier=id;
    }
    public String getIdentifier(){
        return this.identifier;
    }
}