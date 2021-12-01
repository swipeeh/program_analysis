package Analyses;
import graphConstruction.controlFlow;
import java.util.ArrayList;
import java.util.HashMap;

public interface Analysis {
    HashMap<Integer, ArrayList<ArrayList<String>>>getAnalysisSet();
    void updateAnalysisSet(Integer l, ArrayList<ArrayList<String>>nSolution);
    HashMap<Integer,ArrayList<Integer>> getInfl();
    ArrayList<ArrayList<String>> newConstraint(Integer l);
    controlFlow getControlFlowAnalysis();
}
