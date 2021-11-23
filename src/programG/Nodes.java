package programG;

import AST.declaration.Declaration;

public class Nodes {

    public int position;

    public Nodes(int position){
        this.position = position;
    }

    public Nodes(Declaration decl, Nodes fNode, Nodes lNode) {}

    public int getId(){
        return this.position;
    }

    public void setId(int position){
        this.position = position;
    }
}
