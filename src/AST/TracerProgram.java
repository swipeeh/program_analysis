package AST;

import AST.declaration.Declaration;
import AST.statements.Statements;

public class TracerProgram {
    private Declaration declaration;
    private Statements statement;

    public TracerProgram(Declaration decl, Statements stat){
        this.declaration = decl;
        this.statement = stat;
    }

    public Declaration getDeclaration(){
        return this.declaration;
    }

    public Statements getStatement(){
        return this.statement;
    }
}
