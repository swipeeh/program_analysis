package AST.declaration;

public class ArrayDec extends Declaration {

    private String id;
    private Integer size;

    public ArrayDec(String id, Integer size){
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public Integer getSize() {
        return size;
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
