package WorklistAlgorithms;

import Analyses.Analysis;

public class Worklist {

    private String analysisType;
    private Analysis analysis;

    public Worklist(Analysis analysisName, String analysisType) {
        this.analysis = analysisName;
        this.analysisType = analysisType;

    }

}
