package AST.expressions.aexpressions;

public class aValOperator extends aExpressions{
    private Integer val;

    public aValOperator(Integer v){
        this.val = v;
    }
    public Integer getVal(){
        return this.val;
    }
}
