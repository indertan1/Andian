package beans.node.exp;

import beans.node.exp.ExpNode;
import beans.type.TypeVar;

/**
 * Created by antonskripacev on 31.03.17.
 */
public class StructChildNode extends ExpNode {
    public String name;
    public TypeVar type;

    public StructChildNode(int type) {
        super(type);
    }
}
