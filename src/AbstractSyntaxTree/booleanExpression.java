package AbstractSyntaxTree;

public class booleanExpression extends boolExpression {

    private boolean val;

    public booleanExpression(boolean v){
        this.val=v;
    }

    public boolean getVal(){
        return this.val;
    }
}
