/*
package AST;

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
    private AST leftNode;
    private AST rightNode;
    private ArrayList<AST> children = new ArrayList<>();
    private AST parent = null;


    public AST(int nodeData) {
        this.nodeData = nodeData;
    }

    // Adds child to parent node and adds it to the list of children
    public AST addChild(AST child) {
         child.setParent(this);
         this.children.add(child);
         return child;
    }

    private void setParent(AST parent) {
        this.parent = parent;
    }

    // Returns parent of the current node from which it is called
    private AST getParent() {
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
