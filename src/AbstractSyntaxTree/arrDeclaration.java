package AbstractSyntaxTree;

public class arrDeclaration extends declarationInterface {

    private String ident;
    private Integer size;

    public arrDeclaration(String ident, Integer size){
        this.ident = ident;
        this.size = size;
    }

    @Override
    public String getidentifier() {
        return null;
    }

    @Override
    public arrExpression getAExpression1() {
        return null;
    }

    @Override
    public arrExpression getAExpression2() {
        return null;
    }

    @Override
    public lstExpression getLExpression() {
        return null;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public declarationInterface getFirstDec() {
        return null;
    }

    @Override
    public declarationInterface getSecondDec() {
        return null;
    }
}
