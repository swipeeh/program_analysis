/*
package AbstractSyntaxTree;

import java.util.ArrayList;

public class Node {


    private String nodeValue;
    private String nodeType;
    Node leftNode, rightNode;

    public Node(String value, String type) {
        this.nodeValue = value;
        this.nodeType = type;
        this.leftNode = this.rightNode = null;
    }

    private int nodeData;
    private AbstractSyntaxTree leftNode;
    private AbstractSyntaxTree rightNode;
    private ArrayList<AbstractSyntaxTree> children = new ArrayList<>();
    private AbstractSyntaxTree parent = null;


    public AbstractSyntaxTree(int nodeData) {
        this.nodeData = nodeData;
    }

    // Adds child to parent node and adds it to the list of children
    public AbstractSyntaxTree addChild(AbstractSyntaxTree child) {
         child.setParent(this);
         this.children.add(child);
         return child;
    }

    private void setParent(AbstractSyntaxTree parent) {
        this.parent = parent;
    }

    // Returns parent of the current node from which it is called
    private AbstractSyntaxTree getParent() {
        return parent;
    }

    // Returns value of the node from which it is called
    public int getNodeData() {
        return nodeData;
    }

    // Sets value of node
    public void setNodeData(int data) {
        this.nodeData = data;
    }


}
*/
