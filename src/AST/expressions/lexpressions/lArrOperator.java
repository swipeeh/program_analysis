package AST.expressions.lexpressions;

import AST.expressions.arrayExpressions.aExpressions;

public class lArrOperator extends lExpressions{
    protected String identifier;


    public lArrOperator(aExpressions expL5, String a) {

    }

    @Override
    public String getIdentifier(){
        return this.identifier;
    }
}
