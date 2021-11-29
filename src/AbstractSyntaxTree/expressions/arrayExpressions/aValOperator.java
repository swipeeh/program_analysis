package AbstractSyntaxTree.expressions.arrayExpressions;

public class aValOperator extends aExpressions{
    private int val;

    public aValOperator(int v){
        this.val = v;
    }
    public int getVal(){
        return this.val;
    }
}
