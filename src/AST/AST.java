package AST;

import java.util.ArrayList;

public class AST {

    private int value;
    private AST leftNode;
    private AST rightNode;
    private ArrayList<AST> children = new ArrayList<>();
    private AST parent = null;


    public AST(int value) {

    }



}
