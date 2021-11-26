package Analyses;


import programG.Edges;
import programG.Nodes;
import programG.controlFlow;
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
    
    public HashMap<Integer, ArrayList<ArrayList<String>>> getAnalysisSet() {
       return this.analysisSet;
    }
    
    public void updateAnalysisSet(Integer l, ArrayList<ArrayList<String>> nSolution) {
        for(ArrayList<String> aList : nSolution){
            if(!this.analysisSet.get(l).contains(aList)){this.analysisSet.get(l).add(aList);}}}
    
    public HashMap<Integer, ArrayList<Integer>> getInfl() {return this.infl;}
    
    public ArrayList<ArrayList<String>> newConstraint(Integer l) {
        ArrayList<ArrayList<String>> r = new ArrayList<>();
        if(l!=0){
            for(Edges e : getControlFlowAnalysis().edgesList){
                if(l == e.getEndNode().getId()){
                    ArrayList<ArrayList<String>> t =
                            (ArrayList<ArrayList<String>>) analysisSet.get(e.getBeginNode().getId()).clone();
                    t.removeAll(kill(e,analysisSet.get(e.getBeginNode().getId())));


                }
            }
        }
        return r;
    }



    @Override
    public controlFlow getControlFlowAnalysis() {
        return null;
    }
}
