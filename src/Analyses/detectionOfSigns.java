package Analyses;

import AbstractSyntaxTree.expressions.arrayExpressions.aExpressions;
import graphConstruction.Edges;
import graphConstruction.Nodes;
import graphConstruction.controlFlow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class detectionOfSigns implements Analysis{

    public HashMap<Integer, ArrayList<ArrayList<String>>> analysisSet;
    public controlFlow ControlFlowAnalysis;
    public HashMap<Integer,ArrayList<Integer>> infl;

    public ArrayList<String> signed(aExpressions aExpression, ArrayList<String> detectionOfSignsElement){

    }

    public ArrayList<ArrayList<String>> changePosition(Edges e, ArrayList<ArrayList<String>> detectionOfSignsElement){
        ArrayList<ArrayList<String>> r = new ArrayList<>();
        ArrayList<String> t = new ArrayList<>();
        if(e.getTracer().getClass().getName().equals("AbstractSyntaxTree.arrDeclaration")){
            for(ArrayList<String>  arrayList : detectionOfSignsElement){
                if(arrayList.contains(0)) {r.add(arrayList);}
            }
            if(e.getTracer().getSize()<0){r.clear();}
            else{t.add(e.getTracer().getidentifier());t.add("");r.add(t);}
        }
        else if(e.getTracer().getClass().getName().equals("AbstractSyntaxTree.intDeclaration")){
            t.add(e.getTracer().getidentifier());
            t.add("");
            for(ArrayList<String> arrayList : detectionOfSignsElement){
                if(arrayList.contains(0)){r.add(arrayList);}}
            r.add(t);
        }
        else if(e.getTracer().getClass().getName().equals("AbstractSyntaxTree.assignmentStatement")){
            if(e.getTracer().getLExpression().getClass().getName().equals("AbstractSyntaxTree.expressions.lexpressions.lArrOperator")){
                if(si)
            }
        }
        return r;
    }

    public detectionOfSigns( controlFlow controlFlowAnalysis){
        this.ControlFlowAnalysis =ControlFlowAnalysis;
        initialize();
    }
    //This method is being used to create all necessary lists and variables which will be used in new analysis set.
    public void initialize(){
        this.analysisSet = new HashMap<>();
        this.infl = new HashMap<>();
        for (int i = 0; i< ControlFlowAnalysis.nodesList.size()-1; i++){
            ArrayList<ArrayList<String>> t = new ArrayList<>();
            this.analysisSet.put(i,t);
            ArrayList<Integer> t2 = new ArrayList<>();
            this.infl.put(i,t2);
        }
        this.analysisSet.put(-1, new ArrayList<>());
        this.infl.put(-1, new ArrayList<Integer>());

        for (Nodes n : ControlFlowAnalysis.nodesList){
            for(Edges e : ControlFlowAnalysis.edgesList){
                if(n.equals(e.getBeginNode())){this.infl.get(n.getId()).add(e.getEndNode().getId());}}}}
    @Override
    public HashMap<Integer, ArrayList<ArrayList<String>>> getAnalysisSet() {return this.analysisSet;}

    @Override
    public void updateAnalysisSet(Integer l, ArrayList<ArrayList<String>> nSolution) {
        for(ArrayList<String> arrayList : nSolution){
            if(this.analysisSet.get(l).contains(arrayList)){System.out.println("Full");}
            else{this.analysisSet.get(l).add(arrayList);}}}

    @Override
    public ArrayList<ArrayList<String>> newConstraint(Integer l) {
        ArrayList<ArrayList<String>> r = new ArrayList<>();
        if(l!=0) {
            for (String var : ControlFlowAnalysis.varList) {
                ArrayList<String> t = new ArrayList<>();t.add(var);t.add(".");r.add(t);
                ArrayList<String> t2 = new ArrayList<>();t2.add(var);t2.add(".");r.add(t2);
                ArrayList<String> t3 = new ArrayList<>();t3.add(var);t3.add(".");r.add(t3);
            }
        }
        else{
            for(Edges e : ControlFlowAnalysis.edgesList){
                if(l == e.getEndNode().getId()){
                    //arrayList needs to be initialized differently
                    ArrayList<String> t = new ArrayList<>();
                    for(ArrayList<String> arrayList : t){
                        if(!r.contains(arrayList)){
                            r.add(arrayList);}}}}}
        return r;
    }

    @Override
    public controlFlow getControlFlowAnalysis() {return this.getControlFlowAnalysis();}
    @Override
    public HashMap<Integer, ArrayList<Integer>> getInfl() {return this.infl;}
}
