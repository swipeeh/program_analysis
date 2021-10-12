package AST.declaration;
import AST.expressions.aexpressions.aExpressionManager;

public class ArrayDec extends  Declaration {

    private String ident;
    private Integer size;

    public ArrayDec(String ident, Integer size){
        this.ident = id;
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public string getIdentity() {
        return this.id;
    }

    @Override
    public lExpression getLExpression() {return null;}

    @Override
    public aExpression getAExpression() {return null;}

    @Override
    public Declaration getFirstDec() {
        return null;
    }

    @Override
    public Declaration getSecondDec() {
        return null;
    }
}
