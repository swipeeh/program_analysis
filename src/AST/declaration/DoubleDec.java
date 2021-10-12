package AST.declaration;

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


}
