package AbstractSyntaxTree;

public class doubleDeclaration extends declarationInterface {
    private declarationInterface firstDec;
    private declarationInterface secondDec;

    public doubleDeclaration(declarationInterface firstDec, declarationInterface secondDec) {
        this.firstDec = firstDec;
        this.secondDec = secondDec;
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
