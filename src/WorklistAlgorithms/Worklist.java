package WorklistAlgorithms;

import Analyses.Analysis;
import java.util.ArrayList;

public class Worklist {

    //Type for First in First or Last in First Out
    private String analysisType;
    private Analysis analysis;
    public ArrayList<Integer> w;

    public Worklist(Analysis analysisName, String analysisType) {
        this.analysis = analysisName;
        this.analysisType = analysisType;

    }

}
