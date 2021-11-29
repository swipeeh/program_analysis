package AbstractSyntaxTree;

public class Tracer {
    private declarationInterface declaration;
    private statementInterface statement;

    public Tracer(declarationInterface decl, statementInterface stat){
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
