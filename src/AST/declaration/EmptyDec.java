package AST.declaration;

public class EmptyDec extends Declaration {

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
