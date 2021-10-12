package AST.declaration;

public class IntegerDec extends Declaration{

    private String id;

    public IntegerDec(String id) {
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
}
