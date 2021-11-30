package AbstractSyntaxTree;

public class arrSecRecExpression extends arrExpression {
    private String identifier;

    public arrSecRecExpression(String id){
        this.identifier = id;
    }
    public String getIdentifier(){
        return this.identifier;
    }
}
