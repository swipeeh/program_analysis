package AbstractSyntaxTree;

public class arrVarExpression extends arrExpression {
    private String identifier;

    public arrVarExpression(String id){
        this.identifier=id;
    }

    public String getIdentifier(){
        return  this.identifier;
    }
}
