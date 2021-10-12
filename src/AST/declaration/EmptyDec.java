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
}
