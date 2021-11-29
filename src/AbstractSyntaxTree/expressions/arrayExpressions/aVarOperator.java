package AbstractSyntaxTree.expressions.arrayExpressions;

public class aVarOperator extends aExpressions{
    private String identifier;

    public aVarOperator(String id){
        this.identifier=id;
    }

    public String getIdentifier(){
        return  this.identifier;
    }
}
