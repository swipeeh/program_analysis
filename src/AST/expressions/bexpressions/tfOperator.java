package AST.expressions.bexpressions;

public class tfOperator extends bExpressions{

    private boolean val;

    public tfOperator(boolean v){
        this.val=v;
    }

    public boolean getVal(){
        return this.val;
    }
}
