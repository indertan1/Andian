package beans.node;



/**
 * Created by antonskripacev on 23.03.17.
 */
public class AssignNode extends AbstractNode {
    LeftNode lNode;
    ExpNode expNode;
    boolean isDeclaration;

    public AssignNode(LeftNode lNode, ExpNode expNode, boolean isDeclaration, int typeNode, Class classNode) {
        super(typeNode);
        this.lNode = lNode;
        this.expNode = expNode;
        this.isDeclaration = isDeclaration;
    }
}
