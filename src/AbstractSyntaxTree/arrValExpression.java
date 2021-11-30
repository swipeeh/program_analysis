package AbstractSyntaxTree;

public class arrValExpression extends arrExpression {
    private int val;

    public arrValExpression(int v){
        this.val = v;
    }
    public int getVal(){
        return this.val;
    }
}
