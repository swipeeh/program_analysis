package AST.declaration;
import AST.expressions.aexpressions.aExpressionManager;

public class DoubleDec extends Declaration {
    private Declaration firstDec;
    private Declaration secondDec;

    public DoubleDec(Declaration firstDec, Declaration secondDec) {
        this.firstDec = firstDec;
        this.secondDec = secondDec;
    }

    @Override
    public Declaration getFirstDec() {
        return firstDec;
    }

    @Override
    public Declaration getSecondDec() {
        return secondDec;
    }


    @java.lang.Override
    public integer getSize() {
        return null;
    }

    @java.lang.Override
    public string getIdentity() {
        return null;
    }

    @java.lang.Override
    public lExpression getLExpression() {
        return null;
    }

    @java.lang.Override
    public aExpression getAExpression() {
        return null;
    }
}
