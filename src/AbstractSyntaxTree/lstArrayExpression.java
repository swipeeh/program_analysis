package AbstractSyntaxTree;

public class lstArrayExpression extends lstExpression {
    protected String identifier;


    public lstArrayExpression(arrExpression expL5, String a) {

    }

    @Override
    public String getIdentifier(){
        return this.identifier;
    }
}
