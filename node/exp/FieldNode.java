package beans.node.exp;

import beans.id.StructId;

/**
 * Created by antonskripacev on 03.04.17.
 */
public class FieldNode extends ExpNode {
    String propName;
    StructId parent;

    public FieldNode(int type) {
        super(type);
    }
}
