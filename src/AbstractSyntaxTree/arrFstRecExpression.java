package AbstractSyntaxTree;

public class arrFstRecExpression extends arrExpression {
    private String identifier;

    public arrFstRecExpression(String id){
        this.identifier=id;
    }
    public String getIdentifier(){
        return this.identifier;
    }
}
