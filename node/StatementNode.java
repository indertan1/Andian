package beans.node;

import beans.node.AbstractNode;
import beans.node.AssignNode;
import beans.node.ControlNode;

/**
 * Created by antonskripacev on 23.03.17.
 */
public class StatementNode extends AbstractNode {
    //Only one is possible
    AssignNode assign;
    ControlNode control;

    public StatementNode(AssignNode assign, ControlNode control, int typeNode, Class classNode) {
        super(typeNode);
        this.assign = assign;
        this.control = control;
    }
}
