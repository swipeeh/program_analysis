package AbstractSyntaxTree;

public class intDeclaration extends declarationInterface {

    private String id;

    public intDeclaration(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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

    @Override
    public Integer getSize() {
        return null;
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
