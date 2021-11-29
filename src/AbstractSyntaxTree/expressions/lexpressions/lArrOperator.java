package AbstractSyntaxTree.expressions.lexpressions;

import AbstractSyntaxTree.expressions.arrayExpressions.aExpressions;

public class lArrOperator extends lExpressions{
    protected String identifier;


    public lArrOperator(aExpressions expL5, String a) {

    }

    @Override
    public String getIdentifier(){
        return this.identifier;
    }
}
