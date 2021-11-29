package AST;

public class TracerProgram {
    private declarationInterface declaration;
    private statementInterface statement;

    public TracerProgram(declarationInterface decl, statementInterface stat){
        this.declaration = decl;
        this.statement = stat;
    }

    public declarationInterface getDeclaration(){
        return this.declaration;
    }

    public statementInterface getStatement(){
        return this.statement;
    }
}
