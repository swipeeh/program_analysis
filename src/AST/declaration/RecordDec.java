package AST.declaration;

public class RecordDec extends Declaration{

    private String id;

    public RecordDec(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public Declaration getFirstDec() {
        return null;
    }

    @Override
    public Declaration getSecondDec() {
        return null;
    }

    @Override
    public integer getSize() {
        return null;
    }

    @Override
    public string getIdentity() {
        return null;
    }

    @Override
    public lExpression getLExpression() {
        return null;
    }

    @Override
    public aExpression getAExpression() {
        return null;
    }
}
