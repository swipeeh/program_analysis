package programG;


import java.util.ArrayList;
import java.util.List;
public class controlFlow {
    public List<Edges> edgesList;
    public List<Nodes> nodesList;
    public List<String> varList;

    public controlFlow(List<Edges> edgesList, List<Nodes> nodesList, List<String> varList) {
        this.edgesList = edgesList;
        this.nodesList = nodesList;
        this.varList = varList;
    }

    public void setVarList(List<String> varList) {
        this.varList = varList;
    }

    public int getLastPosition(){
        int last = 0;
        for(Nodes nodes : nodesList){
            if(nodes.getId() > last){
                last = nodes.getId();
            }
        }
        return last;
    }
    public void print(){
        for(Edges edges : this.edgesList){
            //System.out.println(edges.getBeginNode().getId() + "/n" + edges.getEndNode().getId());
        }
    }
}
