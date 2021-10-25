package AST.expressions.arrayExpressions;

public class aValOperator extends aExpressions{
    private Integer val;

    public aValOperator(Integer v){
        this.val = v;
    }
    public Integer getVal(){
        return this.val;
    }
}
