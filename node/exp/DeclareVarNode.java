package beans.node.exp;

import beans.node.AbstractNode;
import beans.node.StatementNode;
import beans.type.TypeVar;

/**
 * Created by antonskripacev on 31.03.17.
 */
public class DeclareVarNode extends StatementNode {
    public TypeVar type;
    public ExpNode expNode;

    public DeclareVarNode(int typeNode) {
        super(typeNode);
    }
}
