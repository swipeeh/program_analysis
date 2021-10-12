package AST;

import AST.declaration.Declaration;

public class TracerProgram {
    private Declaration declaration;
    private Statement statement;

    public TracerProgram(Declaration decl, Statement stat){
        this.declaration = decl;
        this.statement = stat;
    }

    public Declaration getDeclaration(){
        return this.declaration;
    }

    public Statement getStatement(){
        return this.statement;
    }
}
