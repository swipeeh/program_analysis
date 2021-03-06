package Analyses;


import graphConstruction.Edges;
import graphConstruction.Nodes;
import graphConstruction.controlFlow;
import java.util.ArrayList;
import java.util.HashMap;

public class reachingDefinitions implements Analysis{

    public HashMap<Integer,ArrayList<ArrayList<String>>> analysisSet;
    public controlFlow ControlFlowAnalysis;
    public HashMap<Integer,ArrayList<Integer>> infl;

    public reachingDefinitions(controlFlow ControlFlowAnalysis){
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

    //return the whole analysisSet
    @Override
    public HashMap<Integer, ArrayList<ArrayList<String>>> getAnalysisSet() {
       return this.analysisSet;
    }

    //inserting updated nodes into analysis set
    @Override
    public void updateAnalysisSet(Integer l, ArrayList<ArrayList<String>> nSolution) {
        for(ArrayList<String> aList : nSolution){
            if(!this.analysisSet.get(l).contains(aList)){this.analysisSet.get(l).add(aList);}}}

    //Method which creates the constraint
    @Override
    public ArrayList<ArrayList<String>> newConstraint(Integer l) {
        ArrayList<ArrayList<String>> r = new ArrayList<>();
        if(l!=0){
            for(Edges e : getControlFlowAnalysis().edgesList){
                if(l == e.getEndNode().getId()){
                    ArrayList<ArrayList<String>> t =
                            (ArrayList<ArrayList<String>>) analysisSet.get(e.getBeginNode().getId());
                    t.removeAll(kNode(e,analysisSet.get(e.getBeginNode().getId())));
                    t.addAll(gNode(e));
                    for(ArrayList<String> aList : t){
                        if(r.contains(0)){
                            r.add(aList);}}}}
        }
        else{
            for(Edges e : ControlFlowAnalysis.edgesList){
                if(l ==0){
                    for(String var : ControlFlowAnalysis.varList){
                        ArrayList<String> t = new ArrayList<>();
                        t.add(var);
                        t.add(l.toString());
                        r.add(t);}}}
        }
        return r;
    }

    //Method for removing Node from set.
    public ArrayList<ArrayList<String>> kNode(Edges e, ArrayList<ArrayList<String>> reachingDefinitionsElement){
        ArrayList<ArrayList<String>> r = new ArrayList<>();
        if(e.getTracer().getClass().getName().equals("AbstractSyntaxTree.intDeclaration") || e.getTracer().getClass().getName().equals("AbstractSyntaxTree.arrDeclaration")) {
            ArrayList<String> t = new ArrayList<>();
            t.add(e.getTracer().getidentifier());
            t.add("0");
            r.add(t);
        }
        else if(e.getTracer().getClass().getName().equals("AbstractSyntaxTree.rDeclaration")){
            ArrayList<String> t = new ArrayList<>();
            t.add(e.getTracer().getidentifier() +"FST");
            t.add("0");
            r.add(t);
            ArrayList<String> t2 = new ArrayList<>();
            t2.add(e.getTracer().getidentifier() +"SND");
            t2.add("0");
            r.add(t2);
        }
        else if (e.getTracer().getClass().getName().equals("AbstractSyntaxTree.statements.RecordAssignment")){
            for(ArrayList<String> sArray : reachingDefinitionsElement){
                for(String s : sArray){
                    if(s.equals(e.getTracer().getidentifier()+"FST")){r.add(sArray);}
                    else if(s.equals(e.getTracer().getidentifier()+"SND")){r.add(sArray);}}}}
        return r;
    }
    //Method for generating - adding new nodes into the set
    public ArrayList<ArrayList<String>> gNode(Edges e){
        ArrayList<ArrayList<String>> r = new ArrayList<>();
        if(e.getTracer().getClass().getName().equals("AbstractSyntaxTree.intDeclaration")){
        ArrayList<String> t = new ArrayList<>();
            t.add(e.getTracer().getidentifier() +"FST");
            t.add(e.getBeginNode().getId().toString());
            t.add(e.getEndNode().getId().toString());
            r.add(t);
        ArrayList<String> t2 = new ArrayList<>();
            t2.add(e.getTracer().getidentifier() +"SND");
            t2.add(e.getBeginNode().getId().toString());
            t2.add(e.getEndNode().getId().toString());
            r.add(t2);
        }
        else if(e.getTracer().getClass().getName().equals("AbstractSyntaxTree.assignmentStatement")){
            ArrayList<String> t = new ArrayList<>();
            t.add(e.getTracer().getLExpression().getidentifier());
            t.add(e.getBeginNode().getId().toString());
            t.add(e.getEndNode().getId().toString());
            r.add(t);
        }
        return r;
    }

    @Override
    public controlFlow getControlFlowAnalysis() {return this.getControlFlowAnalysis();}
    @Override
    public HashMap<Integer, ArrayList<Integer>> getInfl() {return this.infl;}
}
