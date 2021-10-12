package AST.declaration;

import AST.Tracer;

public abstract class Declaration implements Tracer {

    public abstract Declaration getFirstDec();
    public abstract Declaration getSecondDec();

}
