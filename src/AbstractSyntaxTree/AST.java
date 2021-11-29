/*package AbstractSyntaxTree;

import java.util.ArrayList;
import AbstractSyntaxTree.Node;


public class AbstractSyntaxTree {

    private Node root;

    public AbstractSyntaxTree(String nodeValue, String nodeType) {
        root = new Node(nodeValue, nodeType);
    }

    // If no value is passed when creating new node, root is set to null
    public AbstractSyntaxTree() {
        root = null;
    }

    // Driver code
    public static void main(String[] args) {
        AbstractSyntaxTree tree = new AbstractSyntaxTree();

        // Creating the AbstractSyntaxTree for the expression 1 + 2 * 3
        // OBS: When we create the parser, we need to consider precedence of operators, i.e. * and / have precedence over + and -
        // In order to encode the operator precedence in an AbstractSyntaxTree, we need to put what has higher precedence lower in the tree.

     *//*
*/
/*   For instance, consider the following representation of the above expression, which says that * has precedence over +.
          When reading the tree later on, we need to implement a visit() method doing postorder traversal, which means it starts from the bottom up
          which means we read the expression in the correct way and with correct precedence

            +
           / \
          1   *
             / \
            2   3
     *//*
*/
/*
        tree.root = new Node("+", "operator");
        tree.root.leftNode = new Node("1", "numberLiteral");
        tree.root.rightNode = new Node("*", "operator");
        tree.root.rightNode.leftNode = new Node("2", "numberLiteral");
        tree.root.rightNode.rightNode = new Node("3", "numberLiteral");



    }*//*







}
*/